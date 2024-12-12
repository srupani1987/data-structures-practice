package arrays;

/**
 * Function to find the middle element of an array
 * Case 1: If the array length is odd, return the middle element.
 * Case 2: If the array length is even, return the average of the two middle
 */
public class MiddleFunction2 {
    public static void main(String[] args) {
        int[] oddArray = {10, 20, 30, 40, 50};
        int[] evenArray = {10, 20, 30, 40};

        System.out.println(findMiddleElement(oddArray));
        System.out.println(findMiddleElement(evenArray));
    }

    private static int findMiddleElement(int[] array) {
        int length = array.length;

        if(length % 2 == 1) {
            return array[array.length / 2];
        } else {
            int middle1 = array[(length/2) -1];
            int middle2 = array[(length/2)];

            return  (middle1 + middle2) / 2;
        }
    }
}
