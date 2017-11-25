/**
 * 
 * logic of lives checker in future scope
 * Write a description of class Lives_Checker here.
 * @author (your name) 
 * @version (a version number or a date)
 */
import greenfoot.*;
public class Lives_Checker implements Observer 
{
    // instance variables - replace the example below with your own
    private int x;
    int live = 0;

    /**
     * Constructor for objects of class Lives_Checker
     */
    public Lives_Checker()
    {
    }

    /**Here this observer checks how many lives are remaining. 
     * if no lives are remaining the game stops
     */
     Counter c1=  new Counter();

    public void update()
    {
        if(live < 0)
		{
		    DispGameover();
		}
	}
	
	private void DispGameover(){
	     
         Greenfoot.stop();
    }
}
