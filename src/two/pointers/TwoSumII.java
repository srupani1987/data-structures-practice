package two.pointers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumII {
    public static void main(String[] args) {
        int[] inputArray = {1, 2, 3, 4};
        int target = 3;
        int[] twoSum = twoSumByBruteForce(inputArray, target);
        System.out.println("By Brute Force : " + Arrays.toString(twoSum));

        int[] twoSum1 = twoSumByHashMap(inputArray, target);
        System.out.println("By HashMap : " + Arrays.toString(twoSum1));

        int[] twoSum3 = twoSumByTwoPointers(inputArray, target);
        System.out.println("By Two Pointers : " + Arrays.toString(twoSum1));
    }

    private static int[] twoSumByTwoPointers(int[] inputArray, int target) {
        int left = 0, right = inputArray.length - 1;
        while (left < right) {
            int curSum = inputArray[left] + inputArray[right];
            if (curSum > target) {
                right--;
            } else if (curSum < target) {
                left++;
            } else {
                return new int[]{left + 1, right + 1};
            }
        }
        return new int[0];
    }

    private static int[] twoSumByHashMap(int[] inputArray, int target) {
        Map<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < inputArray.length; i++) {
            int temp = target - inputArray[i];
            if (mp.containsKey(temp)) {
                return new int[]{mp.get(temp), i + 1};
            }
            mp.put(inputArray[i], i + 1);
        }
        return new int[0];
    }

    private static int[] twoSumByBruteForce(int[] inputArray, int target) {
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = i + 1; j < inputArray.length; j++) {
                if (inputArray[i] + inputArray[j] == target) {
                    return new int[]{i + 1, j + 1};
                }
            }
        }
        return new int[0];
    }
}
