import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AladdinWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AladdinWorld extends World
{
     int counter =0;
    /**
     * Constructor for objects of class AladdinWorld.
     * 
     */
    public AladdinWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false); 
        
        Aladdin B1 = new Aladdin();
        addObject(B1,100,getHeight()/2);
      
    }
    
      
    public void act() {
    
        counter ++;
        
        if(counter % 50 == 0)
        {
           Hurdle P1 = new Hurdle();
           
           GreenfootImage image = P1.getImage();
           addObject(P1,getWidth(),getHeight()/2 + image.getHeight()/2);
           
           
           
           
           
           
           
        }
        
        
   
        
    
    }
}

