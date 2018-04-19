import greenfoot.*;
public class Enemy extends Human
{
    private String upKey;
    private String downKey;
    private String leftKey;
    private String rightKey;
    private String shootKey;

    public Enemy (int walkSpeed, int hitPoints) {
        
        // Set up instance vars
        super(walkSpeed, hitPoints);
        
        //Resize Image
        GreenfootImage image = getImage();
        image.scale(70,70);
        setImage(image);
    }

    public void act() 
    {
        
        // Face direction;
        //turn((int)(10-Math.random()*20));
        
        //Move
        move(getSpeed());
        
        if (getOneIntersectingObject(Bullet.class) != null) {
            getWorld().removeObject(this);
        }
        
        else if (getX() == 0 || getX() == 948 || getY() == 0 || getY() == 698) {
            getWorld().removeObject(this);
        }
    }    
    
    public updateTargetCoordinates () {}
}
