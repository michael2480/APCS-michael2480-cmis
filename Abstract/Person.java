
public abstract class Person
{
    private String name;
    private double lifeForce;
    
    public void changeLifeForce (double amount) {
        setLifeForce(amount);
    }
    
    public double getLifeForce () {
        return this.lifeForce;
    }
    
    public void setLifeForce (double newValue) {
        this.lifeForce = newValue;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String toString () {
        return "Name: " + this.name;
    }
    
    public Person (String name) {
    }
    
    public void eat (String food) {
        setLifeForce(food == "kfc" ? getLifeForce() - 0.1 : getLifeForce() + 0.2);
    }
}
