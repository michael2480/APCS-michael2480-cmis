import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Cherry extends Fruit
{
    public Cherry(){
        super(75);
    }
    
    public void rot(){
        if(Math.random() > 0.1){
            decFreshness();
        }
    }
}