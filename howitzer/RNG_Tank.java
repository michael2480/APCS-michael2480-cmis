import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RNG_Tank here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RNG_Tank extends Actor
{

    public int reload;

    public RNG_Tank() {
        GreenfootImage image = getImage();
        image.scale(40,20);
        setImage(image);
        reload = 120;
    }

    public void act() 
    {
        double hover = Math.random();
        if (hover < 0.3) {
            setLocation (getX(), getY()-1);
        }
        else if (hover > 0.7) {
            setLocation (getX(), getY()+1);
        }
        
        if (hover < 0.1) {
            move(-1);
        }
        else if (hover > 0.9) {
            move(1);
        }

        if (reload == 120) {
            getWorld().addObject(new Rocket((int)(Math.random()*360)), getX(), getY());
            reload = 0;
        }

        else {
            reload += 1;
        }
    }
}
