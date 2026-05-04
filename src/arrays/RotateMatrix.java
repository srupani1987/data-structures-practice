package arrays;

import java.util.Arrays;

/**
 * Given an image represented by an NxN matrix write a method to rotate the image by 90 degrees.
 *
 *  1 2 3           7 4 1
 *  4 5 6      ==>  8 5 2
 *  7 8 9           9 6 3
 *
 *  Input : matrix =[[1,2,3], [4,5,6], [7,8,9]]
 *  output : [[7,4,1], [8,5,2], [9,6,3]]
 */

public class RotateMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3}, {4,5,6}, {7,8,9}};
        rotateMatrix(matrix);
        System.out.println(Arrays.deepToString(matrix));


    }

    public static void rotateMatrix(int[][] matrix) {
        if (matrix.length == 0 || matrix.length != matrix[0].length) return;
        int n = matrix.length;
        for (int first = 0; first < n/2; first++) {
            int last = n - 1 - first;
            for (int i=first; i<last; i++) {
                int offset = i - first;
                int top = matrix[first][i];
                matrix[first][i] = matrix[last-offset][first];
                matrix[last-offset][first] = matrix[last][last-offset];
                matrix[last][last-offset] = matrix[i][last];
                matrix[i][last] = top;

            }

        }

    }
}
