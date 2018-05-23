import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Crosshair here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Crosshair extends Actor
{
    /**
     * Act - do whatever the Crosshair wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(((MyWorld)getWorld()).getTX(), ((MyWorld)getWorld()).getTY());
        
        if (Greenfoot.isKeyDown("q")) {
            setRotation(getRotation()-3);
        }

        else if (Greenfoot.isKeyDown("e")) {
            setRotation(getRotation()+3);
        }
    }    
}
