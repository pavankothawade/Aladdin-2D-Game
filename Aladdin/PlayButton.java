import greenfoot.*;
/**
 * Write a description of class PlayButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayButton extends Button implements Invoker  
{
    // instance variables - replace the example below with your own
    private Command PlayCommand;
    public PlayButton(String title){
    
        
    
    }
   
    public void invoke()
    {
         if(Greenfoot.mouseClicked(this))
         PlayCommand.execute();
    }
     public void setCommand(Command c)
     {
          this.PlayCommand=c;
        }
}
