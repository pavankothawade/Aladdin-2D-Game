import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOver1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver1 extends World
{
    Music m1=new Music();
    /**
     * Constructor for objects of class GameOver1.
     * 
     */
    public GameOver1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
         m1.getMyMusic().pause();
        m1=new Music("smb_bowserfalls.wav");
         m1.getMyMusic().play();       
        AladdinHero.music = false;
        AladdinHero.level_qualified = false; 
                prepare();
    }
    
    private void prepare()
    {
        PlayAgain playagain2 = new PlayAgain();
        addObject(playagain2,330,217);
        
        //GreenfootSound myMusic=new GreenfootSound("level_complete.mp3");
        //myMusic.play();
    }
}
