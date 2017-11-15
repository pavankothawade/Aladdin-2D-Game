import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
//import java.awt.Color;

/**
 * Counter deals with the scoreboard of the game
 * 
 * @author (Team-inferno) 
 * @version (a version number or a date)
 */
public class Counter extends Actor
{
    /**
     * Act - do whatever the Counter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public static int score = 0;
        public static int gameOver_counter = 0;
        public static int apple_count = 0;
    public void act() 
    {
        // Add your action code here.
        setImage(new GreenfootImage("    Apple_count: "+apple_count+ "Score : "+score +"    Coins:"+gameOver_counter+ "    Lives: "+AladdinHero.lives, 22, Color.WHITE, Color.BLACK));
        //setImage(new GreenfootImage("Grabber : "+gameOver_counter , 20, Color.WHITE, Color.BLACK));
    }    
    
    public static void addScore()
    {
                score += 1;
    }
    
    public static void bonusPoints(int points)
    {
        score = score + points;
        if(points!=50 ||points!=100)
        {   
            gameOver_counter+=1;
        }
        
        if(points==50)
        {
            apple_count+=1;
        }
     //   Counter.act();
    }
    
    public static void setStartScore()
    {
        score = 0;
        gameOver_counter=0;
        apple_count=0;
        AladdinHero.lives=3;
    }
    
}
