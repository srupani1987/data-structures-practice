package recursion;

/**
 * Calculate power of a number using recursion
 * <br>-------------------------------------------
 * <t></t><br> Below is the formula to calculate the power of number
 * <br> X<sup>n</sup> =  X* X<sup>n-1</sup><br>
 *  ----------------------------------------
 *
 */
class PowerOfNumberUsingRecursion {
    public static void main(String[] args) {
      int result = power(2, -2);
        System.out.println(result);
    }
    public static int power(int base, int exp) {
        if (exp < 0 ) {
            return -1;
        }
        if (exp == 0 || exp == 1) {
            return base;
        }
        return base * power(base, exp - 1);
    }
}
