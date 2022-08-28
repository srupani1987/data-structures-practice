package recursion;

/**
 * Find GCD (The Greatest Common Divisor) of two number using recursion
 *  --------------------------------------------------<br>
 *    gcd(8, 12) = 4 <br>
 *    8 = 2*2*2 <br>
 *    12 = 2*2*3 <br>
 *          2*2 is common in both 8 and 12<br>
 *   --------------------------------------------------<br><br>
 *   <b><u>Euclidean Algorithm</u></b> <br>
 *   gcd(48, 18)
 *   <br> Step1: 48/18 = 2 remainder 12
 *   <br> Step2: 18/12 = 1 remainder 6
 *   <br> step3: 12/6  = 2 remainder 0
 *    <br><br>
 * <b><u>Below is the formula for GCD</u></b>
 * <ul>
 *     <li>gcd(a, 0) = a</li>
 *     <li>gcd(a, b) =  gcd(b, a mod b)</li>
 * </ul>
 */
class GCD {
    public static void main(String[] args) {
        int result = gcd(-8, 4);
        System.out.println(result);
    }

    public static int gcd(int a, int b) {
        if (a < 0 || b < 0) {
            return -1;
        }
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
