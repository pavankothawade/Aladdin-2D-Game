import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hurdle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ParrotHurdle extends Hurdles
{ 
   int Hur_Speed = -12;
   int Hur_Speed1 = -5;
    public void act() 
    {       
       setLocation(getX() + Hur_Speed, getY());



    }    
}
