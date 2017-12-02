import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public  abstract class GrabberTemplate extends Actor
{
    int Grab_Speed = -8;
    double dy = 0;
    double g = 1.3;
    public final void act() {
    
        setLocation(getX() + Grab_Speed, getY());
        
        if(Greenfoot.isKeyDown("up")== true)
        {
         dy= -4;
        }
        dy = dy+g;
          
        
    } 
    
    public abstract  void incrementScore();
    
}
