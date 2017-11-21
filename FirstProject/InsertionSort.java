public class InsertionSort {

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

    public static int[] sort(int[] array) {

        int[] arrayCopy = new int[array.length];

        // copy array into arrayCopy
        System.arraycopy(array, 0, arrayCopy, 0, array.length);

        for (int focus = 0; focus < arrayCopy.length; focus ++) {

            System.arraycopy( shift(arrayCopy, focus), 0, arrayCopy, 0, array.length);

        }
        return arrayCopy;
    }

    public static int[] shift (int[] arr, int focus) {
        int newFocusIndex = 0;
        for (int i = 0; i < focus; i++) {
            if (arr[i] >= arr[focus]) {
                newFocusIndex = i;
                break;
            }
        }

        int tmp = arr[focus];
        for (int i = newFocusIndex; i < focus; i++) {
            arr[i] = tmp;
            tmp = arr[i+1];
        }

        return arr;
    }

    public static void print(int[] array){
        for(int i : array){
            System.out.print(i + " | ");
        }
        System.out.println();
    }

}