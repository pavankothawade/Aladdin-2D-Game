import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Back here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Back extends Actor
{
    
      public Back(){
    GreenfootImage image = getImage();
        image.scale(image.getWidth() - 150, image.getHeight() - 150);
        setImage(image);
    
    }
    /**
     * Act - do whatever the Back wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
                 if (Greenfoot.mouseClicked(this)) {
                     Greenfoot.setWorld(new Title());
    }    
}
}
