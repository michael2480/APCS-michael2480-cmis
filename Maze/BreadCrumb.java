import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class BreadCrumb here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BreadCrumb extends Actor
{
    GreenfootImage img;
    public BreadCrumb(int d){
        img = new GreenfootImage(d,d);
        img.setColor(Color.yellow);
        img.fill();
        img.setColor(Color.black);
        img.drawRect(0,0,d-1,d-1);
        setImage(img);       
    }
}
