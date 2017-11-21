public class SelectionSort {
    public static int[] sort(int[] array) {

        int[] arrayCopy = new int[array.length];
        int indexOfLeast;

        // copy array into arrayCopy
        System.arraycopy(array, 0, arrayCopy, 0, array.length);

        // for every item in the array
        for (int i = 0; i < arrayCopy.length - 1; i++) {

            indexOfLeast = 0;

            // for every time after it
            for (int i2 = i; i2 < arrayCopy.length; i2++) {

                // make first item the current min
                if (indexOfLeast == 0) {
                    indexOfLeast = i2;
                }

                // set indexOfLeast as the min thereafter
                else {
                    if (arrayCopy[i2] < arrayCopy[indexOfLeast]) {
                        indexOfLeast = i2;
                    }
                }

                // switch the two and return
                switchIndexes(arrayCopy, i, indexOfLeast);

            }

        }

        return arrayCopy;
    }

    public static int[] switchIndexes (int[] arr, int idx1, int idx2) {
        int tmp;
        if (idx1 != idx2) {
            tmp = arr[idx1];
            arr[idx1] = arr[idx2];
            arr[idx2] = tmp;
        }
        return arr;
    }
}