public class FundamentalsQuiz1
{
    public static void main(String[] args){
    
        int variable1 = 2;
        int variable2 = 9;
        int squaredValue = sumOfSquares(variable1, variable2);
        System.out.println("The result of sumOfSquares is: "+squaredValue);
        
        double variable3 = 9.7;
        double variable4 = 7.43;
        double variable5 = 9.05;
        double averagedValue = averageOfThree (variable3, variable4, variable5);
        System.out.println("The result of averageOfThree is: "+averagedValue);
        
    }
    
    public static int sumOfSquares (int a, int b) {
        return ((a*a) + (b*b));
    }
    
    public static double averageOfThree (double a, double b, double c) {
        return (a+b+c)/3;
    }
    
    /*
     * #1 Write a method that returns the sum of the squares 
     * of 2 whole numbers given as arguments.
     * 
     * #2 Call the method from the main method. The call
     * should get its arguments from variables declared 
     * in the main method.
     */
    
    /*
     * #3 Write a method that returns the average of 3 decimals
     * given as arguments.
     * 
     * #4 Call the method from the main method. The call should get its 
     * arguments from variables declared in the main method.
     */

}