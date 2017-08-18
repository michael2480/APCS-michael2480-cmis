
/**
 * Write a description of class Fundamentals1 here.
 * 
 * @author michael blakie 
 * @version (a version number or a date)
 */

// This imports the random library allowing for useage of useful 'random' number generators.
import java.util.Random;

public class Fundamentals1
{
   public static void main (String[] args) {
   
       String helloWorld = "Hello World";
       
       System.out.println(helloWorld + "!");
       
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

       byte byteType = -5;
       System.out.println("A byte is a type that has a limited numeric range which allows it to be quickly applied in computations and it cannot be decimal.\nUses: Representing Age, Representing a length dimension of small objects, Simple integer math with small numbers.\n" + byteType + "\n");
       
       short shortType = 40;
       System.out.println("A short has the same purpose as a byte  (save memory) but has a larger range.\nUses: Representing Height in cm, Representing the Year (as long as it isn't a high BC value), integer functions that lie between -32,768 and 32768.\n" + shortType + "\n");

       int intType = 4;
       System.out.println("An int is about double the size of a short but has an even larger range. Cannot be decimal.\nUses: Representing all years, representing distances, integer interacton.\n" + intType + "\n");

       long longType = 987654321;
       System.out.println("A long is larger than an int but uses a lot more memory.\nUses: Even larger integer interaction, represent long distances, represent time.\n" + longType + "\n");

       float floatType = 5.61f;
       System.out.println("A float stores sub-integer but rather innacurately to save space. Good for floating point numbers.\nUses: percentages, floating point numbers, decimals.\n" + floatType + "\n");
       
       double doubleType = 4.505;
       System.out.println("A double is also a bit innacurate but is used for decimal calculations.\nUses: division, representation of decimal numbers, very long decimal eg: 56.9999799943\n" + doubleType + "\n");

       boolean boolType = true;
       System.out.println("A boolean is used for true/false, or binary situations.\nUses: On/Off Conditions. Is Equal?, True/False Statements\nTrue\n");       
       
       char charType = 'a';
       System.out.println("A character is a type that stores only 'one 16-bit unicode character'.\nUses: abbreviation as a character, can be used instead of a 1 length string, many of them can be turned into a string.\n" + charType);
       
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
       int c = a/b;
       return c;
   }
   
   public static double add2 (double a, double b) {
       double c = a+b;
       return c;
   }
   
   public static double subtract2 (double a, double b) {
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

   public static String checkerboard (int h, int w) {
        int height = h;
        int width = w;
        int gridSize = w*h;
        boolean isOddPixel = true; //Start at row 1
        String returnString = "";
        
        int currentCellRow = 0;
        int currentCellCol = -1;
        
        for (int cellNumber = 0; cellNumber < gridSize; cellNumber ++) {
            
            // Will adjust the row variable counter whenever we hit the final column
            if (currentCellCol == width-1) {
                currentCellRow += 1;
                currentCellCol = 0;
                
            }
            else {
                currentCellCol += 1;
            }
            
            if (currentCellCol == 0 || currentCellCol == width-1) {
                if (currentCellRow == 0 || currentCellRow == height-1) {
                    returnString += "+";
                }
                else {
                    returnString += "|";
                }
                if (currentCellCol == width -1) {
                    returnString += "\n";
                }
            }
            
            else if (currentCellRow == 0 || currentCellRow == height-1) {
                returnString += "-";
            }
            
            // You end up here if the cell is not part of the frame.
            else {
                returnString += " ";
            }
            
            System.out.println("("+currentCellCol+","+currentCellRow+") ");
        }
        
        System.out.println(returnString);
        
        return returnString;
   }
   
}
