package arrays;

/**
 * Write a program to find maximum product of two integers in the array where
 * all elements are positive.
 */
public class MaximumProduct {
    public static void main(String[] args) {
        String pairs = maxProduct(new int[]{10, 50, 20, 30, 40});
        System.out.println(pairs);
    }

    private static String maxProduct(int[] inputArray) {
        int maxProduct = 0;
        String pairs = "";
        for(int i=0; i<inputArray.length; i++) {
            for(int j=i+1; j<inputArray.length; j++ ) {
                if(inputArray[i] * inputArray[j] > maxProduct) {
                    maxProduct = inputArray[i] * inputArray[j];
                     pairs = inputArray[i] + ","+ inputArray[j];
                }
            }
        }
        return pairs;
    }
}
