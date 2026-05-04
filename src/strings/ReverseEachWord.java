package strings;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseEachWord {
    public static void main(String[] args) {
        String input = "Hi this is sample word for reverse test";

        String reversed = reverseEachWord(input);
        System.out.println(reversed);


        String reversedUsingStream = reverseEachWordUsingStream(input);
        System.out.println(reversedUsingStream);
    }

    private static String reverseEachWordUsingStream(String input) {
        return Arrays.stream(input.split(" "))
                .map(word -> new StringBuilder(word).reverse().toString())
                .collect(Collectors.joining( " "));
    }

    //Manual swap (O(1) space)
    private static String reverseEachWord(String input) {

        char[] charArray = input.toCharArray();
        int start = 0;
        for(int end =0; end<=charArray.length; end++) {
            if(end == charArray.length || charArray[end] == ' ') {
                int left = start;
                int right = end - 1;
                while (left < right) {
                    char temp = charArray[left];
                    charArray[left++] = charArray[right];
                    charArray[right--] = temp;
                }
                start = end + 1;
            }
        }
        return new String(charArray);
    }
}
