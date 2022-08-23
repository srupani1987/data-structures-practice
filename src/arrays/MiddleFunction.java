package arrays;

import java.util.Arrays;

/**
 * Write a function called middle that takes a list and return a new list that contains all but the first and last elements
 * Input : myArray = [1, 2, 3, 4]
 * Output: [2, 3]
 */
public class MiddleFunction {
    public static void main(String[] args) {
        int[] middle = middleArray(new int[] {1, 2, 3, 4});
        System.out.println(Arrays.toString(middle));
    }

    private static int[]  middleArray(int[] ints) {
        return Arrays.copyOfRange(ints, 1, ints.length-1);
    }
}
