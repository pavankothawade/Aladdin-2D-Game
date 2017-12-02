/**
 * Write a description of class ButtonPlay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ButtonHelp  
{
    // instance variables - replace the example below with your own
    private int x;
    private Instructions instruction;
    /**
     * Constructor for objects of class ButtonPlay
     */
    public ButtonHelp(Instructions instruction)
    {
        this.instruction = instruction;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void execute()
    {
       instruction.act();
    }
}