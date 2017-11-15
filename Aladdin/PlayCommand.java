/**
 * Write a description of class PlayCommand here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayCommand implements Command
{
    // instance variables - replace the example below with your own
    private Receiver r;
    public void setReceiver(Receiver r1){
     this.r=r1;
    
   }
   public void execute(){
    this.r.doAction();
    
    }
}
