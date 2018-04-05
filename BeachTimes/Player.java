import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Player extends Animal
{
    public boolean eat(Actor food) {
        return true;
    }

    public void changePosition(){
        if (Greenfoot.isKeyDown("left")) {
            turn(-10);
        }
        if (Greenfoot.isKeyDown("right")) {
            turn(10);
        }
        if (Greenfoot.isKeyDown("up")) {
            move(20);
        }
        if (Greenfoot.isKeyDown("space")) {
            int spawnRadius = 150;
            int newx = (int)(this.getX() + spawnRadius *  Math.cos(this.getRotation()));
            int newy = (int)(this.getY() + spawnRadius *  Math.sin(this.getRotation()));
            World w = getWorld();
            Rocket r = new Rocket();
            r.setRotation(this.getRotation());
            r.getImage().scale(40,40);
            w.addObject(r, newx, newy);
        }
    }

    public void reproduce(){
        ;
    }
}