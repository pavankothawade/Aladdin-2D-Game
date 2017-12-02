import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

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
         setLocation(getX() + Grab_Speed, getY());
    }      
    
    public void incrementScore()
    {
        Counter.bonusPoints(100);
    }
}
