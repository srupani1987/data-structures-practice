package arrays;

import java.util.Arrays;
import java.util.Collections;

/**
 * Given an array, write a function to get first, second best scores from the array.
 * Array may contain duplicates.
 */

public class BestScore {
    public static void main(String[] args) {
        Integer[] intArray = {30, 1, 2, 4, 6, 7, 7, 5, 9, 22, 32,3};
        String firstSecond = firstAndSecond(intArray);
        System.out.println(firstSecond);

        //alternate way without sorting the array
        findFirstAndSecond(new Integer[]{30, 1, 2, 4, 6, 7, 7, 5, 9, 22, 3});


    }

    private static String firstAndSecond(Integer[] ints) {
        //sorting in descending..
        Arrays.sort(ints, Collections.reverseOrder());

        int first = ints[0];

        Integer second = null;

        for (int i = 0; i< ints.length; i++) {
            if (ints[i] != first) {
                second = ints[i];
                break;
            }
        }
        return first + " "+second;
    }

    private static void findFirstAndSecond(Integer[] intArray) {
        int max =0; int secondMax = 0;

        for (int i=0; i< intArray.length; i++) {
            if (intArray[i] > max) {
                secondMax = max;
                max = intArray[i];
            } else if (intArray[i] > secondMax) {
                secondMax = intArray[i];
            }
        }

        System.out.println(max + " : "+secondMax);
    }
}
