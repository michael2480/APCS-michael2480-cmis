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

    public int x;
    public int y;

        public Player () {
            GreenfootImage image = getImage();
            image.scale(30,30);
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
        MouseInfo mouse = Greenfoot.getMouseInfo();

        if (mouse != null) {
            x = mouse.getX();
            y = mouse.getY();
            turnTowards(mouse.getX(), mouse.getY());

            if (Greenfoot.mouseClicked(null)) {
               getWorld().addObject(new Bullet(getRotation()), getX(), getY());

            }
        }

        if (getOneIntersectingObject(Wall.class) != null) {

        }
        else {
            move(1);
        }
    }    
}
