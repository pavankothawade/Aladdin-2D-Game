/**
 * Write a description of class ScoreData here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import java.util.Iterator;

class ScoreData implements Subject
{
    
    int score;
    int lives;
    
    ArrayList<Observer> observerList;
 
    public ScoreData() {
        observerList = new ArrayList<Observer>();
    }
 
    @Override
    public void registerObserver(Observer o) {
        observerList.add(o);    
    }
 
        @Override
    public void unregisterObserver(Observer o) {
        observerList.remove(observerList.indexOf(o));
    }
 
    @Override
    public void notifyObservers()
    {
        for (Iterator<Observer> it =
              observerList.iterator(); it.hasNext();)
        {
            Observer o = it.next();
            o.update();
        }
    }
 
    
    private int getLives()
    {
        // return 90 for simplicity
        return 90;
    }
 
    
    private int getScore()
    {
        // return 2 for simplicity
        return 2;
    }

 
    // This method is used update displays
    // when data changes
    public void dataChanged()
    {
        //get latest data
        lives = getLives();
        score = getScore();
       
 
        notifyObservers();
    }
}