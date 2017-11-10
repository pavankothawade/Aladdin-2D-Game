

public class Score_increment implements Observer
{
        Counter c1 = new Counter();
        public void update(int score, int lives)
        {
            c1.score = c1.score + score;
            //lives is untouched
        }
    
}