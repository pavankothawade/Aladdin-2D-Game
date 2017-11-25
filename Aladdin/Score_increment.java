

public class Score_increment implements Observer
{
        Counter c1 = new Counter();
        public void update()
        {
            c1.score = c1.score + 1;
            //lives is untouched
        }
    
}