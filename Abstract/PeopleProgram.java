
public class PeopleProgram
{
    public static void main (String[] args) {
        Teacher englishMan = new Teacher("Bob");
        Principal jim = new Principal("Jimmy");
        jim.setName("Aaron");
        jim.toString();
        if (englishMan.hire(jim)) {
            
        }
    }
}
