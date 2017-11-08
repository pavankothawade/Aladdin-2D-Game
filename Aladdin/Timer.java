import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Timer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Timer extends Actor
{
    private int MAX;
    private int seconds;
    
    public Timer (int sec) { 
        MAX = sec; 
        seconds = 0; 

    }
    
    public void count () { 
        if (this.seconds < MAX) 
            this.seconds++; 
    }
    
    public void reset () { 
        seconds = 0; 
    }
    
    public double getCount () { 
        double sec = this.seconds;
        sec = sec / 100; 
        return (sec);
    }
    
    public void act() 
    {
       count(); 
       //System.out.println(getCount()); 
    }  
}
