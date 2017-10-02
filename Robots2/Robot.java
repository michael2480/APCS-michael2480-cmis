import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import  java.awt.Color;

public abstract class Robot extends Actor
{
    private boolean moved;
    private boolean stuck;
    private GreenfootImage img;
    private int oldX = -1, oldY = -1;
    private final int[] data;
    private boolean canSetLocation = true;

    public Robot(Color color){
        data = new int[10];
        moved = false;
        stuck = false;
        img = new GreenfootImage(5,5);
        img.setColor(color);
        img.fill();
        setImage(img);
        init();
    }

    public abstract void behave(); //Your Robot subclass must implement this.

    public abstract void init();
    
    public final void right(){
        if(!moved){
            super.setLocation(getX() + 1, getY());
            moved = true;
        }
    }

    public final void left(){
        if(!moved){
            super.setLocation(getX() - 1, getY());
            moved = true;
        }
    }

    public final void up(){
        if(!moved){
            super.setLocation(getX(), getY() - 1);
            moved = true;
        }
    }

    public final void down(){
        if(!moved){
            super.setLocation(getX(), getY() + 1);
            moved = true;
        }
    }

    public final boolean isClearLeft(){
        return getOneObjectAtOffset(-1, 0, Barrier.class) == null;
    }

    public final boolean isClearRight(){
        return getOneObjectAtOffset(1, 0, Barrier.class) == null;
    }

    public final boolean isClearUp(){
        return getOneObjectAtOffset(0, -1, Barrier.class) == null;
    }

    public final boolean isClearDown(){
        return getOneObjectAtOffset(0, 1, Barrier.class) == null;
    }

    public final int getOldX(){
        return oldX;
    }

    public final int getOldY(){
        return oldY;
    }

    public final void setData(int idx, int value){
        data[idx] = value;
    }

    public final void setData(int[] newData){
        if(newData.length == data.length){
            for(int i = 0; i < data.length; i++){
                data[i] = newData[i];
            }
        }else{
            throw(new RuntimeException("int[] newData must have length of exactly " + data.length + "."));
        }
    }

    public final int[] getData(){
        return data;
    }

    public final int getData(int idx){
        return data[idx];
    }

    public final boolean isStuck(){
        return stuck;
    }

    public final void act() 
    {   
        moved = false;
        oldX = getX();
        oldY = getY();
        behave(); //Abstract method implemented in subclass.

        if(isTouching(Barrier.class)){
            System.out.println("ouch!");
            super.setLocation(oldX, oldY);
        }
        stuck = false;
        if(oldX == getX() && oldY == getY()){
            stuck = true;
        }

        if(isTouching(Goal.class)){
            MyWorld w = (MyWorld) getWorld();
            w.finishRound(this);

        }

    }    

    protected final void addedToWorld(World w){
        canSetLocation = false;
    }

    public void setLocation(int x, int y){
        /* Deactivated */
        if(!canSetLocation)
            throw(new RuntimeException("Classes that extend Robot cannot call setLocation();"));      
    }

}
