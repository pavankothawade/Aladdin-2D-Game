import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The initital screen visible to user
 * 
 * @author (Team - inferno) 
 * @version (a version number or a date)
 */
public class Start extends Actor
{
    /**
     * Act - do whatever the Start wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     public void act() 
    {
        if (Greenfoot.mouseClicked(this)) {
        Greenfoot.setWorld(new AladdinWorld());
    }
    }    
}
