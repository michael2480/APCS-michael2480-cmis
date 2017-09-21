import java.util.Random;
public class Fundamentals2
{
    public static int[] main (String[] args) {

        //#1
        int[] intArray = {1, 3, 2, 4, 5};
        int[] intArray2 = {14, 53};
        double[] doubleArray = {1.4, 5.3, 2.2, 64.0, 0.5};
        String[] stringArray = {"One", "Three", "Two", "Four","Five"};
        
        return merge(intArray, intArray2);
        
    }

    //#2
    public static void printArray(int[] array, boolean skip) {    
        for (int index = 0; index < array.length; index++) {        
            if (skip) {
                if (index % 2 == 1) {
                    System.out.println("Index: " + index + "\tValue: " + array[index]);
                }
            }
            else {
                System.out.println("Index: " + index + "\tValue: " + array[index]);
            }   
        }         
    }    

    public static void printArray(double[] array, boolean skip) {
        for (int index = 0; index < array.length; index++) {        
            if (skip) {
                if (index % 2 == 1) {
                    System.out.println("Index: " + index + "\tValue: " + array[index]);
                }
            }
            else {
                System.out.println("Index: " + index + "\tValue: " + array[index]);
            }   
        }
    }    

    public static void printArray(String[] array, boolean skip) {
        for (int index = 0; index < array.length; index++) {        
            if (skip) {
                if (index % 2 == 1) {
                    System.out.println("Index: " + index + "\tValue: " + array[index]);
                }
            }
            else {
                System.out.println("Index: " + index + "\tValue: " + array[index]);
            }   
        }
    }

    //#3
    public static int lastItem(int[] array) {    
        return (array[(array.length-1)]);        
    }

    public static double lastItem(double[] array) {    
        return (array[(array.length-1)]);        
    }

    public static String lastItem(String[] array) {    
        return (array[(array.length-1)]);        
    }

    public static boolean lastItem(boolean[] array) {    
        return (array[(array.length-1)]);        
    }

    //#4
    public static int middleItem(int[] array) {    
        if (array.length%2==0) {
            return (array[(array.length/2)]);
        }
        return (array[((array.length+1)/2)]);        
    }

    public static double middleItem(double[] array) {    
        if (array.length%2==0) {
            return (array[(array.length/2)]);
        }
        return (array[((array.length+1)/2)]);        
    }

    public static String middleItem(String[] array) {    
        if (array.length%2==0) {
            return (array[(array.length/2)]);
        }
        return (array[((array.length+1)/2)]);        
    }

    public static boolean middleItem(boolean[] array) {    
        if (array.length%2==0) {
            return (array[(array.length/2)]);
        }
        return (array[((array.length+1)/2)]);         
    }

    //#5
    public static int[] randomInts(int n, int min, int max) {
        Random rand = new Random();
        int[] returnArray = new int[n];
        for (int i = 1, randomInt = 0; i != n; i++) {
            randomInt = (rand.nextInt(1+max-min))+min;
            returnArray[i] = randomInt;
        }
        return returnArray;
    }

    //#6
    public static double[] randomDoubles (int n, double min, double max) {
        Random rand = new Random();
        double randDoub = 0.0;
        double[] returnArray = new double[n];
        for (int i = 0; i != n; i++) {
            randDoub = min + (max-min) * rand.nextDouble();
            returnArray[i] = randDoub;
        }
        return returnArray;
    }

    //#7
    public static int[] copy (int[] inputArray) {
        int[] returnArray = new int[inputArray.length];        
        for (int i = 0; i != inputArray.length; i ++) {
            returnArray[i] = inputArray[i];
        }        
        return returnArray;
    }

    public static double[] copy (double[] inputArray) {
        double[] returnArray = new double[inputArray.length];        
        for (int i = 0; i != inputArray.length; i ++) {
            returnArray[i] = inputArray[i];
        }        
        return returnArray;
    }

    public static String[] copy (String[] inputArray) {
        String[] returnArray = new String[inputArray.length];        
        for (int i = 0; i != inputArray.length; i ++) {
            returnArray[i] = inputArray[i];
        }        
        return returnArray;
    }

    public static boolean[] copy (boolean[] inputArray) {
        boolean[] returnArray = new boolean[inputArray.length];        
        for (int i = 0; i != inputArray.length; i ++) {
            returnArray[i] = inputArray[i];
        }        
        return returnArray;
    }

    //#8
    public static int[] pairs (int n) {
        int[] returnArray = new int[(n*2-1)];
        for (int i = 1; i < n*2; i++) {
            if (i%2==0) {
                returnArray[i-1] = i;
            }
            else {
                returnArray[i-1] = i+1;
            }
        }
        return returnArray;
    }

    //#9
    public static int[] concat(int[] a, int[] b) {
        int[] c = new int[a.length+b.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        for (int i2 = 0; i2 < b.length; i2++) {
            c[i2+(a.length)] = b[i2];
        }
        return c;
    }

    //#10
    public static int[] merge (int[] a, int[] b) {
        int[] returnArray = new int[a.length+b.length];
        int lesserLen = 0;
        boolean isALonger = false;
        if (a.length > b.length) {
            lesserLen = b.length;
            isALonger = true;
        }
        else {
            lesserLen = a.length;
        }
        int i2 = 0;
        for (int i = 0; i <= lesserLen; i+=2) {
            returnArray[i] = a[i2];
            returnArray[i+1] = b[i2];
            i2 += 1;
        }        
        if (isALonger) {        
            for (int i3 = lesserLen; i3 < a.length; i3++) {
                returnArray[i3+lesserLen] = a[i3]; 
            }            
        }
        else {
            for (int i4 = lesserLen; i4 < b.length; i4++) {
                returnArray[i4+lesserLen] = b[i4]; 
            }  
        }        
        return returnArray;
    }

    //#11
    public static void reverse (int[] array) {
        int[] arrayReversed = new int[array.length];
        for (int i = (array.length-1); i != 0; i--) {
            arrayReversed[i] = array[i];
        }
    }

    //#12
    public static int[] subArray (int[] array, int start, int  stop) {
        int[] returnArray = new int[start-stop+1];
        for (int i = start; i != stop; i++) {
            returnArray[i-start] = array[i];
        }
        return returnArray;
    }

    //#13
    public static int[] compareArrays(int[] a, int[] b) {
        int aTotal = 0;
        int bTotal = 0;

        for (int i = 0; i != a.length; i++) {
            aTotal += a[i];
        }
        for (int i = 0; i != b.length; i++) {
            bTotal += b[i];
        }

        if (aTotal > bTotal) {
            return a;
        }

        else {
            return b;
        }

    }

    //#14
    public static int[] minimize(int[] array, int threshhold) {
        int[] modifiedArray = array;
        for (int i=0; i < array.length; i++) {
            if (array[i] > threshhold) {
                modifiedArray[i] = threshhold;
            }
        }
        return modifiedArray;
    }

    //#15
    public static void maximize(int[] array, int threshhold) {
        int[] modifiedArray = array;
        for (int i=0; i < array.length; i++) {
            if (array[i] > threshhold) {
                modifiedArray[i] = threshhold;
            }
        }
    }
    
    //#16
    public static double[] maxMerge (double[] a, double[] b) {
        int lesserLen = 0;
        boolean isALonger = false;
        if (a.length > b.length) {
            lesserLen = a.length;
            isALonger = true;
        }
        else {
            lesserLen = b.length;
        }
        double[] returnArray = new double[(lesserLen+Math.abs(a.length-b.length))];

        for (int i = 0; i < lesserLen; i++) {
            if (a[i] < b[i]) {
                returnArray[i] = a[i];
            }
            else {
                returnArray[i] = b[i];
            }
        }
        for (int i = lesserLen; i != (lesserLen+Math.abs(a.length-b.length)); i++) {
            if (isALonger) {
                returnArray[i] = a[i];
            }
            else {
                returnArray[i] = b[i];
            }
        }
        return returnArray;
    }
} 
