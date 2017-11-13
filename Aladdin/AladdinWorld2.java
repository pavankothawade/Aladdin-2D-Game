import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
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
     private Background2 img2, img3;
    
    public AladdinWorld2()
    {    
        super(650, 350, 1, false); 
        img2 = new Background2();
        addObject(img2, getWidth ()/2, getHeight()/2);
        img3 = new Background2();
        addObject(img3, getWidth() + getWidth()/2, getHeight()/2);
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
      
        Greenfoot.start();
        AladdinHero a=new AladdinHero();
        addObject(a,200,200);
    }
    
    public void act() {
    
        counter ++;
        img2.scroll();
        img3.scroll();
       
      
        
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
