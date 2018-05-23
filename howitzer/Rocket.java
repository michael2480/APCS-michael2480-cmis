import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rocket here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rocket extends Actor
{
    int momentum;
    int gravTick;
    public Rocket(int r) {
        GreenfootImage image = getImage();
        image.scale(30,30);
        setImage(image);
        setRotation(r);
        momentum = 4;
    }

    public void act() 
    {
        setLocation(getX(), getY()-momentum);
        move(3);
        if (gravTick == 0) {
            momentum -= 1;
            gravTick = 8;
        }
        else {
            gravTick -= 1;
        }

        
        if (getOneIntersectingObject(Terrain.class) != null) {
            getWorld().addObject(new Explosion(20), getX(), getY());
            getWorld().removeObject(this);
        }
    }    
}
