
/**
 * Write a description of class humanClass here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class projectEuler
{
    public static int problem1 () {
        int sum = 0;
        for (int i = 1; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }
    
    public static int problem2 () {
        int bigNum = 1;
        int oldNum = 1;
        int returnv = 0;
        int temp = 0;
        while (bigNum < 4000000) {
            if ((bigNum + oldNum)%2 == 0) {
                returnv += (bigNum+oldNum);
            }
            temp = bigNum;
            bigNum = bigNum + oldNum;
            oldNum = temp;
        }
        return returnv;
    }
    
    public static int problem3 () {
    
        boolean isPrime = true;
        
        int largestPrime = 0;
        
        for (int i = 1; i < 600; i++) { //600851475143
            
            isPrime = true;
            for (int j = i; j > 0; j--) {
            
                if (i%j == 0) {
                    isPrime = false;
                }
                
            }
            
            if (isPrime == true) {
                largestPrime = i;
            }
        
        }
        return largestPrime;
    
    }
    
}
