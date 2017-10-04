import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.util.Random;
public class MichaelSmartRobot extends Robot
{
    public MichaelSmartRobot(){
        super(Color.orange);
    }

    public void init(){

    }

    public int getCellNumber (int x, int y) {
        
        int cellWidth = 40; // 160 / 4
        int cellHeight = 10; // 40 / 4
        int cellsPerRow = 4;
        
        return (cellsPerRow*(y/cellHeight) + (x/cellWidth) + 1);
    }
    
    public void moveLeft(double randomNum, double chanceCorrect) {
        if (randomNum < chanceCorrect) {
            left();
        }
        else if (randomNum < (1-chanceCorrect)*0.75) {
            right();
        }
        else if (randomNum < ((1-chanceCorrect)*0.75)/2) {
            down();
        }
        else {
            up();
        }
    }

    public void moveRight(double randomNum, double chanceCorrect) {
        if (randomNum < chanceCorrect) {
            right();
        }
        else if (randomNum < (1-chanceCorrect)*0.75) {
            left();
        }
        else if (randomNum < ((1-chanceCorrect)*0.75)/2) {
            down();
        }
        else {
            up();
        }
    }

    public void moveUp(double randomNum, double chanceCorrect) {
        if (randomNum < chanceCorrect) {
            up();
        }
        else if (randomNum < 1-chanceCorrect + (1-chanceCorrect)*(2/5)) {
            left();
        }
        else if (randomNum < 1-chanceCorrect + 2*(1-chanceCorrect)*(2/5)) {
            right();
        }
        else {
            down();
        }
    }

    public void moveDown(double randomNum, double chanceCorrect) {
        if (randomNum < chanceCorrect) {
            down();
        }
        else if (randomNum < 1-chanceCorrect + (1-chanceCorrect)*(2/5)) {
            left();
        }
        else if (randomNum < 1-chanceCorrect + 2*(1-chanceCorrect)*(2/5)) {
            right();
        }
        else {
            up();
        }
    }

    public void behave(){
        Random rand = new Random();

        double rng = rand.nextFloat();
        
        int cellNum = getCellNumber(getX(), getY());
        
        if (cellNum == 1 || cellNum == 2 || cellNum == 3 || cellNum == 9 || cellNum == 11) {
            moveRight(rng, 0.5);
        }
        
        else if (cellNum == 6 || cellNum == 8 || cellNum == 14 || cellNum == 15 || cellNum == 16) {
            moveLeft(rng, 0.5);
        }
        
        else if (cellNum == 5 || cellNum == 10 || cellNum == 13) {
            moveUp(rng, 0.5);
        }
        
        else {
            moveDown(rng, 0.5);
        }
        

    }
}
