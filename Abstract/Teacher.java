
public class Teacher extends Person
{
    public Teacher(String name) {
        super(name);
    }
    
    public void changeLifeForce (int amount) {
        if (amount > 0 && amount < 3) {
            super.changeLifeForce(amount);
        }
    }
}
