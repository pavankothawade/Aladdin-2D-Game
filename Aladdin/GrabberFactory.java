import greenfoot.*;

public class GrabberFactory extends Creator   
{
    private String type="";
    public GrabberFactory()
    {
        
    }
    
    public GrabberFactory(int type)
    {
        if(type==50)
        {
            this.type="Type1";
        }
        else if(type==100)
        {
            this.type="Type2";
        }
    }
     public Actor getActor(){
         if(this.type == "Type1")
         return new Grabber50();
         else if(this.type == "Type2")
         return new Grabber100();
         else
         return new Grabber();
 
    }
}

