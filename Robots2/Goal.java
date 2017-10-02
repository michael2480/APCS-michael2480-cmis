import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
public class Goal extends Actor
{
    private GreenfootImage img;
    public Goal(){
        img = new GreenfootImage(5,5);
        img.setColor(Color.green);
        img.fill();
        setImage(img);
    }
}
