import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Explosion extends Animal
{
    public boolean eat(Actor food){
        return true;
    }

    public void changePosition(){
        turn(90);
        for (int i=0; i < 30; i++) {
            whither();
        }
    }

    public void reproduce(){
        ;
    }
}