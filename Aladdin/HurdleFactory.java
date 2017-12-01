import greenfoot.*;

public class HurdleFactory implements Creator   
{
     public Actor getActor(){
    return new Hurdle();
    }
}
