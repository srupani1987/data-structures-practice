package test;

import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CoreJavaTestPrgram {
    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException {
        Map<String, Integer> map = new HashMap<>();

        List<String> strings = Arrays.asList("A", "B", "C", "D", "E");
        List<String> collect = strings.stream().limit(3).collect(Collectors.toList());
        List<String> collect1 = strings.stream().limit(7).collect(Collectors.toList());

        System.out.println(collect);
        System.out.println(collect1);


        Cipher cipher = Cipher.getInstance("MD5");

        /*Map.Entry<String, Integer> stringIntegerEntry = map.entrySet().stream().findFirst().orElse(getEntry());

        Integer value = stringIntegerEntry.getValue();

        System.out.println(value);*/
    }

    /*private static Map.Entry<String, Integer> getEntry() {
        return
    }*/
}
 