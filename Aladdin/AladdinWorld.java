import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AladdinWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AladdinWorld extends World
{
    
     int counter = 0;
     private Background img0, img1;
      Counter counter1 = new Counter();
      GameOver gameOver = new GameOver();
      Music m1=new Music();
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
        AladdinHero B1 = new AladdinHero();
        addObject(B1,100,getHeight()/2);
        addObject(counter1,220,20);
        
        addObject(m1,getWidth()-20,20);
        Counter.setStartScore();
        
        m1.getMyMusic().stop();
        m1=new Music("background.mp3");
        m1.getMyMusic().play();
                AladdinHero.level_qualified = false; 
                        AladdinHero.game_over = false; 

    }
   
    public Counter getCounter()
    {
        return counter1;
    }
    
      
    public void act() {
    
        counter++;
        
        img0.scroll();
        img1.scroll();
        
        
       if(counter % 50 == 0)
        {
          // Hurdle P1 = new Hurdle();
          Creator P1 = new ParrotHurdleFactory();
    
           
         GreenfootImage image = P1.getActor().getImage();
           //addObject(P1,getWidth(),getHeight()/2 + image.getHeight()/2);
           addObject(P1.getActor(),779,Greenfoot.getRandomNumber(360));
           addObject(P1.getActor(),779,Greenfoot.getRandomNumber(100));
             
          // Hurdle2 P2 = new Hurdle2();
          Creator P2 = new SnakeHurdleFactory();
                          
           addObject(P2.getActor(),900,Greenfoot.getRandomNumber(360));
           addObject(P2.getActor(),900,Greenfoot.getRandomNumber(100));  
        }
        
        
         if(counter %30 == 0)
        {
           // Grabber g1=new Grabber();
           Creator G1 = new GrabberFactory();
           
            GreenfootImage img=G1.getActor().getImage();
            //addObject(g1,getWidth(),50);
            addObject(G1.getActor(),669,Greenfoot.getRandomNumber(260));
        }
        
        
        /* if(counter %75 == 0)
        {
             
           Creator G2 = new GrabberFactory();
           
            GreenfootImage img=G2.getActor().getImage();
            //addObject(g1,getWidth(),50);
            addObject(G2.getActor(),800,Greenfoot.getRandomNumber(100));
        }*/
   
        if(counter %100 == 0)
        {
             
           Creator G3 = new GrabberFactory(50);
           
            GreenfootImage img=G3.getActor().getImage();
            //addObject(g1,getWidth(),50);
            addObject(G3.getActor(),700,Greenfoot.getRandomNumber(300));
        }
        
        if(counter %150 == 0)
        {
             
           Creator G3 = new GrabberFactory(100);
           
            GreenfootImage img=G3.getActor().getImage();
            //addObject(g1,getWidth(),50);
            addObject(G3.getActor(),700,Greenfoot.getRandomNumber(100));
        }
        
        if(Counter.gameOver_counter >= 10)
        {
             m1.getMyMusic().pause();
            AladdinHero.level_qualified = true;        
           AladdinHero.music = false;
            DispLevelQualified();
        }
    }
    
     private void DispLevelQualified(){
        Greenfoot.setWorld(new Title2());
        }
}

