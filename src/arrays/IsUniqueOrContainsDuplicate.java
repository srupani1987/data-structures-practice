package arrays;

/**
 * Given an array of integers, find if the array contains any duplicates
 * your function should return true fi any value appears at least twice in the array,
 * and it should return false if every element is distinct.
 */
public class IsUniqueOrContainsDuplicate {
    public static void main(String[] args) {
        boolean uniqueArray = isUniqueArray(new int[]{2, 4, 5, 6, 7, 8, 4});
        System.out.println(uniqueArray);
    }

    private static boolean  isUniqueArray(int[] inputArray) {
        for (int i=0; i<inputArray.length; i++) {
            for (int j=i+1; j<inputArray.length; j++) {
                if (inputArray[i] == inputArray[j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
