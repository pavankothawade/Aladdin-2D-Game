/**
 * Write a description of class Subject here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public interface Subject  
{
    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
   // public  void attach(Observer obj);
   // public  void detach(Observer obj);
//    public  void notifyObservers(int score);
        public void registerObserver(Observer o);
    public void unregisterObserver(Observer o);
    public  void notifyObservers();
    
}
