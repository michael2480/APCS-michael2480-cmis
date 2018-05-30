import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    Player p = new Player(3,100,"A","D","S");

    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(950, 700, 1); 
        addObject(new Turret(),600,600);
        addObject(p,100,100);
        addObject(new DumbRocketSpawner(),100,100);
    }

    public int getPlayerX () {
        if ((!getObjects(Player.class).isEmpty())) {
            return p.getTheX();
        }
        else {
            return 0;
        }
    }

    public int getPlayerY () {
        if ((!getObjects(Player.class).isEmpty())) {
            return p.getTheY();
        }
        else {
            return 0;
        }
    }

    public int getAmmo() {
        if ((!getObjects(Player.class).isEmpty())) {
            return p.ammo;
        }
        else {
            return 0;
        }
    }
    
    public void setAmmo(int x) {
        if ((!getObjects(Player.class).isEmpty())) {
            p.ammo += x;
        }
    }
}
