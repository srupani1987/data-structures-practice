package arrays;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Given an integer array nums, return true if any value appears more than once in the array,
 * otherwise return false.
 *
 * Example 1:
 * Input: nums = [1, 2, 3, 3]
 * Output: true
 *
 * ************************ Time and Space Complexity **********************************
 *
 * HashSet (O(n) time complexity, O(n) space complexity): Efficient for checking duplicates.
 * Sorting (O(n log n) time complexity, O(1) space complexity if in-place sorting): Simple, but involves sorting the array first.
 * Brute Force (O(n²) time complexity, O(1) space complexity): Inefficient for large arrays but very straightforward.
 * Streams (O(n) time complexity, O(n) space complexity): Concise and modern approach using Java streams.
 * HashMap (O(n) time complexity, O(n) space complexity): Useful if you need to count frequencies, but slightly overkill if only detecting duplicates.
 */
public class ContainsDuplicates {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,3};
        System.out.println("By HashSet : " + hasDuplicateByHashSet(numbers));
        System.out.println("By Sorting : " + hasDuplicateBySorting(numbers));
        System.out.println("By Brute Force : " + hasDuplicateByBruteForce(numbers));
        System.out.println("By Streams : " + hasDuplicateByStreams(numbers));
        System.out.println("By Map : " + hasDuplicateByMap(numbers));
    }

    private static boolean hasDuplicateByMap(int[] numbers) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : numbers) {
            map.put(i, map.getOrDefault(i, 0) +1);

            if (map.get(i) > 1) {
                return true;
            }
        }
        return false;
    }

    private static boolean hasDuplicateByStreams(int[] numbers) {
        Set<Integer> uniqeSet = IntStream.of(numbers).boxed().collect(Collectors.toSet());
        return uniqeSet.size() < numbers.length;
    }

    private static boolean hasDuplicateByBruteForce(int[] numbers) {
        for (int i = 0; i <numbers.length; i++) {
            for (int j = i+1; j <numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean hasDuplicateByHashSet(int[] numbers) {
        Set<Integer> seen = new HashSet<>();
        for (int i: numbers) {
           if (!seen.add(i)) {
               return true;
           }
        }
        return false;
    }

    private static boolean hasDuplicateBySorting(int[] numbers) {
        Arrays.sort(numbers);
        for (int i=0; i<numbers.length; i++) {
            if (numbers[i] == numbers[i+1]) {
                return true;
            }
        }
        return false;
    }
}
