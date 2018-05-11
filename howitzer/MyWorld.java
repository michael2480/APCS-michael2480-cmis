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

        //String mode = "";
        for (int i = 0; i < 1000; i+= 10) {
            for (int j = 300; j < 500; j+=10) {
                if (Math.random() < 0.97) {
                    addObject(new Terrain(), i, j);
                }
            }
        }
        
        for (int i = 300; i < 700; i+= 10) {
            for (int j = 0; j < 300; j+=10) {
                // 300 < i < 690
                // 0 < abs < 200
                // 200-200 / 200 = 0
                // 200 - 0 / 200 = 1
                
                // (200 - abs)/200
                if (Math.random() <= ((200.0-(double)(Math.abs(500-i)))/200.0)) {
                    addObject(new Terrain(), i, j);
                }
            }
        }
    }
}
