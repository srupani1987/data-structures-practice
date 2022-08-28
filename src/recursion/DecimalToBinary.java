package recursion;

/**
 * <b><u>Convert a number from Decimal to Binary using recursion</u></b>
 * <ul>
 *     <li>Step 1 : Divide the number by 2</li>
 *     <li>Step 2 : Get the integer quotient for the next iteration</li>
 *     <li>Step 3 : Get the remainder for the binary digit</li>
 *     <li> step 4 : Repeat the steps until the quotient is equal to 0</li>
 * </ul>
 * <center><b>Below is the formula to convert Decimal to Binary</b></center>
 * <b>f(n) = n mod 2 + 10 * f(n/2)</b>
 */
class DecimalToBinary {
  public static void main(String[] args) {
    int result = decimalToBinary(15);
    System.out.println(result);

  }

  public static int decimalToBinary(int n) {
    if (n==0) {
      return 0;
    }
    return n%2 + 10*decimalToBinary(n/2);
  }
}
