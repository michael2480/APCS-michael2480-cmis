import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

public class Turret extends Actor
{
    public int counter;
    public int stage;
    public List<Integer> spawnPattern = new ArrayList<Integer>();
    public Turret () {
        GreenfootImage image = getImage();
        image.scale(70,70);
        setImage(image);
        for (int i = 0; i < 3; i++) {
            spawnPattern.add(20 + (int)(Math.random()*80));
        }
        stage = 0;
    }

    public void act() 
    {
        turnTowards(((MyWorld)getWorld()).getPlayerX(),((MyWorld)getWorld()).getPlayerY());
        if (counter == spawnPattern.get(stage)) {
            getWorld().addObject(new Enemy(2,10),getX(),getY());
            counter = 0;
            if (stage == 2) {
                stage = 0;
            }
            else {
                stage += 1;
            }
        }
        else {
            counter += 1;
        }
    }    

    public int updateTargetCoordinates () {
        int x = ((MyWorld)getWorld()).getPlayerX();
        int y = ((MyWorld)getWorld()).getPlayerY();
        double dx = x - getX();
        double dy = y - getY();
        double angle = Math.atan2(dy,dx)*180.0/Math.PI;
        return( (int)angle );
    } 
}
