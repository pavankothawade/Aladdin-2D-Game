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
     */
    public void act() 
    {
        
        move(10);
        Actor Hurdle= getOneIntersectingObject(Hurdle.class);
       
        if(Hurdle != null)
        {
            World myWorld= getWorld();
            myWorld.removeObject(Hurdle);
            
        }
        Actor Hurdle2= getOneIntersectingObject(Hurdle2.class);
        if(Hurdle2 != null)
        {
            World myWorld= getWorld();
            myWorld.removeObject(Hurdle2);
            
        }

    }    
}
