package arrays;

/**
 * Write a program to find all pairs of an integer array whose sum is equal to a
 * given number
 * Example :
 * pairSum({2,4,3,5,6,-2,4, 7, 8, 9}, 7)
 * output: "2:5 4:3 3:4 -2:9"
 */
public class PairsSumEquals {
    public static void main(String[] args) {
        String sumPairs = pairSum(new int[]{2, 4, 3, 5, 6, -2, 4, 7, 8, 9}, 7);
        System.out.println(sumPairs);
    }

    private static String pairSum(int[] inputAray, int targetSum) {
        String resultString  = "";
        for (int i=0; i<inputAray.length;  i++) {
            for (int j=i+1; j<inputAray.length; j++) {
                if (inputAray[i] + inputAray[j] == targetSum) {
                    resultString += inputAray[i] +":"+inputAray[j] +" ";
                }
            }
        }
        return resultString;
    }
}
