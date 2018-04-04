import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Rocket extends Animal
{
    public boolean eat(Actor food){
        return true;
    }

    public void changePosition(){
        move(20);
    }

    public void reproduce(){
        ;
    }
}