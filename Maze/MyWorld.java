import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    static final int w = 39;
    static final int h = 39;
    static final int bd = 10;
    int x, y;
    int ox, oy;
    int steps = 0;
    byte tried = 0;
    boolean robotAdded = false;
    List<int[]> backTrack = new ArrayList<int[]>();
    List<Integer> dirs = new ArrayList<Integer>();
    List<Integer> rdirs = new ArrayList<Integer>();
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(w,h,bd);
        for(y = 0; y < h; y++){
            for(x = 0; x < w; x++){
                addObject(new Barrier(bd), x, y);
            }
        }
        x = 1;
        y = 1;
        for(int d = 0; d < 4; d++){
            dirs.add(new Integer(d));
        }
        rdirs.clear();
        rdirs.add(new Integer(1));
        rdirs.add(new Integer(3));
        removeObjects(getObjectsAt(x,y, Barrier.class));
        addObject(new Goal(bd), w-2,h-2);

        // addObject(new PathFinder(bd), 1,1);
    }

    public void act(){
        if(steps == 0 || backTrack.size() > 0 ){
            path();
            steps++;
        }else if (backTrack.size() == 0 && !robotAdded){
            robotAdded = true;
            //addObject(new Wanderer(bd), 1,1); 
            addObject(new Wanderer(bd), 1,1); //<<<<<< Change this to your robot.

        }
        System.out.println(steps);
    }

    public void path(){
        int nx = x;
        int ny = y;
        int dx = 0;
        int dy = 0;
        Integer dir = rdirs.get(Greenfoot.getRandomNumber(rdirs.size()));
        rdirs.remove(dir);
        switch(dir){
            case 0:
            dx = -1;
            break;  
            case 1:
            dx = 1;
            break;
            case 2:
            dy = -1;
            break;
            case 3:
            dy = 1;
            break;
        }
        nx = x + (dx*2);
        ny = y + (dy*2);
        List<Barrier> nextSpot = getObjectsAt(nx, ny, Barrier.class);
        if(nextSpot.size() > 0 && nx > 0 && ny > 0 && nx < w-1 && ny < h-1){
            backTrack.add(new int[] {x, y});
            x = nx;
            y = ny;
            removeObjects(getObjectsAt(x-dx, y-dy, Barrier.class));
            removeObjects(getObjectsAt(x, y, Barrier.class));   
            rdirs.addAll(dirs);
        } else if (rdirs.size() == 0){
            int[] ol = backTrack.remove(backTrack.size() - 1);
            x = ol[0];
            y = ol[1];
            rdirs.addAll(dirs);
        }

    }

    public void win(Robot b){
        showText("You win!", 10,10);
    }
}