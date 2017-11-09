import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Apple here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Apple extends Actor
{
    /**
     * Act - do whatever the Apple wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     *
     */
  
    public void act() 
    {
        
        move(10);
        Actor ParrotHurdle= getOneIntersectingObject(ParrotHurdle.class);
        Actor SnakeHurdle= getOneIntersectingObject(SnakeHurdle.class);
        Actor Apple= getOneObjectAtOffset(0, 0, Apple.class);
        if(ParrotHurdle != null || SnakeHurdle != null || Apple!= null)
        {
            World myWorld= getWorld();
            myWorld.removeObject(ParrotHurdle);
            myWorld.removeObject(SnakeHurdle);
            myWorld.removeObject(Apple);
            
        }
        
        
    }    
}
