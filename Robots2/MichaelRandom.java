import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.util.Random;

public class MichaelRandom extends Robot
{
    public MichaelRandom(){
        super(Color.black);
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
        double rand2 = rand.nextFloat();
        double rand3 = rand.nextFloat();
        if (rand2 < 0.2) {
            up();
        }
        else if (rand2 < 0.4) {
            down();
        }
        else {
            if (getX() < 20) {
                if (rand3 < 0.503) {
                    right();
                }
                else {
                    left();
                }
            }
            else if (getY() > 140) {
                if (rand3 < 0.503) {
                    right();
                }
                else {
                    left();
                }
            }
            else {
                if (rand3 < 0.5) {
                    left();
                }
                else {
                    right();
                }
            }
        }
    }
}
