import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends Actor
{
    /**
     * Act - do whatever the Bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    private int rotation;

    public Bullet (int rotation) {
        GreenfootImage image = getImage();
        image.scale(8,3);
        setImage(image);
        this.rotation = rotation;
    }

    public void act() 
    {
        move(10);
        setRotation(rotation);
        if (getOneIntersectingObject(Wall.class) != null) {
            getWorld().removeObject(this);
        }
    }    
}
