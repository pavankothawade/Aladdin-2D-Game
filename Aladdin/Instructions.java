import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Instructions here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Instructions extends Actor
{
    /**
     * Act - do whatever the Instructions wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
      public Instructions(){
    GreenfootImage image = getImage();
        image.scale(image.getWidth() - 100, image.getHeight() - 100);
        setImage(image);
        
    
    }
    public void act() 
    {
         if (Greenfoot.mouseClicked(this)) {
        Greenfoot.setWorld(new InstructionWorld());
        
    }
   
      
    // Add your action code here.
      
}
}
