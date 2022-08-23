package arrays;

import java.util.Arrays;

/**
 * <p>Given an array of integers nums and an integer target, return indicate of the two numbers such that they add up to target</p>
 * <p>You may assume that each input would have exactly one solution, and you may not use the same elements twice.</p>
 * <p>you can return the answer in any order </p>
 *
 * <p><b>Example 1:</b></p>
 *  <p> Input : nums = [2,7,11, 15], target =9</p>
 *  <p>Output: [0, 1]</p>
 *
 */
public class PairsTwoSum {
    public static void main(String[] args) {
         int[] result = twoSum(new int[]{2, 7, 11, 15}, 9);
        System.out.println(Arrays.toString(result));
    }

    private static int[] twoSum(int[] inputArray, int target) {
        for (int i =0; i< inputArray.length; i++) {
            for (int j=i+1; j<inputArray.length; j++) {
                if(inputArray[i] + inputArray[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("No Solution found");
    }

}
