
public class Teacher extends Person
{
    private boolean hasJob;
    private String bossName;
    public Teacher(String name) {
        super(name);
    }
    
    public void changeLifeForce (int amount) {
        if (amount > 0 && amount < 3) {
            super.changeLifeForce(amount);
        }
    }
    
    public void setHasJob (boolean m) {
        this.hasJob = m;
    }
    
    public void setBossName (String m) {
        this.bossName = m;
    }
    
    
}
