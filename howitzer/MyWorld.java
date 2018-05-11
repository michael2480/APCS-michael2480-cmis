import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 700, 1); 
        
        String mode = "";
        
        for (int i = 1; i < 1000; i+= 8) {
            for (int j = 1; j < 700; j+=8) {
                if (Math.random() < 0.3) {
                    addObject(new Terrain(), i, j);
                }
            }
        }
    }
}
