import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

public class DumbRocketSpawner extends Actor
{


    public DumbRocketSpawner () {
    }

    public void act() 
    {
        setImage(new GreenfootImage("Ammo: " + ((MyWorld)getWorld()).getAmmo(), 25, Color.WHITE, new Color(0,0,0,0)));
    
    }    
}
