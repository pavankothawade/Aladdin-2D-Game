import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Title here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Title extends World
{

    /**
     * Constructor for objects of class Title.
     * 
     */
    public Title()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 700, 1); 
        Greenfoot.start();
        Start S1 = new Start();
        addObject(S1,200,getHeight()/2-200);
                showText("Grab 10 golden coins to complete level 1",500,630);
        
    }
    public void act()
    {
        //if (Greenfoot.isKeyDown("space")) Greenfoot.setWorld(new AladdinWorld());
         //if(Greenfoot.isMouseClick(This())) Greenfoot.setWorld(new AladdinWorld());public void act() 
         
}
//setImage(new GreenfootImage("Start Game : ", 22,Color.WHITE, Color.BLACK));
    //new GreenfootImage("Score : ", 22, Color.WHITE, Color.BLACK);


}