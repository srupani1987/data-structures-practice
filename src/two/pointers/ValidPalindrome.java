package two.pointers;

/**
 * `Given a string s, return true if it is a palindrome, otherwise return false.
 * A palindrome is a string that reads the same forward and backward.
 * It is also case-insensitive and ignores all non-alphanumeric characters.
 *========================================================================
 * Example 1:
 * Input: s = "Was it a car or a cat I saw?"
 * Output: true
 */
public class ValidPalindrome {
    public static void main(String[] args) {
        String str = "Was it a car or a cat I saw?";

        Boolean isValidPalindrome = isValidPalindromeByReverse(str);
        System.out.println("Is Valid Palindrome by Reverse : "+isValidPalindrome);

        Boolean isValidPalindrome1 = isValidPalindromeByTwoPointers(str);
        System.out.println("Is Valid Palindrome by two pointers : "+isValidPalindrome);
    }

    private static Boolean isValidPalindromeByTwoPointers(String str) {
        int left = 0, right = str.length() - 1;
        while (left < right) {
            // Move left pointer to the next alphanumeric character
            while (left < right && !Character.isLetterOrDigit(str.charAt(left))) {
                left++;
            }
            // Move right pointer to the previous alphanumeric character
            while (right > left && !Character.isLetterOrDigit(str.charAt(right))) {
                right--;
            }
            if (Character.toLowerCase(str.charAt(left)) != Character.toLowerCase(str.charAt(right))){
                return false;
            }
            // Move both pointers inward
            left++;
            right--;
        }
        return true;
    }

    private static Boolean isValidPalindromeByReverse(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] charArray = str.toCharArray();
        for(Character ch : charArray) {
            if (Character.isLetterOrDigit(ch)) {
                stringBuilder.append(Character.toLowerCase(ch));
            }
        }
        return stringBuilder.toString().contentEquals(stringBuilder.reverse());
    }
}
