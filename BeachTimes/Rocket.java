import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Rocket extends Animal
{
    public boolean eat(Actor food){
        if(food instanceof Quicksand){
            
            World w = getWorld();
            w.addObject(new Explosion(), getX(), getY());
            die();
        }
        return true;
    }

    public void changePosition(){
        if (this.getLifeForce()<10) {
            World w = getWorld();
            w.addObject(new Explosion(), getX(), getY());
        }
        if(Math.random() > 0.3){
            turn(20 - (int)(Math.random() * 40));
        }
        if (Math.random() > 0.5) {
            whither();
        }
        move(40);
    }

    public void reproduce(){
        ;
    }
}