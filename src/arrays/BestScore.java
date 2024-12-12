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

        for (Integer anInt : ints) {
            if (anInt != first) {
                second = anInt;
                break;
            }
        }
        return first + " "+second;
    }

    private static void findFirstAndSecond(Integer[] intArray) {
        int max =0; int secondMax = 0;

        for (Integer integer : intArray) {
            if (integer > max) {
                secondMax = max;
                max = integer;
            } else if (integer > secondMax) {
                secondMax = integer;
            }
        }

        System.out.println(max + " : "+secondMax);
    }
}
