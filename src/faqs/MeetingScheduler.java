package faqs;

import java.util.Map;
import java.util.TreeMap;

public class MeetingScheduler {
    private final TreeMap<Integer, Integer> treeMap = new TreeMap<>();
    private boolean book(int start, int end) {
        if (start > end) {
            return false;
        }

        // find the meeting immediately before or at start
        Map.Entry<Integer, Integer> previousEntry = treeMap.floorEntry(start);

        // check overlap with previous meeting
        if(previousEntry != null && previousEntry.getValue() > start) {
            return false;
        }

        //find the next meeting
        Map.Entry<Integer, Integer> nextEntry = treeMap.ceilingEntry(start);

        if(nextEntry != null && nextEntry.getValue() < end) {
            return false;
        }

        treeMap.put(start, end);

        return  true;


    }
    public static void main(String[] args) {
        MeetingScheduler scheduler = new MeetingScheduler();
        System.out.println(scheduler.book(10, 20)); // true
        System.out.println(scheduler.book(15, 25)); // false
        System.out.println(scheduler.book(20, 30)); // true
    }
}
