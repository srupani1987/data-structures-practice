package recursion;

/**
 * Find the sum of digits of a positive integer numbers using recursion
 * <br>
 * <b></B>Example:</b>
 * <ul>
 *     <li>10   10/10 = 1 and remainder = 0</li>
 *     <li>54   54/10 = 5 and remainder = 4</li>
 *     <li>112  112/10  = 11 and remainder = 2</li>
 *     <li>11/10   = 1 and remainder = 1</li>
 *     <li><b>Equation :  f(n) = n%10 + f(n/10)</b></li>
 * </ul>
 *
 */
class SumOfDigits {
    public static void main(String[] args) {
        int result = sumofDigits(111);
        System.out.println(result);

    }

    public static int sumofDigits(int n) {
        if (n == 0 || n < 0) {
            return 0;
        }
        return n % 10 + sumofDigits(n / 10);
    }
}
