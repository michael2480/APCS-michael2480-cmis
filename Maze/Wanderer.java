import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
public class Wanderer extends Robot
{
    public Wanderer(int d){
        super(Color.red, d);
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
     *
     *FACING
     * 0 ->
     * 1 <-
     * 2 ^
     * 3 v
     *
     */
    public void behave(){
        
        int move;
        
        if (getData(0) == 0) {
            if (isClearDown()) {
                move = 3;
                setData(0,3);
            }
            else {
                move = 1;
            }
        } else if (getData(0) == 1) {
            if (isClearUp()) {
                move = 2;
                setData(0,2);
            }
            else {
                move = 0;
            }
        } else if (getData(0) == 2) {
            if (isClearRight()) {
                move = 1;
                setData(0,0);
            }
            else {
                move = 2;
            }
        } else if (getData(0) == 3) {
            if (isClearLeft()) {
                move = 0;
                setData(0,1);
            }
            else {
                move = 3;
            }
        }
        
        switch(move){
            case 0: left(); break;
            case 1: right(); break;
            case 2: up(); break;
            case 3: down(); break;
        }
    }
}
