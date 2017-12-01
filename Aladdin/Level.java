import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level extends World
{
    private int level;
 
    public Level()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
    }
    
    public Level(int lvl)
{
    this();
    level = lvl;
    switch (level)
    {
        case 1:
        break;
         
        case 2:
        break;
         
        //and so on
}

 
}
}
