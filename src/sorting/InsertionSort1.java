package sorting;


public class InsertionSort1 {
    public static void main(String[] args) {
        int arr[] = { 12, 11, 13, 5, 6 };
        sort(arr);
        printArray(arr);
    }

    private static void printArray(int[] arr) {
        for (int i=0; i<arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    private static void sort(int[] arr) {
        for(int i=0; i< arr.length; i++) {
            int j = i-1;
            while (j >=0 && arr[j] > arr[j+1]) {
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                j--;
            }
        }
    }
}
