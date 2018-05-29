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
    public int reload;
    public int rotation;

    public Tank(String left, String right, String shoot, String aLeft, String aRight) {
        GreenfootImage image = getImage();
        image.scale(40,20);
        setImage(image);
        this.left = left;
        this.right = right;
        this.shoot = shoot;
        this.aLeft = aLeft;
        this.aRight = aRight;
        this.speed = 3;
        this.reload = 50;
    }

    public void act() 
    {
        Actor objectsBelow = getOneObjectAtOffset(0, 10, Terrain.class);
        Actor objectsRight = getOneObjectAtOffset(20, 0, Terrain.class);
        Actor objectsLeft = getOneObjectAtOffset(-1, 0, Terrain.class);

        double hover = Math.random();
        if (hover < 0.3) {
            setLocation (getX(), getY()-1);
        }
        else if (hover > 0.7) {
            setLocation (getX(), getY()+1);
        }
        
        
        
        if (Greenfoot.isKeyDown("q")) {
            rotation -= 3;
        }

        else if (Greenfoot.isKeyDown("e")) {
            rotation += 3;
        }

        if (reload < 50) {
            reload += 1;
        }

        if (Greenfoot.isKeyDown("w")) {
            setLocation(getX(), getY()-3);
        }

        else if (Greenfoot.isKeyDown("s") && objectsBelow == null) {
            setLocation(getX(), getY()+5);
        }

        if (Greenfoot.isKeyDown("space")) {
            if (reload == 50) {
                getWorld().addObject(new Rocket(rotation), getX(), getY());
                reload = 0;
            }
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
        if (getOneIntersectingObject(Terrain.class) != null) {
            getWorld().addObject(new Explosion(100), getX(), getY());
            getWorld().removeObject(this);
        }
    }

    public int getMyX() {
        return getX();
    }

    public int getMyY() {
        return getY();
    }
    
    public int myRot() {
        return getRotation();
    }
}