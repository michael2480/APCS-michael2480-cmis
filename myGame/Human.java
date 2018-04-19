import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public abstract class Human extends Actor
{
    private int walkSpeed;
    private int hitPoints;
    
    public Human (int walkSpeed, int hitPoints) {
        this.walkSpeed = walkSpeed;
        this.hitPoints = hitPoints;
    }
    
    public void act() 
    {
        // Add your action code here.
    }    
    
    public int getSpeed () {
        return this.walkSpeed;
    }
    
    public void setSpeed (int a) {
        this.walkSpeed = a;
    }
    
    public int getHitPoints () {
        return this.hitPoints;
    }
    
    public void addHitPoints (int a) {
        this.hitPoints += a;
    }
    
    public void loseHitPoints (int a) {
        this.hitPoints -= a;
    }
}
