package arrays;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

/**
 * Given an array, write a function to get first, second best scores from the array.
 * Array may contain duplicates.
 */

public class BestScore {
    public static void main(String[] args) {
        String firstSecond = firstAndSecond(new Integer[]{1, 2, 4, 6,7, 7, 5, 9 ,22, 3});
        System.out.println(firstSecond);
    }

    private static String firstAndSecond(Integer[] ints) {
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
}
