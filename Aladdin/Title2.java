import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Title2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Title2 extends World
{
      Music m1=new Music();
    /**
     * Constructor for objects of class Title2.
     * 
     */
    public Title2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.        
        super(650, 350, 1, false); 
        
         m1.getMyMusic().pause();
        m1=new Music("level_complete.mp3");
         m1.getMyMusic().play();
          AladdinHero.level_qualified = true;        
        AladdinHero.music = false; 
        AladdinHero.game_over = false; 
        PlayAgain pg = new PlayAgain();           
        NextLevel new_level = new NextLevel(); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        PlayAgain playagain2 = new PlayAgain();
        addObject(playagain2,139,317);
        NextLevel nextlevel = new NextLevel();
        addObject(nextlevel,503,323);
        nextlevel.setLocation(498,317);
        
        //GreenfootSound myMusic=new GreenfootSound("level_complete.mp3");
        //myMusic.play();
    }
    
    public void act()
    {
        //AladdinHero.level_qualified = true;        
        //AladdinHero.music = false;        
        
    }
}
