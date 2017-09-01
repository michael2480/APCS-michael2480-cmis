public class Fundamentals2
{
    public static void main (String[] args) {
    
        int[] intArray = {1, 3, 2, 4, 5};
        double[] doubleArray = {1.4, 5.3, 2.2, 64.0, 0.5};
        String[] stringArray = {"One", "Three", "Two", "Four"};
   
        
    }
    
    
    public static void printArray(int[] array, boolean skip) {
    
        for (int index = 0; index < array.length; index++) {
        
            if (skip) {
                if (index % 2 == 1) {
                
                }
            }
            else {
                System.out.println("Index: " + index + "\tValue: " + array[index]);
            }	
        }
        
        
    }
    
    public static void printArray(double[] array, boolean skip) {
    
    }
    
    public static void printArray(String[] array, boolean skip) {
    
    }
    
}
