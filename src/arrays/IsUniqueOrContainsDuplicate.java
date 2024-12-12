package arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

/**
 * Given an array of integers, find if the array contains any duplicates
 * your function should return true if any value appears at least twice in the array,
 * and it should return false if every element is distinct.
 */
public class IsUniqueOrContainsDuplicate {
    public static void main(String[] args) {
        int[] ints = {2, 4, 5, 6, 7, 8, 4};

        boolean isUnique1 = isUniqueArray_HashSet(ints);
        System.out.println("is Unique By HashSet        : " + isUnique1);

        boolean isUnique2 = isUniqueArray_By_Sorting(ints);
        System.out.println("is Unique by sorting ..     : " + isUnique2);

        boolean isUnique3 = isUniqueArray_BruteForce(ints);
        System.out.println("is Unique by Brute force    : " + isUnique3);

    }

    private static boolean isUniqueArray_HashSet(int[] ints) {
        Set<Integer> seen = new HashSet<>();
        for (int num : ints) {
            if (!seen.add(num)) {
                return true;
            }
        }
        return false;
        //Using java 17
//        boolean duplicaFound = IntStream.of(ints).anyMatch(in -> !seen.add(in));
    }

    private static boolean isUniqueArray_By_Sorting(int[] ints) {
        Arrays.sort(ints);

//        for (int i=1; i< ints.length; i++) {
//            if (ints[i] == ints[i-1]) {
//                return true;
//            }
//        }
//        return false;

        return IntStream.range(1, ints.length)
                .anyMatch(index -> ints[index] == ints[index - 1]);
    }


    private static boolean isUniqueArray_BruteForce(int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = i + 1; j < inputArray.length; j++) {
                if (inputArray[i] == inputArray[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
