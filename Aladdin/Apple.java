import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Apple here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Apple extends Actor
{
    /**
     * Act - do whatever the Apple wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     *
     */
        GameOver gameOver = new GameOver();
        Music m1=new Music();
    static int x =  0;
    //  public static boolean music = true;
    public static boolean level_qualified = false;
    public static boolean isPaused = false;
    public void act() 
    {
        
        move(10);
        Actor NewHurdle1=getOneIntersectingObject(NewHurdle1.class);
        Actor ParrotHurdle= getOneIntersectingObject(ParrotHurdle.class);
        Actor SnakeHurdle= getOneIntersectingObject(SnakeHurdle.class);
        Actor Apple= getOneObjectAtOffset(0, 0, Apple.class);
        if(ParrotHurdle != null || SnakeHurdle != null || Apple!= null)
        {
            World myWorld= getWorld();
           // myWorld.removeObject(NewHurdle1);
            myWorld.removeObject(ParrotHurdle);
            myWorld.removeObject(SnakeHurdle);
            myWorld.removeObject(Apple);   
        }
        
        if(NewHurdle1!=null)
        {
            World myWorld= getWorld();
            
                myWorld.removeObject(NewHurdle1);
                
                m1.getMyMusic().stop();
                m1=new Music("level_complete.mp3");
         m1.getMyMusic().play();
                
                gameOver.setImage(new GreenfootImage("Aladdin-2.jpg"));
         
         getWorld().addObject(gameOver, getWorld().getWidth()/2, getWorld().getHeight()/2);
         level_qualified = true;
         
         //Greenfoot.setWorld(new AladdinWorld());
         //music = false;
         Greenfoot.stop();
        
         
            }
           

        }
        
    }
