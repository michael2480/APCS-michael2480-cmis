import java.util.Arrays;

public class MergeSort
{
    /*                   a d f g w x l j h i p o
     *                a d f g w x   |   l j h i p o
     *           a d f  |  g w x    |    l j h  |  i p o
     *         a d | f  | g w  | x  |  l j  | h |  i p  | o
     *        a - d | f | g - w | x | l - j | h | i - p | o
     *       a+d  -  f  | g+w  -  x | j+l  -  h |  i+p  -  o
     *           a+f+d  -   g+w+x   |   h+j+l   -   i+p+o
     *             a+d+f+g+w+x      -      h+i+j+l+o+p
     *                   a+d+f+g+h+i+j+l+o+p+w+x                   
     */

    public static int[] main (String[] args) {
        int[] testArr = {1,4,2,9,77,4,5,7,22,0};
        return mainSort(testArr);
    }

    public static int[] mainSort (int[] inputArr) {
        //System.out.println(inputArr.length);
        if (inputArr.length == 1) {
            return inputArr;
        }
        else {
            int len = inputArr.length;
            if (len == 2) {
                return merge(mainSort(new int[] {inputArr[0]}), mainSort(new int[] {inputArr[1]}));
            }
            else if (len == 3) {
                return merge(mainSort(subArray((inputArr), 0, 2)), mainSort(new int[] {inputArr[2]}));
            }
            else {
                return merge(mainSort(subArray((inputArr), 0, len/2)), mainSort(subArray((inputArr), (len/2), len)));
            }
        }
    }

    public static int[] merge (int[] a1, int[] a2) {
        int[] sortedArr = new int[a1.length + a2.length];
        int a1pos = 0;
        int a2pos = 0;
        for (int i = 0; i < a1.length + a2.length; i++) { 
            if (!(a1pos == a1.length && a2pos == a2.length)) {
                if (a1pos == a1.length) {
                    sortedArr[i] = a2[a2pos];
                    a2pos += 1;
                }
                else if (a2pos == a2.length) {
                    sortedArr[i] = a1[a1pos];
                    a1pos += 1;
                }
                else {
                    if (a1[a1pos] <= a2[a2pos]) {
                        sortedArr[i] = a1[a1pos];
                        a1pos += 1;
                    }
                    else {
                        sortedArr[i] = a2[a2pos];
                        a2pos += 1;
                    }
                }
            }
        }
        return sortedArr;
    }

    public static int[] subArray (int[] inputArray, int start, int stop) {
        int[] returnArr = new int[stop-start];
        for (int i = 0; (i+start < stop); i++) {
            returnArr[i] = inputArray[i+start];
        }
        return returnArr;
    }   
    
    
}
