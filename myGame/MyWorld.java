import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    Player p = new Player(9,100,"A","D","S");

    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(950, 700, 1); 
        addObject(new Turret(),600,600);
        addObject(p,100,100);
        addObject(new DumbRocketSpawner(),100,100);
        //addObject(new Player(9,100,"left","right","down"),750,600);

        //addObject(new Enemy(4,100),100,100);
    }

    public int getPlayerX () {
        return p.getTheX();
    }

    public int getPlayerY () {
        return p.getTheY();
    }

    public int getAmmo() {
        return p.ammo;
    }
}
