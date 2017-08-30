
/**
 * Write a description of class humanClass here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class projectEuler
{
    public static int problem1 (int topNumber) {
        int sum = 0;
        for (int i = topNumber; i > 0; i--) {
            if (i%3 == 0 || i%5 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
