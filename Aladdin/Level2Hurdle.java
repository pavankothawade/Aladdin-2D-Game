import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level2Hurdle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level2Hurdle extends Actor
{
    int Hur_Speed2 = -8;
    int Hur_Speed3 = -5;
    public Level2Hurdle(){
    GreenfootImage image = getImage();
        image.scale(image.getWidth() - 80, image.getHeight() - 80);
        setImage(image);
    
    }
    
    /**
     * Act - do whatever the Level2Hurdle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(getX() + Hur_Speed2, getY());
        
    }    
}
