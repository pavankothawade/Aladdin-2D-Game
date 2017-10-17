import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Aladdin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Aladdin extends Actor
{
    /**
     * Act - do whatever the Aladdin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    double dy = 0;
    double g = 1.3;
    double speed =-4;
    public void act() 
    {
        
        if( getOneIntersectingObject(Hurdle.class) != null){
        DispGameover();
        }
        
        setLocation(getX(),(int)(getY()+dy));
        
        if(Greenfoot.isKeyDown("up")== true)
        {
         dy= speed;
        }
        
        
       if(Greenfoot.isKeyDown("right")== true)
        {
         setRotation(10);
        } 
        
        if(Greenfoot.isKeyDown("left")== true)
        {
        setRotation(-10);
        } 
        
        if(getY() > getWorld().getHeight()){
        DispGameover();
        }
          dy = dy+g;
  
    }  
    
    private void DispGameover(){
       
         GameOver gameOver = new GameOver();
         getWorld().addObject(gameOver, getWorld().getWidth()/2, getWorld().getHeight()/2);
         Greenfoot.stop();
        
    
    }

}