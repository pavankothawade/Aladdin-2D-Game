import greenfoot.*;

public class SnakeHurdleFactory implements Creator   
{
     public Actor getActor(){
    return new SnakeHurdle();
    }
}