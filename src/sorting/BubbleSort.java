package sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 1, 6, 8, 4, 9, 7};
        System.out.println(arr);

        printArray(arr);
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println();
        printArray(arr);
    }
    static void printArray(int[] testArray) {
        for (int in : testArray) {
            System.out.print(in + " ");
        }
    }
}
/**
 * The bubble sort algorithm is a reliable sorting algorithm. This algorithm has a worst-case time complexity of O(n2).
 * The bubble sort has a space complexity of O(1). The number of swaps in bubble sort equals the number of inversion pairs in the given array.
 */