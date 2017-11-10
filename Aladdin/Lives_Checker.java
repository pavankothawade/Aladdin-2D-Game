/**
 * Write a description of class Lives_Checker here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lives_Checker implements Observer 
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Lives_Checker
     */
    public Lives_Checker()
    {
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
	 Counter c1=  new Counter();
    public void update(int score,int live)
	{
		if(lives < 0)
		{
			DispGameover();
		}
		
	}
}
