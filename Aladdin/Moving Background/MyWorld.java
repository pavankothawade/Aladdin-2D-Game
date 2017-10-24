import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private Background img0, img1;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(650, 350, 1, false); 
        img0 = new Background();
        addObject(img0, getWidth ()/2, getHeight()/2);
        
        img1 = new Background();
        addObject(img1, getWidth() + getWidth()/2, getHeight()/2);
    }
    public void act()
    {
     if(Greenfoot.isKeyDown("right")){
        img0.scroll();
        img1.scroll();
        }
     
    }
}
