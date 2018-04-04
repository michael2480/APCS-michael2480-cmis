import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Starfish extends Animal
{
    public boolean eat(Actor food){
        boolean success = false;
        if(food instanceof Banana){
            Banana banana = (Banana) food;
            int nutrition = banana.getNutrition();
            success = true;
            while ( nutrition > 0){
                incrementLifeForce();
                nutrition--;
            }
        } else if (food instanceof Cherry){
            while(Math.random() > 0.10){
                whither();
            }
            success = true;
        }
        if(food instanceof Explosion){
            die();
        }
        return success;
    }
    
    public void changePosition(){
        if(Math.random() > 0.8){
            turn(30 - (int)(Math.random() * 60));
        }
        move(getLifeForce() / 8);
    }

    public void reproduce(){
        if(isTouching(Starfish.class) && getLifeForce() > 85){
            World w = getWorld();
            w.addObject(new Starfish(), getX(), getY());
            while(getLifeForce() > 25){
                whither();
            }
        }
    }
}