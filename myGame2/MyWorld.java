import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */

    Player p = new Player();

    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1);

        addObject(new FogWar(), 75, 75);

        addObject(p, 75, 75);

        //spawn box
        for (int i = 25; i < 600; i+= 50) {
            addObject(new Wall(), i, 25);
        }
        for (int i = 75; i < 600; i+= 50) {
            addObject(new Wall(), 25, i);
        }
        for (int i = 75; i < 600; i+= 50) {
            addObject(new Wall(), 575, i);
        }
        for (int i = 75; i < 575; i+= 50) {
            addObject(new Wall(), i, 575);
        }

        //spawn random walls
        for (int i = 75; i < 575; i+= 50) {
            for (int j = 75; j < 575; j+= 50) {
                if (Math.random() < 0.12) {
                    addObject(new Wall(), i, j);
                }
                else if (Math.random() < 0.1) {
                    addObject(new Zombie(), i, j);
                }
            }
        }
    }

    public int getPlayerX () {
        return p.getTheX();
    }

    public int getPlayerY () {
        return p.getTheY();
    }
}
