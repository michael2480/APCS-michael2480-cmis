import greenfoot.*;
public class Player extends Human
{
    private String leftKey;
    private String rightKey;
    private String shootKey;
    private int charge;
    private int counter;

    public Player (int walkSpeed, int hitPoints, String left, String right, String shoot) {

        // Set up instance vars
        super(walkSpeed, hitPoints);
        leftKey = left;
        rightKey = right;
        shootKey = shoot;
        charge = 20;

        //Resize Image
        GreenfootImage image = getImage();
        image.scale(40, 40);
        setImage(image);
    }

    public void act() 
    {

        if (getOneIntersectingObject(Enemy.class) != null) {
            getWorld().removeObject(this);
        }

        //Reload a bit
        if (charge < 20) {
            charge += 5;
        }

        // Turn
        turn(Greenfoot.isKeyDown(leftKey) ? -4 : Greenfoot.isKeyDown(rightKey) ? 4 : 0);

        //Move
        move(getSpeed());

        //Fire
        if (Greenfoot.isKeyDown(shootKey) && charge == 20) {
            getWorld().addObject(new Bullet(getRotation()+((int)(15-Math.random()*30))),getX(),getY());
            charge = 0;
        }

        //Spawn Rocket
        if (counter == 50) {
            getWorld().addObject(new Enemy(10,10),50,(int)(Math.random()*750));
            counter = 0;
        }
        else {
            counter += 1;
        }
    }    
}
