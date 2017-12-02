import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hurdle2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SnakeHurdle extends Hurdles 
{
    int Hur_Speed2 = -12;
    int Hur_Speed3 = -5;
    public SnakeHurdle(){
    
    GreenfootImage image = getImage();
        image.scale(image.getWidth() - 80, image.getHeight() - 80);
        setImage(image);
    
    }
    
    /**
     * Act - do whatever the Hurdle2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(getX() + Hur_Speed2, getY());
        //setLocation(200 + Hur_Speed2, 100);
       
        
    }    
 
}
