import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Background2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Background2 extends Actor
{ 
    
     public void act() 
    {
        // Add your action code here.
    }    
       public void scroll()
    {
    if( getX() < -getImage().getWidth()/2){
    setLocation( getWorld().getWidth() + 300, getY());
    }
    setLocation(getX()-8, getY());
    }
}
