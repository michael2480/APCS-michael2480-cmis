import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Bullet extends Projectile
{
    /**
     * Act - do whatever the Bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public Bullet (int rotation) {
        setRotation(rotation);
        GreenfootImage image = getImage();
        image.scale(9,9);
        setImage(image);

    }
    public void act() 
    {
        move(15);

        if (getX() == 0 || getX() == 948 || getY() == 0 || getY() == 698) {
            getWorld().removeObject(this);
        }    
    }
}