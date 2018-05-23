import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Explosion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Explosion extends Actor
{
    /**
     * Act - do whatever the Explosion wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int health;
    public int height;
    public int width;
    
    public Explosion (int x) {
        GreenfootImage image = getImage();
        height = x;
        width = x;
        image.scale(width, height);
        setImage(image);
        health = 15;
    }

    public void act() 
    {
        health -= 1;
        GreenfootImage image = getImage();
        
        width += 3;
        height += 3;
        
        image.scale(width, height);
        setImage(image);
        if (health == 0) {
            getWorld().removeObject(this);
        }
    }  
    
    public int getR () {
        return getRotation();
    }
}
