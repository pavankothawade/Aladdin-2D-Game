import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Start here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nextlevel extends Actor
{
    /**
     * Act - do whatever the Start wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
      //setImage(new GreenfootImage("Collect more than 15 grabbers to complete level 1 and avoid the hurdles : ", 22, Color.WHITE, Color.BLACK));
        if (Greenfoot.isKeyDown("x")) {
        Greenfoot.setWorld(new Title2());
        //setImage(new GreenfootImage("Collect more than 15 grabbers to complete level 1 and avoid the hurdles : ", 22, Color.WHITE, Color.BLACK));
    }
    }    
}
