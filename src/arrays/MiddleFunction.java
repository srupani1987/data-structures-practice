package arrays;

import java.util.Arrays;

/**
 * Write a function called middle that takes a list and return a new list that contains all but the first and last elements
 * Input : myArray = [1, 2, 3, 4]
 * Output: [2, 3]
 */
public class MiddleFunction {
    public static void main(String[] args) {
        int[] middle = middleArray_Inbuilt_Arrays_Function(new int[] {1, 2, 3, 4});
        System.out.println(Arrays.toString(middle));

        int[] middle1 = middleArray_Inbuilt_Arrays_Function(new int[] {1, 2, 3, 4});
        System.out.println(Arrays.toString(middleArray_Custom_Function(middle1)));

        int[] middle2 = middleArray_Inbuilt_Arrays_Function(new int[] {1});
        System.out.println(Arrays.toString(middleArray_Custom_Function(middle2)));
    }

    private static int[] middleArray_Inbuilt_Arrays_Function(int[] ints) {
        if (ints.length < 2) {
            return new int[0];
        }
        // Use Stream to slice the array, skip the first and limit to all but the last
        return Arrays.stream(ints, 1, ints.length - 1)
                .toArray();
        
//        return Arrays.copyOfRange(ints, 1, ints.length-1);
    }


    private static int[] middleArray_Custom_Function(int[] intArray) {
        if(intArray.length < 2) {
            return  new int[0];
        }

        int[] middleArray = new int[intArray.length - 2];

        int index = 1;

        while (index < intArray.length -1) {
            middleArray[index-1] = intArray[index];
            index++;
        }
        return middleArray;
    }
}
