import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Grabber50 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Grabber50 extends GrabberTemplate
{
    public Grabber50(){
    GreenfootImage image = getImage();
        image.scale(image.getWidth() - 40, image.getHeight() - 40);
        setImage(image);
    
    }
    int Grab_Speed = -8;
   
    public void act() 
    {
        // Add your action code here.
         setLocation(getX() + Grab_Speed, getY());
    }  
}
