package recursion;

public class ReverseNumber {

    public static int REVERSED_NUMBER  = 0;
    public static void main(String[] args) {
        reverseNumber(23568);
        System.out.println(REVERSED_NUMBER);
    }
    private static void reverseNumber(int num) {
        if (num <=0) {
            return ;
        }
        int reminder = num %10;
        REVERSED_NUMBER = (REVERSED_NUMBER * 10 ) + reminder;
        reverseNumber(num / 10);
    }
}
