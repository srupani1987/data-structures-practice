package arrays;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Given an array of strings strs, group all anagrams together into sublists. You may return the output in any order.
 * An anagram is a string that contains the exact same characters as another string, but the order of the characters can be different.
 * <p>
 * Input: strs = ["act","pots","tops","cat","stop","hat"]
 * Output: [["hat"],["act", "cat"],["stop", "pots", "tops"]]
 */
public class GroupAnagrams {
    public static void main(String[] args) {
        String[] strings = {"act", "pots", "tops", "cat", "stop", "hat"};

        List<List<String>> result = groupAnagrams(strings);
        System.out.println(result);
        System.out.println(groupAnagrams2(strings));
    }

    private static List<List<String>> groupAnagrams(String[] strings) {
        Map<String, List<String>> group = new HashMap<>();

        for (String orginalString : strings) {
            String key = orginalString.chars()
                    .sorted()
                    //.collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                    .mapToObj(i -> String.valueOf((char)i))
                    .collect(Collectors.joining());
//                    .toString();

            group.computeIfAbsent(key, k -> new ArrayList<>()).add(orginalString);
//            if (grop.containsKey(string)) {
//                grop.get(string).add(string);
//            } else {
//                grop.put(string, new ArrayList<>());
//                grop.get(string).add(string);
//            }

        }
        return new ArrayList<>(group.values());
    }

    private static List<List<String>> groupAnagrams2(String[] strings) {
        Map<String, List<String>> group = new HashMap<>();

        for (String orginalString : strings) {
            char[] charArray = orginalString.toCharArray();
            Arrays.sort(charArray);
            String key = new String(charArray);

            if (group.containsKey(key)) {
                group.get(key).add(orginalString);
            } else {
                group.put(key, new ArrayList<>());
                group.get(key).add(orginalString);
            }
        }
        return new ArrayList<>(group.values());
    }
}
