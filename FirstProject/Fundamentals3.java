import java.util.Random;
public class Fundamentals3
{
    public static void main(String[] args) {
        //#1
        int[][] fiveByFive = new int[5][5];    
        int[][] fiveByFive2 =
                {{1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14,15},
                {16,17,18,19,20},
                {21,22,23,24,25}};

        double[][] fiveByFive3 = new double[5][5];    
        double[][] fiveByFive4 =
                {{1.0,10.0,9.0,0.1,0.0},
                {2.0,9.0,0.8,1.0,2.0},
                {3.0,8.0,0.7,2.0,3.0},
                {4.0,7.0,0.6,3.0,4.0},
                {5.0,6.0,0.5,4.0,5.0}};

        print2DArray(shift(fiveByFive4, 2), true); // test not part of submitting work

        //#2
        String[][] checkerboard = {{" ","#"," ","#"," "},{"#"," ","#"," ","#"},{" ","#"," ","#"," "},{"#"," ","#"," ","#"},{" ","#"," ","#"," "}};    
    }

    //#3
    public static void setValue(int[][] arr, int r, int c, int v) {
        arr[r][c] = v;
    }

    public static void setValue(double[][] arr, int r, int c, double v) {
        arr[r][c] = v;
    }

    public static void setValue(String[][] arr, int r, int c, String v) {
        arr[r][c] = v;
    }

    //#4
    public static void initializeArray(int[][] array, int value) {
        for (int[] row : array) {
            for (int col : row) {
                col = value;
            }
        }
    }

    public static void initializeArray(boolean[][] array, boolean value) {
        for (boolean[] row : array) {
            for (boolean col : row) {
                col = value;
            }
        }
    }

    public static void initializeArray(String[][] array, String value) {
        for (String[] row : array) {
            for (String col : row) {
                col = value;
            }
        }
    }

    //#5
    public static void print2DArray(int[][] array, boolean rowMajor) {
        if (rowMajor) {
            for (int[] row : array) {
                for (int col : row) {
                    System.out.print(col + " ");
                }
                System.out.print("\n");
            }
        }
        else {
            int cols = array[0].length;
            for (int i = 0 ; i < cols ; i++) {
                for (int[] row : array) {
                    System.out.print(row[i]);
                }
                System.out.print("\n");
            }
        }
    }    

    public static void print2DArray(double[][] array, boolean rowMajor) {
        if (rowMajor) {
            for (double[] row : array) {
                for (double col : row) {
                    System.out.print(col + " ");
                }
                System.out.print("\n");
            }
        }
        else {
            int cols = array[0].length;
            for (int i = 0 ; i < cols ; i++) {
                for (double[] row : array) {
                    System.out.print(row[i]);
                }
                System.out.print("\n");
            }
        }
    }    

    public static void print2DArray(boolean[][] array, boolean rowMajor) {
        if (rowMajor) {
            for (boolean[] row : array) {
                for (boolean col : row) {
                    System.out.print(col + " ");
                }
                System.out.print("\n");
            }
        }
        else {
            int cols = array[0].length;
            for (int i = 0 ; i < cols ; i++) {
                for (boolean[] row : array) {
                    System.out.print(row[i]);
                }
                System.out.print("\n");
            }
        }
    }    

    //#6
    public static void snakePrint(int[][] arr) {
        int rowLen = arr[0].length;
        boolean isEvenRow = true;
        for (int[] row : arr) {
            if (isEvenRow) {
                for (int col : row) {
                    System.out.print(col + " ");
                }
                isEvenRow = !isEvenRow;
            }
            else {
                for (int i = rowLen; i > 0; i--) {
                    System.out.print(row[i-1] + " ");
                }
                isEvenRow = !isEvenRow;
            }
        }
    }

    //#7
    public static String[][] locate(String[][] arr) {
        int numHashes = 0;
        for (String[] row : arr) {
            for (String cell : row) {
                if (cell.equals("#")){
                    numHashes += 1;
                }
            }
        }

        Random rand = new Random();

        int rand2 = rand.nextInt(numHashes);

        int randNum = rand.nextInt(9)+1;

        int hashNumber = 0;

        if (numHashes != 0) {
            for (int r = 0; r < arr.length; r ++) {
                for (int c = 0; c < arr[0].length; c++) {
                    if (arr[r][c].equals("#")){
                        if (numHashes == hashNumber) {
                            arr[r][c] = "" + randNum;
                        }
                        hashNumber += 1;
                    }
                }
            }
        }        
        
        return arr;
    }
    
    //#8
    public static int[][] replace(int[][] array, int threshold, int newValue) {
        int[][] returnArray = new int[array.length][array[0].length];
        for (int r = 0; r < array.length; r++) {
            for (int c = 0; c < array[0].length; c ++) {
                if (array[r][c] > threshold) {
                    returnArray[r][c] = newValue;
                }
                else {
                    returnArray[r][c] = array[r][c];
                }
            }
        }
        return returnArray;
    }
    
    //#9
    public static double[][] shift(double[][] arr, int shiftRow) {
        Random rand = new Random();
        double[][] returnArr = new double[arr.length][arr[0].length];
        for (int r = 0; r < arr.length; r++) {
            if (r < shiftRow) {
                for (int c = 0; c < arr[r].length; c++) {
                    returnArr[r][c] = arr[r][c];
                }
            }
            else if (r == shiftRow) {
                for (int c = 0; c < arr[r].length; c++) {
                    returnArr[r][c] = rand.nextDouble()*10 + 1;
                }
            }
            else {
                for (int c = 0; c < arr[r].length; c++) {
                    returnArr[r][c] = arr[r-1][c];
                }
            }
        }
        
        return returnArr;
    }
    
    //#10
    public static double[][] rotate(double[][] arr) {
        double[][] returnArr = new double[arr[0].length][arr.length];
        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr[0].length; c++) {
                returnArr[c][r] = arr[r][c];
            }
        }
        return returnArr;
    }
    
    public static boolean[][] analyze(double[][] array, double threshold) {
        boolean[][] returnArr = new boolean[array.length][array[0].length];
        for (int r = 0; r < array.length; r++) {
            for (int c = 0; c < array[0].length; c++) {
                if (array[r][c] > threshold) {
                    returnArr[r][c] = true;
                }
                else {
                returnArr[r][c] = false;
                }
            }
        }
        return returnArr;
    }
    
}
