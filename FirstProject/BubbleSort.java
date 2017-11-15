
/**
 * Write a description of class BubbleSort here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BubbleSort
{
    public static void main(String[] args){
        int[] numbers = new int[15];
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = (int)(Math.random() * 100);
        }
        print(numbers);
        sort(numbers);
        System.out.println("\n\n");
        print(numbers);
    }

    public static void print(int[] array){
        for(int i : array){
            System.out.println(i);
        }
        System.out.println();
    }

    public static void sort(int[] array){
        boolean solved = false;
        int left;
        int right;
        while (!solved) {
            solved = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i+1]) {
                    left = array[i];
                    right = array[i+1];
                    array[i] = right;
                    array[i+1] = left;
                    solved = false;
                }
            }
        }
    }
}