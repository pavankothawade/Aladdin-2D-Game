import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Background image
 * 
 * @author (team inferno) 
 * @version ( 0.7)
 */
public class Background extends Actor
{
    /**
     * Act - do whatever the Background wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
       public void scroll()
    {
    if( getX() < -getImage().getWidth()/2){
    setLocation( getWorld().getWidth() + 300, getY());
    }
    setLocation(getX()-5, getY());
    }
}
