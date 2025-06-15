package arrays;

public class ProductsOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 6};
        int[] result = productExceptSelf(nums);

        // Output the result
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        // Step 1: Calculate the left product for each element
        result[0] = 1; // There are no elements to the left of the first element
        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }

        // Step 2: Calculate the right product and update the result array
        int rightProduct = 1; // There are no elements to the right of the last element
        for (int i = n - 1; i >= 0; i--) {
            result[i] = result[i] * rightProduct;
            rightProduct *= nums[i]; // Update rightProduct for the next iteration
        }

        return result;
    }
}
