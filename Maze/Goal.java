import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
public class Goal extends Actor
{
    private GreenfootImage img;
    public Goal(int d){
        img = new GreenfootImage(d,d);
        img.setColor(Color.green);
        img.fill();
        setImage(img);
    }
}
