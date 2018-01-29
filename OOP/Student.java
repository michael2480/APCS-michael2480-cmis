
public class Student
{
    private String name;
    private String surname;
    private int age;
    private boolean isMale;
    
    public Student () {
        this.name = "NoName";
        this.surname = "NoSurname";
        this.age = -1;
        this.isMale = false;
    }
    
    public Student (String name, String surname, int age, boolean isMale) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.isMale = isMale;
    }
}
