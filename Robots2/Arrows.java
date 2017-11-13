import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.util.Scanner ;  
public class Arrows extends Robot
{
    public Arrows(){
        super(Color.blue);
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
     * isClearRight() => true means no block to the left
     * isClearUp() => true means no block up
     * isClearDown() => true means no block down
     * getX() => returns x coordinate of robot
     * get() => returns y coordinate of robot 
     */
    public void behave(){

        if(Greenfoot.isKeyDown("left")){
            left();
        }else if(Greenfoot.isKeyDown("down")){
            down();
        }else if(Greenfoot.isKeyDown("right")){
            right();
        }else if(Greenfoot.isKeyDown("up")){
            up();

        }
    }
}
