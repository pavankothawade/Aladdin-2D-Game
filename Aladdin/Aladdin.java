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
    int counter=0;
    
    double dy = 0;
    double g = 1.3;
    double speed =-4;
    public static int lives=3;
    
    public static boolean music = true;
    public static boolean level_qualified = false;
    public static boolean isPaused = false;
    Apple apple= new Apple();
    //Counter counter1 = AladdinWorld.getCounter();
    public void act() 
    {
        
        counter ++;
         
         if(counter %25 == 0)
         {
             Counter.addScore();
           
       }
         
        
        
        
        
        shootOnCommand();

        if( getOneIntersectingObject(Hurdle.class) != null){
            if(lives<=0)
            {
            DispGameover();
            }
            else
            {
                GreenfootSound myMusic=new GreenfootSound("smb_stomp.wav");
                myMusic.play();
                lives=lives-1;
                getWorld().removeObject(getOneIntersectingObject(Hurdle.class));
                
                 GreenfootImage i = getImage();
       int t = i.getTransparency();
       i.setTransparency(0);
       Greenfoot.delay(5);
       i.setTransparency(t);
       Greenfoot.delay(5);
                
            }
        }
        if( getOneIntersectingObject(Hurdle2.class) != null){
//        DispGameover();
            if(lives<=0)
            {
            DispGameover();
            }
            else
            {
                if( Music.isMusicPlaying==true)
                 {
                GreenfootSound myMusic=new GreenfootSound("smb_stomp.wav");
                myMusic.play();
            }
                lives=lives-1;
                getWorld().removeObject(getOneIntersectingObject(Hurdle2.class));
                
                 GreenfootImage i = getImage();
       int t = i.getTransparency();
       i.setTransparency(0);
       Greenfoot.delay(5);
       i.setTransparency(t);
       Greenfoot.delay(5);
            }
        }
        setLocation(getX(),(int)(getY()+dy));
        
        if(Greenfoot.isKeyDown("up")== true)
        {
         dy= speed;
        // Counter.addScore();
        }
        
        
       if(Greenfoot.isKeyDown("right")== true)
        {
         setRotation(20);
         //Counter.addScore();
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
             
             if( Music.isMusicPlaying==true)
              {
             GreenfootSound myMusic=new GreenfootSound("smb_fireball.wav");
             myMusic.play();
            }
             Counter.bonusPoints(1);
             getWorld().removeObject(getOneIntersectingObject(Grabber.class));
             //myMusic.stop();
        }
        
        if(Greenfoot.isKeyDown("space"))
        {
           music = false;
           isPaused = true;
           Greenfoot.stop();  // Pause the game
        } 
        
       //   if( Counter.gameOver_counter==10){
      //Greenfoot.setWorld(new AladdinWorld2());         
              //  DispLevelQualified();
       // }
          dy = dy+g;  
    }  
    
    private void DispGameover(){
       
         GameOver gameOver = new GameOver();
         getWorld().addObject(gameOver, getWorld().getWidth()/2, getWorld().getHeight()/2);
         Counter cnt=new Counter();
         setImage(new GreenfootImage("Score : "+cnt.score +"    Coins:"+cnt.gameOver_counter+ "    Lives: "+Aladdin.lives, 22, Color.WHITE, Color.BLACK));
         music = false;
         Greenfoot.stop();
    }
    
    private void DispLevelQualified(){
       
         GameOver gameOver = new GameOver();
         gameOver.setImage(new GreenfootImage("level_complete.jpg"));
         getWorld().addObject(gameOver, getWorld().getWidth()/2, getWorld().getHeight()/2);
         
         level_qualified = true;
         music = false;
         Greenfoot.stop();
    }
    
   //to destroy hurdles
    public void shootOnCommand(){
        if(Greenfoot.isKeyDown("s"))
        {
            World myWorld= getWorld();
            myWorld.addObject(apple, 0, 0);
            apple.setLocation(getX(), getY());
            
            
        }
        
    }


}