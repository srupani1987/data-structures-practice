package arrays;

public class SumDiagonal2DArray {
    public static void main(String[] args) {
        int sumDiagonal = sumDiagonal(new int[][]{{1,2,3}, {4, 5, 6}, {7,8,9}});
        System.out.println(sumDiagonal);
    }

    private static int sumDiagonal(int[][] ints) {
        int sum = 0;

        for (int i=0; i<ints.length; i++) {
            sum += ints[i][i];
        }
        return sum;
    }
}
