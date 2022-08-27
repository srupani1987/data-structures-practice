package arrays;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MissingNumber {
    public static void main(String[] args) {
        IntStream intStream = IntStream.rangeClosed(1, 100);
        List<Integer> intList = intStream.boxed().collect(Collectors.toList());
        int sum2 = intList.stream().mapToInt(i -> i).filter(i -> i != 8).sum();
        List<Integer> missingList = intList.stream().filter(in -> in != 7).collect(Collectors.toList());

        int sum = intList.size() * (intList.size() + 1) / 2;  // n * (n +1)/2
        int sum1 = missingList.stream().mapToInt(i -> i).sum(); // sum of elements in missing list


        System.out.println(sum - sum1);
        System.out.println(sum - sum2);

    }
}
