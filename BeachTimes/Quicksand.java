import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

public class Quicksand extends Animal
{
    public boolean eat(Actor food){
        boolean success = false;
        if(food instanceof Starfish){
            Starfish starfish = (Starfish) food;
            int nutrition = 100;
            success = true;
            while ( nutrition > 0){
                incrementLifeForce();
                nutrition--;
            }
        }
        return success;
    }

    public void changePosition(){
        if(Math.random() > 0.8){
            turn(30 - (int)(Math.random() * 60));
        }
        move(getLifeForce() / 4);
    }

    public void reproduce(){
        ;
    }

    public int[] getNearestActor() {
        Actor closest = null; // to hold closest ball, if any
        int closeness = 0; // how close closest ball found so far is
        for (Object obj : getWorld().getObjects(Starfish.class)) // for each ball in world (as Object object)
        {
            Actor starfish = (Actor) obj; // cast as Actor object
            int distance = (int)Math.hypot(starfish.getX()-getX(), starfish.getY()-getY()); // get distance
            if (closest == null || distance < closeness) // if first ball or closer ball
            {
                closest = starfish;
                closeness = distance;
            }
        }
        int closestX = closest.getX();
        int closestY = closest.getY();

        return new int[] {closestX, closestY};
        
    }
}