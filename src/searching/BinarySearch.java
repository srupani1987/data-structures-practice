package searching;

/**
 * for BinarySearch we need a sorted array, for unsorted array binary search will not work
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] intArray = {1,2,3,4,5,6,7,8,9,10};

        int index = binarySearch(intArray, 4);
        if (index == -1) {
            System.out.println("Element is not found in the Array.");
        } else {
            System.out.println("Element found at position : "+index);
        }
    }

    private static int binarySearch(int[] array, int value) {
        int start = 0;
        int end = array.length - 1;
        int middle = (start + end) / 2;
        while (array[middle] != value && start <= end) {
            if (value < array[middle]) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }
            middle = (start + end) / 2;
            System.out.println(start + " : " + middle + " : " + end);
        }

        if (value == array[middle]) {
            System.out.println("Element is found at the index : " + middle);
            return middle;
        } else {
            System.out.println("The Element "+value+" Not found");
            return -1;
        }

    }
}

/**
 Time Complexity:
 Best Case: O(1)
 Average Case: O(log N)
 The Worst Case: O(log N)
 Auxiliary Space: O(1), If the recursive call stack is considered then the auxiliary space will be O(logN).
 */
