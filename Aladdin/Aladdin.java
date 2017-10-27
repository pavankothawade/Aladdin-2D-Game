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
    
    public static boolean music = true;
    public static boolean level_qualified = false;
    public static boolean isPaused = false;
    //Counter counter1 = AladdinWorld.getCounter();
    public void act() 
    {
        
        if( getOneIntersectingObject(Hurdle.class) != null){
        DispGameover();
        }
        if( getOneIntersectingObject(Hurdle2.class) != null){
        DispGameover();
        }
        setLocation(getX(),(int)(getY()+dy));
        
        if(Greenfoot.isKeyDown("up")== true)
        {
         dy= speed;
         Counter.addScore();
        }
        
        
       if(Greenfoot.isKeyDown("right")== true)
        {
         setRotation(20);
         Counter.addScore();
        } 
        
        if(Greenfoot.isKeyDown("left")== true)
        {
        setRotation(-20);        
        } 
        
        if(getY()<16){
            DispGameover();
        }
        if(getY() > getWorld().getHeight()){
        DispGameover();
        }
        
        if(getOneIntersectingObject(Grabber.class) != null){
             
             GreenfootSound myMusic=new GreenfootSound("smb_fireball.wav");
             myMusic.play();
             Counter.bonusPoints();
             getWorld().removeObject(getOneIntersectingObject(Grabber.class));
             //myMusic.stop();
        }
        
        if(Greenfoot.isKeyDown("space"))
        {
           music = false;
           isPaused = true;
           Greenfoot.stop();  // Pause the game
        } 
        
          if( Counter.gameOver_counter==15){
        DispLevelQualified();
        }
          dy = dy+g;
  
    }  
    
    private void DispGameover(){
       
         GameOver gameOver = new GameOver();
         getWorld().addObject(gameOver, getWorld().getWidth()/2, getWorld().getHeight()/2);
         music = false;
         Greenfoot.stop();
    }
    
    private void DispLevelQualified(){
       
         GameOver gameOver = new GameOver();
         gameOver.setImage(new GreenfootImage("level_complete.jpg"));
         getWorld().addObject(gameOver, getWorld().getWidth()/2, getWorld().getHeight()/2);
         level_qualified = true;;
         Greenfoot.stop();
    }

}