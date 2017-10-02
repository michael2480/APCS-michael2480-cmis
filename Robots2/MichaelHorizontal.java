import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.util.Random;

public class MichaelHorizontal extends Robot
{
    public MichaelHorizontal(){
        super(Color.green);
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
        double randy = rand.nextFloat();
        boolean isEven = getY()%2 == 0;
        if (isEven) {
            if (isClearRight()) {
                right();
            }
            else {
                if (getX()/2 > 80) {
                    if (randy < 0.55) {
                        up();
                    }
                    else {
                        down();
                    }
                }
                else {
                    down();
                }
            }
        }
        else {        
            if (isClearLeft()) {
                left();
            }
            if (getX()/2 < 80) {
                    if (randy < 0.55) {
                        down();
                    }
                    else {
                        up();
                    }
                }
                else {
                    up();
                }
        }
    }
}
