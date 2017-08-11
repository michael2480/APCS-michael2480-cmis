
/**
 * Write a description of class Fundermantals1 here.
 * 
 * @author (our name) 
 * @version (a version number or a date)
 */

import java.util.Random;

public class Fundermantals1
{
   public static void main (String[] args) {
   
       String helloWorld = "Hello World";
       
       System.out.println(helloWorld+"!");
       
       // Call the Methods        
       double valueA = 4.6;
       double valueB = 3.2;
       double valueC = 5.0;
       double valueOfOperations = multiply2(add2(valueA, valueB),valueC);
       System.out.println(valueOfOperations);
       
       // Call the Methods 2        
       double valueD = 6.4;
       double valueE = 2.3;
       double valueF = 0.5;
       double valueOfOperations2 = divide2(subtract2(valueA, valueB),valueC);
       System.out.println(valueOfOperations2);
       
       // Call the Methods 3        
       int valueG = 50;
       int valueH = 43;
       compare(valueG, valueH);
       System.out.println(evenOddZero(valueH));    
   }
   
   public static void dataTypes () {
       
       // A byte is a type that has a limited numeric range which allows it to be quickly applied in computations. Cannot be decimal.. 
       byte byteType = -5;
       
       // A short has the same purpose as a byte  (save memory) but has a larger range. Cannot be decimal.
       short shortType = 40;
       
       // An int is double the size of a short but has an even larger range. Cannot be decimal.
       int intType = 4;
       
       // A long is larger than an int but uses a lot more memory.
       long longType = 987654321;
       
       // A float stores sub-integer but rather innacurately to save space. Good for floating point numbers. 
       float floatType = 5.61f;
       
       // A double is also a bit innacurate but is used for decimal calculations.
       double doubleType = 4.505;
       
       // A boolean is used for true/false, or binary situations.
       boolean boolType = true;
       
       // A character is a type that stores only 'one 16-bit unicode character'.
       char charType = 'a';
       
   }
   
   public static int add (int a, int b) {
       int c = a+b;
       return c;
   }
   
   public static int subtract (int a, int b) {
       // b will be subtracted from a
       int c = a-b;
       return c;
   }
   
   public static int multiply (int a, int b) {
       int c = a*b;
       return c;
   }
   
   public static int divide (int a, int b) {
       // possible to do with int albiet dangerous because of remainders
       int c = a/b;
       return c;
   }
   
   public static double add2 (double a, double b) {
       double c = a+b;
       return c;
   }
   
   public static double subtract2 (double a, double b) {
       // b will be subtracted from a
       double c = a-b;
       return c;
   }
   
   public static double multiply2 (double a, double b) {
       double c = a*b;
       return c;
   }
   
   public static double divide2 (double a, double b) {
       double c = a/b;
       return c;
   }
   
   public static void compare (int a, int b) {
       if (a < b) {
           System.out.println("The value of a is " + a + " and it is less than b whose value is " + b + ".");
       
       }
       else if (a > b) {
           System.out.println("The value of a is " + a + " and it is greater than b whose value is " + b + ".");
       }
       
       else {
           System.out.println("The value of a is " + a + " and it is equal to b whose value is " + b + ".");
       }
   }
   
   public static int evenOddZero (int a) {
       if (a == 0) {
           return 0;
       }
       else if (a % 2 == 0) {
           return 1;
       }
       else {
           return -1;
       }
   }

   public static void squareTable () {
       for (int i = 1; i < 11; i++) {
           int squared = i * i;
           Random rand = new Random();
           int randomNumber = rand.nextInt((squared));
           System.out.println(i + "\t" + (squared) + "\t" + randomNumber +"\n");
       }
   }
   
   public static int triangle (int a) {
       int b = 0;
       for (int i = a; i > 0; i--) {
           b += i;
       }
       return b;
   }
   
   public static int pyramid (int a) {
       int b = 0;
       for (int i = a; i > 0; i--) {
           b += (i*i);
       }
       return b;
   }

   public static void checkerboard (int h, int w) {
       
   }
   
}
