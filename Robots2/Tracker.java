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
     * 
     * 
     * getData(0) Stage number. 0:Go0,0 1:navigatenormal 4:determineSide 5:TraceBox 6:enterBox 7:navigatebox
     * getData(1) 
     * getData(2)
     * getData(3) 
     * getData(4) 
     * getData(5) Door corner memory of side
     * getData(6) Just left a corner or door point 1:YES 2:NO
     * getData(7) Moving into box progress. 0 means it is just outside door. 1 is door 2 is entered.
     * getData(8) Enter Box Side 1:top 2:left 3:right 4:bottom
     * getData(9) Side number > 0 not reached box yet > 1-4 represent sides of the box
     */

    public void goOrigin () {
        if (getX() == 1) {
            if (getY() == 1) {
                setData(0,1);
            }
            else {
                up();
            }
        }
        else {
            left();
        }
    }

    public void navigateNormally() {
        if (!isClearRight()) {
            setData(0,4);
            right();
        }
        else if(getX()%2 == 0) {
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

    public void boxDetermineAction() {

        // this first if catches when the cube reaches a corner

        if ((!isClearRight() && !isClearLeft()) || (!isClearUp() && !isClearDown())) {
            setData(0,6);
        }

        else if (isClearRight() && isClearLeft() && isClearUp() && isClearDown()) {
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
    }

    public void determineSide() {

        setData(9,2); /*
        
        if (!isClearLeft()) {
            setData(9, 3);
            rightSide();
        }
        else if (!isClearRight()) {
            setData(9, 2);
            leftSide();
        }
        else if (!isClearDown()) {
            setData(9, 1);
            topSide();
        }
        else if (!isClearUp()){
            setData(9, 4);
            bottomSide();
        }*/
    }

    public void topSide() {
        right();
    }

    public void leftSide() {
        up();
    }

    public void rightSide() {
        down();
    }

    public void bottomSide() {
        left();
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

    public void navigateBox() {

        //     getData(9) Enter Box Side 1:top 2:left 3:right 4:bottom

        System.out.println("9="+getData(9));
        
        if (getData(9) == 1){
            if(getX()%2 == 0) {
                if (!isClearLeft()) {
                    down();
                }
                else {
                    left();
                }
            }
            else {
                if (!isClearRight()) {
                    down();
                }
                else {
                    right();
                }
            }
        }
        else if (getData(9) == 2){
            if(getX()%2 == 0) {
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
        else if (getData(9) == 3){
            if(getX()%2 == 0) {
                if (!isClearUp()) {
                    left();
                }
                else {
                    up();
                }
            }
            else {
                if (!isClearDown()) {
                    left();
                }
                else {
                    down();
                }
            }
        }
        else {
            if(getX()%2 == 0) {
                if (!isClearLeft()) {
                    up();
                }
                else {
                    left();
                }
            }
            else {
                if (!isClearRight()) {
                    up();
                }
                else {
                    right();
                }
            }
        }
    }

    public void enterRoom() {
        if (getData(9) == 1) {
            down();
        }        
        else if (getData(9) == 2) {
            right();
        }
        else if (getData(9) == 3) {
            left();
        }
        else if (getData(9) == 4) {
            up();
        }
    }

    public void behave() {

        System.out.println(""+getData(9));
        if (getData(0) == 0) {
            goOrigin();
        }

        else if (getData(0) == 1) {
            navigateNormally();
            right();
        }   

        else if (getData(0) == 4) {
            determineSide();
            setData(0,5);
            right();
        } 

        else if (getData(0) == 5) {
            boxDetermineAction();
        }            
        else if (getData(0) == 6 || getData(0) == 7 || getData(0) == 8 ) {
            setData(0, getData(0)+1);
            enterRoom();
        }

        else if (getData(0) == 9) {
            navigateBox();
        }

    }
}