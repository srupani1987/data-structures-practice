package arrays;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.OptionalInt;

/**
 * You are given two integer arrays.
 * write a program to check if they are permutation of each other
 *
 * if two arrays are said permutation, if both the arrays are having the same elements,
 * no matter where the element is (index)
 * Example:
 * [2, 1, 3, 5, 4, 6]
 * [1, 3, 2, 4, 6, 5]
 */
public class PermutationOfEachOther {
    public static void main(String[] args) {
        boolean isPermutation = isPermutation(new int[]{1, 2, 3, 5, 4, 6},
                new int[]{1, 3, 2, 4, 6, 5});
        System.out.println(isPermutation);
        System.out.println("test cherry pick");
        //test
        //test2
    }

    //Java8
    private static boolean isPermutation(int[] inArray1, int[] inArray2) {
        System.out.println("im in test1 branch");
        if (inArray1.length != inArray2.length) {
            return false;
        } else {
            int sum1 = Arrays.stream(inArray1).sum();
            int sum2 = Arrays.stream(inArray2).sum();

            OptionalInt product1 = Arrays.stream(inArray1).reduce((i1, i2) -> i1 * i2);
            OptionalInt product2 = Arrays.stream(inArray2).reduce((i1, i2) -> i1 * i2);

            return sum1 == sum2 && product1.getAsInt() == product2.getAsInt();
        }
    }

    //Java 7
    private static boolean isPermutation1(int[] inArray1, int[] inArray2) {
        if (inArray1.length != inArray2.length) {
            return false;
        }
        int sum1 = 0;
        int sum2 = 0;
        int mul1 = 1;
        int mul2 = 1;

        for (int i=0; i< inArray1.length; i++) {
            sum1 += inArray1[i];
            sum2 += inArray2[i];
            mul1 *= inArray1[i];
            mul2 *= inArray2[i];
        }
        return sum1 == sum2 && mul1 == mul2;
    }
}
