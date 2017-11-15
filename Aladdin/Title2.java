import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Title2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Title2 extends World
{

    /**
     * Constructor for objects of class Title2.
     * 
     */
    public Title2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.        
        super(500, 275, 1);         
        
        PlayAgain pg = new PlayAgain();           
        NextLevel new_level = new NextLevel(); 
            //GreenfootImage img=G3.getActor().getImage();
            //addObject(g1,getWidth(),50);
            addObject(pg,100,240);
            addObject(new_level,300,240);
    }
}
