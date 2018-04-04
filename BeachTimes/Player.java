import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Player extends Animal
{
    public boolean eat(Actor food){
        return true;
    }

    public void changePosition(){
        if (Greenfoot.isKeyDown("left")) {
            turn(-3);
        }
        if (Greenfoot.isKeyDown("right")) {
            turn(3);
        }
        if (Greenfoot.isKeyDown("up")) {
            move(14);
        }
        if (Greenfoot.isKeyDown("space")) {
            World w = getWorld();
            w.addObject(new Rocket(), getX()+30, getY());
        }
    }

    public void reproduce(){
        ;
    }
}