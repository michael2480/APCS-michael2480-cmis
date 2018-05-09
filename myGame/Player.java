import greenfoot.*;
public class Player extends Human
{
    private String leftKey;
    private String rightKey;
    private String shootKey;
    private int charge;
    private int counter;
    public int ammo;

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

        ammo = 150;
    }

    public int getTheX () {
        return this.getX();
    }

    public int getTheY () {
        return this.getY();
    }

    public void act() 
    {
        
        if (getOneIntersectingObject(Enemy.class) != null) {
            getWorld().removeObject(this);
        }

        //Reload a bit
        if (charge < 20) {
            charge += 1;
        }

        // Turn
        turn(Greenfoot.isKeyDown(leftKey) ? -4 : Greenfoot.isKeyDown(rightKey) ? 4 : 0);

        //Move
        move(getSpeed());

        //Fire
        if (Greenfoot.isKeyDown(shootKey) && charge == 20) {
            if (ammo > 0) {
                getWorld().addObject(new Bullet(getRotation()+((int)(15-Math.random()*30))),getX(),getY());
                charge = 0;
                ammo -= 1;
            }
        }

        //Spawn Rocket
        if (counter == 50) {
            //getWorld().addObject(new Enemy(10,10),50,(int)(Math.random()*750));
            counter = 0;
        }
        else {
            counter += 1;
        }

        //GearChange
        if (Greenfoot.isKeyDown("O")) {
            changeSpeed(getSpeed()-1);
        }
        else if (Greenfoot.isKeyDown("P")) {
            changeSpeed(getSpeed()+1);
        }
    }    

    public void changeSpeed(int x) {
        if (x < 12 && x > 5) {
            this.setSpeed(x);
        }
    }
}
