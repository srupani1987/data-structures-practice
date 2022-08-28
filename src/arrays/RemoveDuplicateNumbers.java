package arrays;

import java.util.Arrays;

/*
removeDuplicates({1,1,2,2,3,4,5})
output : [1,2,3,4,5]

Note: Assume array is sorted in ascending order
 */
public class RemoveDuplicateNumbers {
    public static void main(String[] args) {
        int[] array = {1, 1, 3, 2, 2, 7, 3, 1, 4, 5, 5};
        Arrays.sort(array);
        int[] uniqueArray = removeDuplicates(array);

        System.out.println(Arrays.toString(uniqueArray));
    }

    public static int[] removeDuplicates(int[] array) {
        int result = removeDuplicates(array, array.length);
        int[] uniqueArray = new int[result];
        for (int i = 0; i < result; i++) {
            uniqueArray[i] = array[i];
        }
        System.out.println(Arrays.toString(uniqueArray));
        return uniqueArray;

    }

    private static int removeDuplicates(int[] array, int length) {
        if (length == 0 || length == 1) {
            return length;
        }

        int j = 0;

        for (int i = 0; i < length - 1; i++) {
            if (array[i] != array[i + 1]) {
                array[j++] = array[i];
            }
        }
        array[j++] = array[length - 1];
        return j;
    }
}
