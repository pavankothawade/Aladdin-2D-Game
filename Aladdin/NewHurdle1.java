
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hurdle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NewHurdle1 extends Hurdles
{ 
   int Hur_Speed = -8;
   int Hur_Speed1 = -5;
   public NewHurdle1(){
     GreenfootImage image = getImage();
        image.scale(image.getWidth() - 300, image.getHeight() - 600);
        setImage(image);
    
    
    }
    public void act() 
    {       
       setLocation(getX() + Hur_Speed, getY());



    }    
}
