import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.lang.reflect.*;
public class MyWorld extends World
{
    Class[] robotClasses = new Class[]{Tracker.class};
    public MyWorld() throws NoSuchMethodException
    {    
        super(Greenfoot.getRandomNumber(10)+30, Greenfoot.getRandomNumber(10)+30, 5); 
        setPaintOrder(Robot.class, Goal.class, Barrier.class);
        init();
    }

    public void init(){
        removeObjects(getObjects(null));
        showText("", getWidth()/2,getHeight()/2);
        initBoard();
        initLevel3();
    }

    public void initBoard(){
        addBorder();
        addRobots(true);
    }

    public void finishRound(Robot winner){
        System.out.println(winner.getClass().getName());
        showText(winner.getClass().getName() + " wins!!", getWidth()/2,getHeight()/2);
        Greenfoot.delay(250);
        init();
    }

    public void initLevel1(){
        initBoard();
        addEndZone();
    }

    public void initLevel2(){
        initBoard();
        for(int i = 0; i < 1; i++){
            int x = Greenfoot.getRandomNumber(getWidth() - 10) + 5;
            int y = Greenfoot.getRandomNumber(getHeight() - 10) + 5;
            removeObjects(getObjectsAt(x, y, null));
            addObject(new Goal(), x, y);
        }
    }

    public void initLevel3(){
        int roomD = 10;
        int r1x = 5 + Greenfoot.getRandomNumber(getWidth() - 20);
        int r1y = 5 + Greenfoot.getRandomNumber(getHeight() - 20);
        addRoom(r1x, r1y, roomD, roomD);
        int gx = r1x + 1 + Greenfoot.getRandomNumber(roomD - 1);
        int gy = r1y + 1 + Greenfoot.getRandomNumber(roomD - 1);
        addGoal(gx, gy, 1, 1);

    }

    public void addRobots(boolean scatter){   
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
                int x = scatter ? ( Math.random() > 0.5 ? 1 : getWidth() - 2 ) : 1;
                addObject((Robot)cls.newInstance(),  x, (Greenfoot.getRandomNumber(getHeight() - 4)+2));

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
        for(int x = 3; x < getWidth(); x++){
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

    public void addHWall(int x, int y, int l){
        while(l-- > 0){
            addObject(new Barrier(), x++, y);
        }
    }

    public void addVWall(int x, int y, int h){
        while(h-- > 0){
            addObject(new Barrier(), x, y++);

        }
    }

    public void addVGapWall(int x, int gSt, int gSp){
        addVWall(x, 0, gSt);
        addVWall(x, gSp , getHeight()-2);
        for(int y = gSt; y < gSp; y++){
            removeObjects(getObjectsAt(x-1, y, null));
            removeObjects(getObjectsAt(x+1, y, null));
        }
    }

    public void addVGapWall(int x){
        int gap = 1+Greenfoot.getRandomNumber(getHeight() - 2);
        addVGapWall(x, gap, gap + 1);
    }

    public void addRoom(int x, int y, int w, int h){
        for(int bx = x; bx <= x+w; bx++){
            for(int by = y; by <= y+h; by++){
                if((bx == x || bx == x + w) ||(by == y || by == y + h)){
                    addObject(new Barrier(), bx, by);
                }

            }
        }
        int side = Greenfoot.getRandomNumber(4);
        switch(side){
            case 0:
            removeObjects(getObjectsAt(x+(w/2), y, Barrier.class));
            break;
            case 1:
            removeObjects(getObjectsAt(x+(w/2), y+h, Barrier.class));
            break;
            case 2:
            removeObjects(getObjectsAt(x, y+(h/2), Barrier.class));
            break;
            case 3:
            removeObjects(getObjectsAt(x+w, y+(h/2), Barrier.class));
            break;

        }

    }
}