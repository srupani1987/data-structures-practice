package arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * Design an algorithm to encode a list of strings to a single string. The encoded string is then decoded back to the original list of strings.
 * Please implement encode and decode
 *
 * Example 1:
 * Input: ["neet","code","love","you"]
 * Output:["neet","code","love","you"]
 */
public class EncodeAndDecodeStrings {
    public static void main(String[] args) {
        String[] inputStrings = {"we", "say", ":", "yes"};

        String encodedString = encode(inputStrings);
        System.out.println(encodedString);
        System.out.println(decrypt(encodedString));
    }

    private static String encode(String[] inputStrings) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String str : inputStrings) {
            stringBuilder.append(str.length()).append('#').append(str);
        }

        return stringBuilder.toString();
    }

    private static List<String> decrypt(String encryptedString) {
        List<String> result = new ArrayList<>();
        int i = 0;

        while (i < encryptedString.length()) {
            //find the position of the delimiter
            int delimiterPosition = encryptedString.indexOf('#', i);

            //extract the length of the string before delimiter
            int length = Integer.parseInt(encryptedString.substring(i, delimiterPosition));

            //extract the actual string based on the length
            String reultString = encryptedString.substring(delimiterPosition + 1, delimiterPosition + 1 + length);

            result.add(reultString);

            // Move i to the position after the current string
            i = delimiterPosition + 1 + length;

        }
        return result;
    }
}
