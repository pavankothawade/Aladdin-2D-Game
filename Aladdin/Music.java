import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Music here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Music extends Actor
{
    public static boolean isMusicPlaying=true;
    GreenfootSound myMusic=new GreenfootSound("background.mp3");
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
            myMusic=new GreenfootSound("smb_bowserfalls.wav");
            myMusic.play();
            Aladdin.music = true;
        }
        
        if(Aladdin.level_qualified == true)
        {
            if( isMusicPlaying==true)
            {
            myMusic.pause();
            myMusic=new GreenfootSound("level_complete.mp3");
            myMusic.play();
            Aladdin.music = true;
            Aladdin.level_qualified = false;
        }
        }

        if(Greenfoot.mouseClicked(this))
        {

            if(myMusic.isPlaying())
            {
                isMusicPlaying=false;
                myMusic.pause();
                setImage("mute.png");
            }
            else
            {
                isMusicPlaying=true;
                myMusic.playLoop();
                setImage("unmute.png");
            }
        }
    }    
}
