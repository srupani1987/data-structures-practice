package test;

import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
//        int[] testArray = new int[10];
//        Arrays.stream(testArray).forEach(System.out::println);
//        Arrays.fill(testArray, Integer.MIN_VALUE);
//        Arrays.stream(testArray).forEach(System.out::println);

        int[][] array = new int[3][3];
        for(int i=0; i<array.length; i++) {
            for(int j=0; j< array.length; j++) {
                array[i][j] = Integer.MIN_VALUE;
            }
        }
//        Arrays.fill(array, Integer.MIN_VALUE);
//        Arrays.stream(array).forEach(System.out::println);
        System.out.println(Arrays.deepToString(array));


        String[][] stringArray = {{"a", "b"}, {"a", "b", "c"}};
        System.out.println(Arrays.deepToString(stringArray));

    }
}
