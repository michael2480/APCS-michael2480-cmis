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
     * getData(5)
     * getData(6)
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

        System.out.println("I THINK THAT GETDATA9 = "+getData(9));
        // this first if catches when the cube reaches a corner
        if (getData(9) != 0 && (isClearRight() && isClearLeft() && isClearUp() && isClearDown())) {
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
        setData(9,2);
        /*if (!isClearRight()) {
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
        }*/
    }

    public void topSide() {
        if (isClearDown()) {
            setData(0, 6);
            down();
        }
        else {
            right();
        }
    }

    public void leftSide() {
        if (isClearRight()) {
            setData(0, 6);
            right();
        }
        else {
            up();
        }
    }

    public void rightSide() {
        if (isClearLeft()) {
            setData(0, 6);
            left();
        }
        else {
            down();
        }
    }

    public void bottomSide() {
        if (isClearUp()) {
            setData(0, 6);
            up();
        }
        else {
            left();
        }
    }

    public void cornerRotate() {
        System.out.println("hit corner");
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

        //     getData(8) Enter Box Side 1:top 2:left 3:right 4:bottom

        if (getData(8) == 1){
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
        else if (getData(8) == 2){
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
        else if (getData(8) == 3){
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

    public void behave() {
        
        System.out.println("Stage:"+getData(0) + "\tDoorStage:"+getData(7)+"\tBoxSide:"+getData(8)+"\tSideNumber:"+getData(9));
        if (getData(0) == 0) {
            goOrigin();
        }

        else if (getData(0) == 1) {  // TODO MAKE STAGE NUMBER NOT 5
            navigateNormally();
            right();
        }   

        else if (getData(0) == 4) {  // TODO MAKE STAGE NUMBER NOT 5
            determineSide();
            setData(0,5);
            right();
        } 

        else if (getData(0) == 5) {  // TODO MAKE STAGE NUMBER NOT 5
            boxDetermineAction();
        }            
        else if (getData(0) == 6) {
            if (getData(7) <= 1) {
                //determineSide();
                if (getData(9) == 1) {
                    down();
                    setData(8, 1);
                }        
                else if (getData(9) == 2) {
                    right();
                    setData(8, 2);
                }
                else if (getData(9) == 3) {
                    left();
                    setData(8, 3);
                }
                else if (getData(9) == 4) {
                    up();
                    setData(8, 4);
                }
                setData(7, getData(7)+1);
            }
            else {
                setData(0,7);
                // make it do a navigate move
            }
        }

        else if (getData(0) == 7) {
            navigateBox();
        }


    }
}