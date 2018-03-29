import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
public abstract class Animal extends Actor
{
    /**
     * Important Actor methods:
     * turn
     * move
     * turnTowards
     * isAtEdge
     * 
     * Important World methods
     * removeObject
     */
    private int lifeForce;
    public Animal(){
        turn((int)(Math.random() * 360));
        lifeForce = (int)(Math.random() * 70) + 30;
    }

    public final int getLifeForce(){
        return lifeForce;
    }

    public abstract boolean eat(Actor food);

    public abstract void changePosition();
    
    public abstract void reproduce();

    public final void whither(){
        if(this.lifeForce > 0){
            this.lifeForce--;
        }   
    }
    
    public final void incrementLifeForce(){
        if(lifeForce < 100){
            this.lifeForce++;
        }
    }

    public final void act(){
        changePosition();
        if(isAtEdge()){
            turnTowards(300,200);
        }
        Actor food = (Actor) getOneIntersectingObject(Actor.class);
        if(food != null){
            if(eat(food)){
                World w = getWorld();
                w.removeObject(food);
            }
        }
        if(Math.random() > 0.95){
            whither();  
        }
        reproduce();
        if(lifeForce <= 0){
            World w = getWorld();
            w.removeObject(this);
        }
    }
}