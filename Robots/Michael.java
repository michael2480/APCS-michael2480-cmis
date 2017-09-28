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

    int movesPerformed = 0;
    Random rand = new Random();
    int isBacking = 0;
    int stuck = 0;
    double randomChoice = 0.0;
    int panicMode = 0;

    public void behave () {
        if (panicMode > 0 || stuck == 15) {
            if (stuck == 15) {
                stuck = 0;
                panicMode = 50;
            }
            stuck = 0;
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

            panicMode -= 1;
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

        else {
            
            if (rand.nextFloat() < 0.5) {
                up();
            } 
            else {
                down();
            }

        }

        stuck += 1;
        
        System.out.println("Stuck: "+stuck+" | panicMode: "+panicMode);

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
