package recursion;

public class FibonacciSolution {
    public static void main(String[] args) {
        for (int i=0; i<10; i++) {
            System.out.println(fibonacci(i));
        }

    }

    private static int fibonacci(int number) {
        if (number < 0) {
            return -1;
        }
        if (number == 0 || number == 1) {
            return number;
        }
        int fibo = fibonacci(number - 1) + fibonacci(number - 2);
        return fibo;
    }
}
