import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FogWar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FogWar extends Actor
{
    /**
     * Act - do whatever the FogWar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        double guess;
        guess = Math.random();
        /*if (guess < 0.25) {
            turn(0);
        }
        else if (guess < 0.55) {
            turn(180);
        }
        else if (guess < 0.75) {
            turn(3);
        }
        else {
            turn(-3);
        }*/
        
        turnTowards(((MyWorld)getWorld()).getPlayerX(),((MyWorld)getWorld()).getPlayerY());
        move(3);
    }
}
