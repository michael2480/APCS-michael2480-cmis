
public class MergeSort
{
    /*                   a d f g w x l j h i p o
     *                a d f g w x   |   l j h i p o
     *           a d f  |  g w x    |    l j h  |  i p o
     *         a d | f  | g w  | x  |  l j  | h |  i p  | o
     *       a - d | f | g - w | x | l - j | h | i - p | o
     *       a+d  -  f  | g+w  -  x | j+l  -  h |  i+p  -  o
     *           a+f+d  -   g+w+x   |   h+j+l   -   i+p+o
     *             a+d+f+g+w+x      -      h+i+j+l+o+p
     *                   a+d+f+g+h+i+j+l+o+p+w+x                   */
    public static int[] main (String[] args) {
        int[] testArr = {1,4,2,9,77,4,5,7,22,0};
        return sort(testArr);
    }

    public static int[] sort (int[] inputArr) {
        if (inputArr.length == 1) {
            return inputArr;
        }
        else {
            int[] arr1 = split(inputArr, true);
            int[] arr2 = split(inputArr, false);
            return mergeSort(sort(arr1), sort(arr2));
        }
    }

    public static int[] mergeSort (int[] a1, int[] a2) {
        int[] sortedArr = new int[a1.length + a2.length];
        for (int i = 0; i < a1.length + a2.length; i++) { 
            if (a1.length != 0 && a2.length != 0) {
                if (a1.length == 0) {
                    sortedArr[i] = a2[i];
                }
                else if (a2.length == 0) {
                    sortedArr[i] = a1[0]
                }
            }
        }
    }
}

public static int[] split (int[] inputArr, boolean isFirstHalf) {
int len = inputArr.length; // 5
int mid = (int)(len/2); // 2
if (isFirstHalf) {
return subArray(inputArr, 0, mid); // 0 , 1 , 2
}
else {
return subArray(inputArr, mid+1, len-1); //3 , 4
}
}

public static int[] subArray (int[] inputArray, int start, int stop) {
int[] returnArr = new int[stop-start+1];
for (int i = 0; i < returnArr.length; i++) {
returnArr[i] = inputArray[i+start];
}
return returnArr;
}
}
