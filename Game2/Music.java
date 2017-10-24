import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Music here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Music extends Actor
{
    GreenfootSound myMusic=new GreenfootSound("Game_of_Thrones(HBO).mp3");
    boolean firstTurn=true;
    /**
     * Act - do whatever the Music wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(firstTurn)
        {
            myMusic.playLoop();
            firstTurn=false;
        }
		
        if(Aladdin.music == false)
        {
            myMusic.pause();
            Aladdin.music = true;
        }

        if(Greenfoot.mouseClicked(this))
        {
            if(myMusic.isPlaying())
            {
            myMusic.pause();
            setImage("play.png");
            }
            else
            {
                myMusic.playLoop();
                setImage("pause.png");
            }
        }
        if(Greenfoot.)
    }    
}
