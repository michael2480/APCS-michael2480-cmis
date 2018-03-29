import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Banana extends Fruit
{
    public Banana(){
        super(50);
    }
    
    public void rot(){
        while(Math.random() > 0.1){
            decFreshness();
        }
    }
}