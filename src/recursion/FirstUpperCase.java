package recursion;

/**
 * Given a string find its first uppercase letter
 *
 * Example
 *
 * Input : appmillerS
 * Output : S
 */
public class FirstUpperCase {
    public static void main(String[] args) {
        char upper = firstUpper("appmZillerS");
        System.out.println(upper);
    }

    private static char firstUpper(String str) {
        if(str.isEmpty()) {
            return ' ';
        }
        if (Character.isUpperCase(str.charAt(0))) {
            return str.charAt(0);
        }else {
            return firstUpper(str.substring(1));
        }
    }
}
