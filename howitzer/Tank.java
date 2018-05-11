import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tank here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tank extends Actor
{

    public String left;
    public String right;
    public String shoot;
    public String aLeft;
    public String aRight;
    public int speed;

    public Tank(String left, String right, String shoot, String aLeft, String aRight) {
        this.left = left;
        this.right = right;
        this.shoot = shoot;
        this.aLeft = aLeft;
        this.aRight = aRight;
        this.speed = 1;
    }

    public void act() 
    {
        Actor objectsBelow = getOneObjectAtOffset(0, 10, Terrain.class);
        Actor objectsRight = getOneObjectAtOffset(20, 0, Terrain.class);
        Actor objectsLeft = getOneObjectAtOffset(-1, 0, Terrain.class);
        if (getY() <= 696 && objectsBelow == null) {
            setLocation(getX(), getY()+5);
        }

        if (Greenfoot.isKeyDown(shoot)) {
            getWorld().addObject(new Rocket(290), getX(), getY()-10);
        } 
        
        if (Greenfoot.isKeyDown(right)) {
            if (objectsRight != null) {
                setLocation(getX(), getY()-10);
            }
            move(speed);
        }
        else if (Greenfoot.isKeyDown(left)) {
            if (objectsRight != null) {
                setLocation(getX(), getY()-10);
            }
            move(-1*speed);
        } 
    }
}