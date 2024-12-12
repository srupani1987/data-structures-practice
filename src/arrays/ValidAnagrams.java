package arrays;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ValidAnagrams {
    public static void main(String[] args) {

        String s = "racecar";
        String t = "carrace";

        //Approach 1 (By using sorting )
        System.out.println("Is Anagram by Sorting .. : " + isAnagram_By_Sorting(s, t));

        //Approach 2 (By Using Character Count Array )
        boolean isAnagram2 = isAnagram_By_Character_Count_Array(s, t);
        System.out.println("is Anagram by char count array : "+isAnagram2);

        //Approach 3
        boolean isAnagram3 = isAnagram(s, t);
        System.out.println("Is Anagram by Map char Freq :" +isAnagram3);

    }

    /**
     *its time complexity is O(n log n) due to sorting, making it less efficient than character counting in some cases.
     */
    private static boolean isAnagram_By_Sorting(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        //Below Java 7  ============================
//        char[] charArray = s.toCharArray();
//        char[] charArray1 = t.toCharArray();
//
//        Arrays.sort(charArray);
//        Arrays.sort(charArray1);
//
//        return Arrays.equals(charArray, charArray1);

        //After Java 8 ========================
        return Arrays.equals(s.chars().sorted().toArray(), t.chars().sorted().toArray());

    }

    private static boolean isAnagram_By_Character_Count_Array(String s, String t) {
        if (s.length() != t.length()) {
            return  false;
        }

        int[] charCount = new int[26]; // [0,0,0,......0]

        for(int i=0; i< s.length(); i++) {
            charCount[s.charAt(i) - 'a'] ++;
            charCount[t.charAt(i) - 'a'] --;
        }

        for (int c : charCount) {
            if (c != 0) {
                return false;
            }
        }

        return true;

        // Using Java 17 and streams ==================================
        // Use IntStream to iterate over the indices of the strings
//        IntStream.range(0, s.length()).forEach(i -> {
//            // Increment for characters in s and decrement for characters in t
//            charCount[s.charAt(i) - 'a']++;
//            charCount[t.charAt(i) - 'a']--;
//        });
//
//        // Check if all values in charCount are zero (indicating an anagram)
//        return IntStream.of(charCount).allMatch(c -> c == 0);

    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Long> sCharFreq = s.chars()
                .mapToObj( c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Map<Character, Long> tCharFreq = t.chars()
                .mapToObj(tc -> (char)tc)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        return sCharFreq.equals(tCharFreq);
    }


}
