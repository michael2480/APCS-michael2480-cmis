import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class DumbRocketSpawner extends Actor
{
    public int counter;

    public DumbRocketSpawner () {
        counter = 0;
    }

    public void act() 
    {
        if (counter == 200) {
            getWorld().addObject(new Enemy(2,10),50,50);
        }
        else {
            counter += 1;
        }
    }    
}
