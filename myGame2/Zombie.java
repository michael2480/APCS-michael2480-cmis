import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Zombie here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Zombie extends Actor
{
    /**
     * Act - do whatever the Zombie wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public Zombie ()  {
        GreenfootImage image = getImage();
        image.scale(30,30);
        setImage(image);
    }

    public void act() 
    {
        turnTowards(((MyWorld)getWorld()).getPlayerX(),((MyWorld)getWorld()).getPlayerY());
        if (Math.random() < 0.1) {
            move(1);
        }

        if (getOneIntersectingObject(Bullet.class) != null) {
            getWorld().removeObject(this);
        }
    }    
}
