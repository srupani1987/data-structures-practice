package faqs;

import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateChars {
    public static void main(String[] args) {
        String word = "JavaJavaEETech";
        char[] chars = word.toCharArray();
        Map<Character, Long> characterLongMap = word.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        characterLongMap.forEach((k,v)-> System.out.println(k + " : "+v));
    }
}
