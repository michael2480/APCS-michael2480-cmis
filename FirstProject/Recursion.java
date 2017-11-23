
/**
 * Write a description of class Stringy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Recursion
{
    public static void main (String args[]) {
        System.out.println("" + Power(2,3));
    }

    public static int Power (int base, int exp) {
        if (exp > 0) {
            return base * Power(base, exp - 1);
        }

        else {
            return 1;
        }
    }
    
    public static int Factorial (int x) {
        if (x > 0) {
            return x * Factorial(x - 1);
        }

        else {
            return 1;
        }
    }
}
