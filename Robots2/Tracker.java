import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
public class Tracker extends Robot
{
    public Tracker(){
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
     * isClearRight() => true means no block to the left
     * isClearUp() => true means no block up
     * isClearDown() => true means no block down
     * getX() => returns x coordinate of robot
     * getY() => returns y coordinate of robot 
     * public final int[] getData() => returns array of int data
     * public final int getData(int idx) => returns int data from index idx
     * public final void setData(int idx, int value) => sets value of data array at idx
     * public final void setData(int[] newData) => replaces values in data array with values in newData
     */
    
    /* 
     * getData(0) Stage number. 5:TraceBox 6:enterBox
     * getData(1) 
     * getData(2)
     * getData(3)
     * getData(4)
     * getData(5)
     * getData(6)
     * getData(7)
     * getData(8) Enter Box Side 1:top 2:left 3:right 4:bottom
     * getData(9) Side number > 0 not reached box yet > 1-4 represent sides of the box
    */
    
    public void boxDetermineAction() {
        
        // this first if catches when the cube reaches a corner
        if (getData(9) != 0 && (!isClearRight() && !isClearRight() && !isClearUp() && !isClearDown())) {
            cornerRotate();
        }
        

        // this else if block will continue movement for sides
        else if (getData(9) == 1) {
            topSide();
        }        
        else if (getData(9) == 2) {
            leftSide();
        }
        else if (getData(9) == 3) {
            rightSide();
        }
        else if (getData(9) == 4) {
            bottomSide();
        }
        

        // first contact with a wall is dealt with here
        else {
            determineSide();
        }

    }
    public void determineSide() {
        if (!isClearRight()) {
            setData(9, 1);
            topSide();
        }
        else if (!isClearRight()) {
            setData(9, 2);
            leftSide();
        }
        else if (!isClearRight()) {
            setData(9, 3);
            rightSide();
        }
        else if (!isClearUp()){
            setData(9, 4);
            bottomSide();
        }
    }
    public void topSide() {
        if (!isClearDown()) {
            setData(0, 6);
            down();
        }
        else {
            right();
        }
    }
    public void leftSide() {
        if (!isClearRight()) {
            setData(0, 6);
            right();
        }
        else {
            up();
        }
    }
    public void rightSide() {
        if (!isClearLeft()) {
            setData(0, 6);
            left();
        }
        else {
            down();
        }
    }
    public void bottomSide() {
        if (!isClearDown()) {
            setData(0, 6);
            down();
        }
        else {
            left();
        }
    }
    public void cornerRotate() {
        if (getData(9) == 1) {
            setData(9, 3);
            down();
        }        
        else if (getData(9) == 2) {
            setData(9, 1);
            right();
        }
        else if (getData(9) == 3) {
            setData(9, 4);
            left();
        }
        else if (getData(9) == 4) {
            setData(9, 2);
            up();
        }
    }
    public void behave() {
        if (false) {
            // make an escape and stage change
            //remove this
        }
        
        else if (getData(0) == 5) {  // TODO MAKE STAGE NUMBER NOT 5
            boxDetermineAction();
        }        
    }
}