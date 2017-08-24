
/**
 * Write a description of class humanClass here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class humanClass
{
    String name;
    int age;
    
    // Constructor, we use to create an instance of human class. Must have same name,
    public humanClass (String _name, int _age) {
        name = _name;
        age = _age;
    }
    
    public int getAge () {
        return age;
    }
    
    public String getName () {
        return name;
    }
    
    public void growUp (int yearsPast) {
        age += yearsPast;
        System.out.println("Congrats! "+name+" just got "+yearsPast+" years older and their age is "+age);
    }
    
}
