import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Grabber100 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Grabber100 extends GrabberTemplate
{
    public Grabber100(){
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
