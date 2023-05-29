package arrays;

import java.util.Arrays;

/**
 * Write a program to check if an array contains a number
 */
public class SearchElement {
    public static void main(String[] args) {
        lenearSearch(new int[]{10, 30, 20, 50, 40}, 20);
        System.out.println();
    }

    private static void lenearSearch(int[] inputArray, int value) {
        //java7
        for (int i : inputArray) {
            if(i == value) {
                System.out.println("value found..");
                break; //to make sure not check for remaining elements once match found
            }
        }

        int result = Arrays.stream(inputArray).filter(in -> in == value).findFirst().orElse(0);
        System.out.println(result);
        /*OptionalInt first = (OptionalInt) result;
        if(first.isPresent()) {
            System.out.println("value is found");
        } else {
            System.out.println("Value is not found");
        }
        System.out.println("value not found");
//        throw  new IllegalArgumentException("Value not found in the given Array");*/
    }
}
