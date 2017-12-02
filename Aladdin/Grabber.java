import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Grabber here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Grabber extends GrabberTemplate
{
    /**
     * Act - do whatever the Grabber wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Grabber(){
    GreenfootImage image = getImage();
        image.scale(image.getWidth() - 40, image.getHeight() - 40);
        setImage(image);
    
    }
    public  void incrementScore()
    {
        Counter.bonusPoints(30);
    }
    int Grab_Speed = -8;
   /*
    public void act() 
    {
        // Add your action code here.
         setLocation(getX() + Grab_Speed, getY());
    } 
    */
}
