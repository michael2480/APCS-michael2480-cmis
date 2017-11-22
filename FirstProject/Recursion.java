
/**
 * Write a description of class Stringy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Recursion
{
    public static String Stringy (String word, int times) {
        String word2 = "";
        if (times > 0) {
            word2 = word+word;
            Stringy(word2, times - 1);
        }
        return word2;
    }
}
