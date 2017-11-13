import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.util.Scanner ;  
public class wasd extends Robot
{
    public wasd(){
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
     * isClearRight() => true means no block to the left
     * isClearUp() => true means no block up
     * isClearDown() => true means no block down
     * getX() => returns x coordinate of robot
     * get() => returns y coordinate of robot 
     */
    public void behave(){

        if(Greenfoot.isKeyDown("a")){
            left();
        }else if(Greenfoot.isKeyDown("s")){
            down();
        }else if(Greenfoot.isKeyDown("d")){
            right();
        }else if(Greenfoot.isKeyDown("w")){
            up();

        }
    }
}