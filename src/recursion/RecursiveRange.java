package recursion;

public class RecursiveRange {
    public static void main(String[] args) {
        int recursiveRange = recursiveRange(5);
        System.out.println(recursiveRange);
    }

    private static int recursiveRange(int number) {
        if (number <= 0) {
            return 0;
        }
        return number + recursiveRange(number-1);
    }
}
