import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.util.Random;

public class Michael extends Robot
{
    public Michael(){
        super(Color.blue);
    }

    public void init(){

    }

    public void behave () {
        int movesPerformed = 0;
        Random rand = new Random();
        int isBacking = 0;
        int stuck = 0;
        double randomChoice = 0.0;
        int panicMode = 0; // steps  of craziness from 50
        while (movesPerformed < 5000) {
            
            System.out.println("move");
            
            if (panicMode > 0) {
                randomChoice = rand.nextFloat();
                if (randomChoice < 0.25) {
                    left();
                }
                else if (randomChoice < 0.5) {
                    up();
                }
                else if (randomChoice < 0.75) {
                    down();
                }
                else {
                    right();
                }
                System.out.println("im in panic mode. panics left: "+panicMode);
                panicMode = panicMode - 1;
            }
            
            else if (isClearRight()) {
                right();
                stuck = 0;
            }
            else if (!isClearDown() && isClearUp()) {
                up();
            }

            else if (isClearDown() && !isClearUp()) {
                down();
            }
            
            else if (stuck == 8 || (!isClearDown() && !isClearUp())) {
                stuck = 0;
                panicMode += 50;
            }
            
            else {
                panicMode += 50;
                System.out.println("panic!!!");
            }
            
            stuck += 1;
            
            movesPerformed = movesPerformed + 1;

        }
    }
}

/**
 * What your robot can do:
 * right() => move 1 to the right
 * left() => move 1 to the left
 * up() => move 1 up
 * down() => move 1 down
 * isClearRight() => true means no block to the right
 * isClearLeft() => true means no block to the left
 * isClearUp() => true means no block up
 * isClearDown() => true means no block down
 */   
