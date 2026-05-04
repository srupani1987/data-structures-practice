package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Sort array using QuickSort, then remove duplicates.
 *
 * Input:  {5, 3, 1, 3, 2, 5, 7, 1, 4}
 * Output: [1, 2, 3, 4, 5, 7]
 */
public class QuickSortRemoveDuplicates {

    public static void main(String[] args) {
        int[] array = {5, 3, 1, 3, 2, 5, 7, 1, 4};
        System.out.println("Original: " + Arrays.toString(array));

        quickSort(array, 0, array.length - 1);
        System.out.println("Sorted:   " + Arrays.toString(array));

        int[] result = removeDuplicates(array);
        System.out.println("Unique:   " + Arrays.toString(result));
    }

    static void quickSort(int[] arr, int low, int high) {
        // base case: a subarray of 0 or 1 elements is already sorted
        if (low < high) {
            // place pivot at its correct position and get that index
            int pivotIndex = findPivotIndex(arr, low, high);

            quickSort(arr, low, pivotIndex - 1);  // sort left of pivot
            quickSort(arr, pivotIndex + 1, high); // sort right of pivot
        }
    }

    private static int findPivotIndex(int[] arr, int low, int high) {
        // use the last element as the pivot value
        // pivotIndex tracks the boundary of elements <= pivot
        int pivotIndex = low - 1;

        for (int j = low; j <= high; j++) {
            if (arr[j] <= arr[high]) {  // compare each element with pivot
                pivotIndex++;           // expand the <= region
                // swap arr[pivotIndex] and arr[j]
                int temp = arr[pivotIndex];
                arr[pivotIndex] = arr[j];
                arr[j] = temp;
            }
        }
        // when j == high, pivot itself satisfies arr[j] <= arr[high],
        // so it gets swapped into pivotIndex — its correct sorted position
        return pivotIndex;
    }

    static int[] removeDuplicates(int[] sorted) {
        if (sorted.length == 0) return sorted;

        List<Integer> unique = new ArrayList<>();
        unique.add(sorted[0]); // first element is always unique

        for (int i = 1; i < sorted.length; i++) {
            // since array is sorted, duplicates are adjacent — skip them
            if (sorted[i] != sorted[i - 1]) {
                unique.add(sorted[i]);
            }
        }

        return unique.stream().mapToInt(Integer::intValue).toArray();
    }
}
