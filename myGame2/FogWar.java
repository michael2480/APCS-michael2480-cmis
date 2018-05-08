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
        turnTowards(((MyWorld)getWorld()).getPlayerX(),((MyWorld)getWorld()).getPlayerY());
        move(1);
    }
}
