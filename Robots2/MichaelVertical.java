import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.util.Random;

public class MichaelVertical extends Robot
{
    public MichaelVertical(){
        super(Color.red);
    }

    public void init(){

    }

    /**
     * What your robot can do:
     * right() => move 1 to the right
     * left() => move 1 to the left
     * up() => move 1 up
     * down() => move 1 down
     * isClearRight() => true means no block to the right
     * isClearLeft) => true means no block to the left
     * isClearUp() => true means no block up
     * isClearDown() => true means no block down
     * getX() => returns x coordinate of robot
     * getY() => returns y coordinate of robot 
     *   160 x 40
     */
    public void behave(){
        Random rand = new Random();
        boolean isEven = getX()%2 == 0;
        if (isEven) {
            if (!isClearDown()) {
                right();
            }
            else {
                down();
            }
        }
        else {        
            if (!isClearUp()) {
                right();
            }
            else {
                up();
            }
        }
    }
}
