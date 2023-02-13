package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SyncListTest {
    public static void main(String[] args) {
        List<String> testList = Collections.synchronizedList(new ArrayList<>());
        testList.add("a");
        testList.add("a");
        testList.add("a");
        testList.add("a");

        System.out.println(testList);

        testList.remove("a");

        System.out.println(testList);
    }
}
