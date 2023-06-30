package searching;

public class LinearSearch {
    public static void main(String[] args) {
        int[] intArray = {3,5,2,7,4,9,1,8};
        int index = linearSearch(intArray, 11);

        if (index == -1) {
            System.out.println("Element is not found in the Array.");
        } else {
            System.out.println("Element found at position : "+index);
        }
    }

    private static int linearSearch(int[] intArray, int searchElement) {
        for (int i=0; i<intArray.length; i++) {
            if (intArray[i] == searchElement) {
                return i;
            }
        }
        return -1;
    }
}
