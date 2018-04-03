import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Juice extends Cherry
{
    public Juice(){

    }
    
    public void rot(){
        if(Math.random() > 0.1){
            decFreshness();
        }
    }
}