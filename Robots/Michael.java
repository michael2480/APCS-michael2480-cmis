import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
public class Michael extends Robot
{
    public Michael(){
        super(Color.blue);
    }

    public void init(){

    }
    
    public void behave () {
        int movesPerformed = 0;
        boolean isBacking = false;
        boolean upTime = false();
        while (movesPerformed < 15000) {
            
            if (isBacking) {
                left();
            }
            
            if (isClearRight()) {
                right();
            }
            
            else if (isClearDown()) {
                down();
            }
            
            else if (isClearUp()) {
                up();
            }
            
            else {
                isBacking = true;
                left();
            }
            
            movesPerformed += 1;
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
     * 
     * 
     * 
     * move right if clear
     * 
     * if not clear, 
     * 
     * 
     * 
     */   
}