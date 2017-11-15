import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

public class Barrier extends Actor
{
    private GreenfootImage img;
    public Barrier(int d){
        img = new GreenfootImage(d,d);
        img.setColor(Color.black);
        img.fill();
        setImage(img);
    }
    
    public void act() 
    {
        // Add your action code here.
    }    
}
