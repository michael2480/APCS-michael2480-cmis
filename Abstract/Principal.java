
public class Principal extends Person
{
    public Principal (String name) {
        super(name);
    }
    
    public void changeLifeForce (int amount) {
        if (amount > -6 && amount < 6) {
            super.changeLifeForce(amount);
        }
    }
}
