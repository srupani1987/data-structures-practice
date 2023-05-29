package recursion;

public class StringPermuations {
    public static void main(String[] args) {
        String str = "Geek";
        printPermuatations(str, "");
        System.out.println();
        //printDistinctPermutn(str, "");
    }

    private static void printPermuatations(String str, String ans) {
        //if str is empty
        if (str.length() == 0) {
            System.out.print(ans + " ");
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            //Rest of the String after excluding the ith character
            String ros = str.substring(0, i) + str.substring(i + 1);

            //recursive call
            printPermuatations(ros, ans + ch);
        }
    }

    // Function to print all the distinct
    // permutations of str
    static void printDistinctPermutn(String str, String ans) {

        // If string is empty
        if (str.length() == 0) {

            // print ans
            System.out.print(ans + " ");
            return;
        }

        // Make a boolean array of size '26' which
        // stores false by default and make true
        // at the position which alphabet is being
        // used
        boolean[] alpha = new boolean[26];

        for (int i = 0; i < str.length(); i++) {

            // ith character of str
            char ch = str.charAt(i);

            // Rest of the string after excluding
            // the ith character
            String ros = str.substring(0, i) + str.substring(i + 1);

            // If the character has not been used
            // then recursive call will take place.
            // Otherwise, there will be no recursive
            // call
            if (!alpha[Character.toLowerCase(ch) - 'a']) {
                printDistinctPermutn(ros, ans + ch);
            }
            alpha[Character.toLowerCase(ch) - 'a'] = true;
        }
    }
}
