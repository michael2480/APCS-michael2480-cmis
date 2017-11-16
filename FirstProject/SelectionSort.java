public class SelectionSort
{
    public static void main(String[] args){
        int[] numbers = new int[15];
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = (int)(Math.random() * 100);
        }
        print(numbers);
        sort(numbers);
        print(numbers);
    }

    public static void print(int[] array){
        for(int i : array){
            System.out.println(i);
        }
        System.out.println();
    }

    public static void sort(int[] array){
        boolean sorted = false;
        int start = 0;
        int start2= 0;
        int lowest = 0;
        int temp = 0;
        
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i+1]) {
                    start2 = i;
                    sorted = false;
                }
            }
            start = start2;
            // array start is initial
            if (!sorted) {
                lowest = 100;
                for (int i = start + 1; i < array.length; i++) {
                    lowest = start + 1;
                    if (array[lowest] > array[i])  {
                        lowest = i;
                    }
                }
                
            }
            temp = array[start];
            array[start] = array[lowest];
            array[lowest] = temp;
        }
    }
}