import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AladdinWorld2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AladdinWorld2 extends World
{

    /**
     * Constructor for objects of class AladdinWorld2.
     * 
     */
    
    int counter =0;
    
    public AladdinWorld2()
    {    
        
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
    }
    
    public void act() {
    
        counter ++;
        
      
        
       if(counter % 50 == 0)
        {
           Level2Hurdle P1 = new Level2Hurdle();
           
           GreenfootImage image = P1.getImage();
           //addObject(P1,getWidth(),getHeight()/2 + image.getHeight()/2);
           addObject(P1,779,Greenfoot.getRandomNumber(360));
           addObject(P1,779,Greenfoot.getRandomNumber(100));
           
        }
        
        
         
   
        
    
    }
}
