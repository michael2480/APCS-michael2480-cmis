import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Turret extends Actor
{
    public int counter;

    public void act() 
    {
        turnTowards(((MyWorld)getWorld()).getPlayerX(),((MyWorld)getWorld()).getPlayerY());
        if (counter == 100) {
            getWorld().addObject(new Enemy(2,10),getX(),getY());
            counter = 0;
        }
        else {
            counter += 1;
        }
    }    

    public int updateTargetCoordinates () {
        int x = ((MyWorld)getWorld()).getPlayerX();
        int y = ((MyWorld)getWorld()).getPlayerY();
        double dx = x - getX();
        double dy = y - getY();
        double angle = Math.atan2(dy,dx)*180.0/Math.PI;
        return( (int)angle );
    } 
}
