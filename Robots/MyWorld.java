import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.lang.reflect.*;
public class MyWorld extends World
{
    Class[] robotClasses = new Class[]{Michael.class, Bot.class, ARobot.class};
    public MyWorld() throws NoSuchMethodException
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(160, 40, 5); 
        setPaintOrder(Robot.class, Goal.class, Barrier.class);
        init();
    }

    public void init(){
        removeObjects(getObjects(null));
        showText("", getWidth()/2,getHeight()/2);
        initLevel1();
        addBlocks(0.13);
    }

    public void initBoard(){
        addBorder();
        addRobots();
    }

    public void finishRound(Robot winner){
        System.out.println(winner.getClass().getName());
        showText(winner.getClass().getName() + " has won the match...", getWidth()/2,getHeight()/2);
        Greenfoot.delay(250);
        init();
    }

    public void initLevel1(){
        initBoard();
        addEndZone();
    }

    
    public void addRobots(){   
        int added = 0;
        Class[] robots = robotClasses.clone();
        while(added < robots.length){
            Class cls = null;
            int idx = 0;
            while(cls == null){
                idx = (int)(Math.random() * robots.length);    
                cls = robots[idx];
            }
            
            robots[idx] = null;
            try{
                addObject((Robot)cls.newInstance(),  1, 3 + (Greenfoot.getRandomNumber(getHeight()) - 2));

                added++;
            }catch(Exception e){
                System.err.println("Bad class");
            }
        }   
    }

    public void addBorder(){
        for(int x = 0; x < getWidth(); x++){
            addObject(new Barrier(), x, 0);
            addObject(new Barrier(), x, getHeight() - 1);
        }
        for(int y = 0; y < getHeight(); y++){
            addObject(new Barrier(), 0, y);
            addObject(new Barrier(), getWidth() - 1, y);
        }      
    }

    public void addBlocks(double density){
        for(int x = 0; x < getWidth(); x++){
            for(int y = 0; y < getHeight(); y++){
                if(Math.random() < density){
                    addObject(new Barrier(), x, y);
                }
            }
        }
    }

    public void addEndZone(){
        addGoal(getWidth() - 2, 1, 1, getHeight()-2);
    }

    public void addGoal(int sx, int sy, int w, int h){
        for(int x = sx; x < sx+w; x++){
            for(int y = sy; y < sy+h; y++){
                addObject(new Goal(), x, y);
            }
        }

    }

}
