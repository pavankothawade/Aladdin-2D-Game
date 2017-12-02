import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Grabber100 extends GrabberTemplate
{
    public Grabber100(){
    GreenfootImage image = getImage();
        image.scale(image.getWidth() - 40, image.getHeight() - 40);
        setImage(image);
    }

    public void incrementScore()
    {
        Counter.bonusPoints(100);
    }
}
