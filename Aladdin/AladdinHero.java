import greenfoot.*;
public class AladdinHero extends Actor
{
    int counter=0;
    double dy = 0;
    double g = 1.3;
    double speed =-4;
    public static int lives=3;
    public static boolean music = true;
    public static boolean level_qualified = false;
     public static boolean game_over = false;
    public static boolean isPaused = false;
    AladdinState hasLives;
    AladdinState noLives;
    AladdinState aladdinstate;
    int noOfLives=3;
    
    Apple apple= new Apple();
    GreenfootImage i = getImage();
    GameOver gameOver = new GameOver();
    
        Score_increment si = new Score_increment();
   // Subject s = new Subject();
   ScoreData s = new ScoreData();
   Lives_Checker l = new Lives_Checker();

    public AladdinHero(){
        hasLives= new HasLives(this);
        noLives= new NoLives(this);
        aladdinstate= hasLives;
        s.registerObserver(l);
        s.registerObserver(si);
        if(noOfLives == 0){
            aladdinstate= noLives;
        }
    }
    

    void setAladdinState(AladdinState newAladdinState){
        aladdinstate= newAladdinState;
    }
    public AladdinState getHasLivesState(){
        System.out.println("In HasLivesState");
        return hasLives;
        
    } 
    public AladdinState getNoLivesState(){
        System.out.println("In NoLivesState");
        return noLives;
        
    } 

    
    
    public void act() 
    {
        counter ++;
        shootOnCommand();

         
         if(counter %25 == 0)
           {
             //si.update(Counter.score, lives);
             s.dataChanged();
            // Counter.addScore();
           }
         
         if( getOneIntersectingObject(ParrotHurdle.class) != null){
            if(lives<=0)
            {
             DispGameover();
            }
            else
            {
                GreenfootSound myMusic=new GreenfootSound("smb_stomp.wav");
                myMusic.play();
                lives=lives-1;
                getWorld().removeObject(getOneIntersectingObject(ParrotHurdle.class));
                int t = i.getTransparency();
                i.setTransparency(0);
                Greenfoot.delay(5);
                i.setTransparency(t);
                Greenfoot.delay(5);
            }
         }
         if( getOneIntersectingObject(SnakeHurdle.class) != null){
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
                getWorld().removeObject(getOneIntersectingObject(SnakeHurdle.class));
                int t = i.getTransparency();
                i.setTransparency(0);
                Greenfoot.delay(5);
                i.setTransparency(t);
                Greenfoot.delay(5);
            }
        }
        if( getOneIntersectingObject(NewHurdle1.class) != null){
            if(lives<=0)
            {
             DispGameover();
            }
            else
            {
                GreenfootSound myMusic=new GreenfootSound("smb_stomp.wav");
                myMusic.play();
                lives=lives-1;
                getWorld().removeObject(getOneIntersectingObject(ParrotHurdle.class));
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
        }
        
        
       if(Greenfoot.isKeyDown("right")== true)
        {
         setRotation(20); 
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
             Counter.bonusPoints(30);
             getWorld().removeObject(getOneIntersectingObject(Grabber.class));
             //myMusic.stop();
        }
        
        if(getOneIntersectingObject(Grabber50.class) != null){
             Grabber50 b1=new Grabber50();
             if( Music.isMusicPlaying==true)
              {
             GreenfootSound myMusic=new GreenfootSound("smb_fireball.wav");
             myMusic.play();
            }
            b1.incrementScore();
            
            //Counter.bonusPoints(50);
             getWorld().removeObject(getOneIntersectingObject(Grabber50.class));
             //myMusic.stop();
        }
        
        if(getOneIntersectingObject(Grabber100.class) != null){
             Grabber100 b1=new Grabber100();
             if( Music.isMusicPlaying==true)
              {
             GreenfootSound myMusic=new GreenfootSound("smb_fireball.wav");
             myMusic.play();
            }
            b1.incrementScore();
            // Counter.bonusPoints(100);
             getWorld().removeObject(getOneIntersectingObject(Grabber100.class));
             //myMusic.stop();
        }
        
        if(Greenfoot.isKeyDown("space"))
        {
           music = false;
           isPaused = true;
           Greenfoot.stop();  // Pause the game
        } 
        
        dy = dy+g;
        
    }  
    
    
    
    private void DispGameover(){      
         music = false;
         level_qualified = false;
                  game_over=true;
         //Greenfoot.stop();
         Greenfoot.setWorld(new GameOver1());       
         
    }
    
    private void DispLevelQualified(){
        
        
         gameOver.setImage(new GreenfootImage("level_complete.jpg"));
         
         getWorld().addObject(gameOver, getWorld().getWidth()/2, getWorld().getHeight()/2);
         level_qualified = true;
                  game_over=false;
         music = false;
         
        }
    
    
   //to destroy hurdles
    public void shootOnCommand(){
        
        if(Greenfoot.isKeyDown("s"))
        {
            if(Counter.apple_count>0)
        {
            World myWorld= getWorld();
            myWorld.addObject(apple, 0, 0);
            apple.setLocation(getX(), getY());
            Counter.apple_count-=1;
        }
            
        }
        
    }


}