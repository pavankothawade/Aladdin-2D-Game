import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Grabber here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Grabber extends Actor
{
    /**
     * Act - do whatever the Grabber wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int Grab_Speed = -8;
   int Grab_Speed1 = -5;
    public void act() 
    {
        // Add your action code here.
         setLocation(getX() + Grab_Speed, getY());
    }    
}
