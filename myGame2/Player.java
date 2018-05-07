import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Player () {
        GreenfootImage image = getImage();
        image.scale(50,50);
        setImage(image);
    }
    
    public int getTheX () {
        return this.getX();
    }

    public int getTheY () {
        return this.getY();
    }

    public void act() 
    {
        if (Greenfoot.isKeyDown("w")) {
            move(2);
        }
        else if (Greenfoot.isKeyDown("s")) {
            move(-2);
        }
        if (Greenfoot.isKeyDown("d")) {
            turn(5);
        }
        else if (Greenfoot.isKeyDown("a")) {
            turn(-5);
        }
    }    
}
