import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public abstract class Fruit extends Actor
{
    private int nutrition;
    private int freshness;
    public Fruit(int nutrition){
        this.nutrition = nutrition;
        freshness = (int)(Math.random() * 1000);
    } 
    public final int getNutrition(){
        return nutrition;
    }
    
    public final void decFreshness(){
        freshness++;
    }
        
    public abstract void rot();
    
    public final void act(){
        rot();
        if(freshness <= 0){
            World w = getWorld();
            w.removeObject(this);
        }
    }
}