package sorting;

public class QuickSort {


    public static void main(String[] args) {
        int[] array = {1,10,4,7,3,2,11,5,6,8,9,1};
        quickSort(array, 0, array.length-1);
        printArray(array);
    }
    public static void quickSort(int[] array, int startIndex, int endIndex) {
        if (startIndex < endIndex) {
            int pivot = partition(array, startIndex, endIndex);
            // Recursively sort elements before partition and after partition
            quickSort(array, startIndex, pivot -1);
            quickSort(array, pivot + 1, endIndex);
        }
    }

    /**
     * /* This function takes last element as pivot,
     *        places the pivot element at its correct
     *        position in sorted array, and places all
     *        smaller (smaller than pivot) to left of
     *        pivot and all greater elements to right
     *        of pivot
     * @param array
     * @param startIndex
     * @param endIndex
     * @return
     */
    static int partition(int[] array, int startIndex, int endIndex) {
        int pivot = endIndex;
        int i = startIndex - 1;
        for (int j= startIndex; j<=endIndex; j++) {
            if (array[j] <= array[pivot]) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        return i;
    }

    public static void printArray(int []array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+"  ");
        }
    }

}
