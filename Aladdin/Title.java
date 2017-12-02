import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Title here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Title extends World
{

    /**
     * Constructor for objects of class Title.
     * 
     */
    
    /*
    private PlayButton pb;
    private PlayCommand pc;
    private HelpButton hb;
    private HelpCommand hc;
    */
    
    
     public Title()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        //super(1000, 700, 1); 
        super(650, 350, 1, false); 

        /*Start S1 = new Start();
        addObject(S1, getWidth ()/2, getHeight()/2);
        showText("Grab 10 golden coins to complete level 1",50,100);
        Instructions i1 = new Instructions();

        addObject(i1, getWidth ()/4, getHeight()/4); */
        
        showText("Grab 10 golden coins to Complete Level 1",325,325);

        prepare();
    }
  public void act()
    {
        if(Greenfoot.mouseClicked(this)){
        Greenfoot.setWorld(new AladdinWorld());
        }

    }

    private void prepare()
    {
        Start start = new Start();
        addObject(start,315,304);
        ButtonPlay button = new ButtonPlay(start);
        button.execute();
        
        Instructions instructions = new Instructions();
        addObject(instructions,562,93);
        ButtonHelp buttonhelp = new ButtonHelp(instructions);
        buttonhelp.execute();
        
        start.setLocation(340,61);
        start.setLocation(340,61);
        start.setLocation(340,61);
        start.setLocation(340,61);
        start.setLocation(340,61);
        start.setLocation(340,61);
        start.setLocation(340,61);
        start.setLocation(531,63);
        instructions.setLocation(58,79);
        start.setLocation(351,58);
        instructions.setLocation(55,55);
    }
}

