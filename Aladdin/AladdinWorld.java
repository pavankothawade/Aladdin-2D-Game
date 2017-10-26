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
     private Background img0, img1;
      Counter counter1 = new Counter();
      
    /**
     * Constructor for objects of class     AladdinWorld.
     * 
     */
    public AladdinWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(650, 350, 1, false); 
        img0 = new Background();
        addObject(img0, getWidth ()/2, getHeight()/2);
        img1 = new Background();
        addObject(img1, getWidth() + getWidth()/2, getHeight()/2);
        Aladdin B1 = new Aladdin();
        addObject(B1,100,getHeight()/2);
        addObject(counter1,40,20);
        Music m1=new Music();
        addObject(m1,getWidth()-20,20);
              Counter.setStartScore();
    }
   
    public Counter getCounter()
    {
        return counter1;
    }
    
      
    public void act() {
    
        counter ++;
        
        img0.scroll();
        img1.scroll();
        
        
       if(counter % 50 == 0)
        {
           Hurdle P1 = new Hurdle();
           
           GreenfootImage image = P1.getImage();
           //addObject(P1,getWidth(),getHeight()/2 + image.getHeight()/2);
           addObject(P1,779,Greenfoot.getRandomNumber(360));
           addObject(P1,779,Greenfoot.getRandomNumber(100));
             Hurdle2 P2 = new Hurdle2();
             
             
           addObject(P2,900,Greenfoot.getRandomNumber(360));
           addObject(P2,900,Greenfoot.getRandomNumber(100));
           
           
           
 
           
           
        }
        
        
         if(counter %30 ==0)
        {
            Grabber g1=new Grabber();
            GreenfootImage img=g1.getImage();
            addObject(g1,getWidth(),50);
        }
        
        /*if(counter % 235==0)
        {
            Hurdle P4=new Hurdle();
            GreenfootImage image =P4.getImage();
            addObject(P4,getWidth(),100);
        }
        */
   
        
    
    }
}

