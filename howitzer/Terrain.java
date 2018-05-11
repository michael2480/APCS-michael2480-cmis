import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Terrain here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Terrain extends Actor
{
    /**
     * Act - do whatever the Terrain wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public Terrain () {
        GreenfootImage image = getImage();
        image.scale(10,10);
        setImage(image);
        setRotation(90);

    }

    public void act() 
    {
        Actor objectsBelow = getOneObjectAtOffset(0, 5, Terrain.class);
        if (getY() <= 696 && objectsBelow == null) {
            move(1);
        }
    }    
}
