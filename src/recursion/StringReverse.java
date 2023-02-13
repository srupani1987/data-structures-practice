package recursion;

public class StringReverse {
    public static void main(String[] args) {
        String revString = reverse("Suresh");

        System.out.println(revString);

    }

    private static String reverse(String str) {
        if (str.isEmpty()) {
            return str;
        }
        return reverse(str.substring(1)) + str.charAt(0);
    }
}
