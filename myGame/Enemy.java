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

        /*if (getRotation() > updateTargetCoordinates()) {
        turn(-10);
        }
        else if (getRotation() < updateTargetCoordinates()) {
        turn(10);
        }*/

        turnTowards(((MyWorld)getWorld()).getPlayerX(),((MyWorld)getWorld()).getPlayerY());

        //Move
        move(4);

        if (getOneIntersectingObject(Bullet.class) != null) {
            ((MyWorld)getWorld()).setAmmo(3);
            getWorld().removeObject(this);
        }

        else if (getX() == 0 || getX() == 948 || getY() == 0 || getY() == 698) {
            getWorld().removeObject(this);
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
