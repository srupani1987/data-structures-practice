package recursion;

public class ProductOfArray {
    public static void main(String[] args) {
        int prodcut = prodcutOfArray(new int[]{2,3,4,5}, 4);
        System.out.println(prodcut);
    }

    private static int prodcutOfArray(int[] array, int n) {
        if (n <= 0) {
            return 1;
        }
        return prodcutOfArray(array, n-1) * array[n-1];
    }
}
