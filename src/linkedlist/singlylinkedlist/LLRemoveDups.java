package linkedlist.singlylinkedlist;

import java.util.HashSet;
import java.util.Set;

public class LLRemoveDups {
    void deleteDups(LinkedList ll) {
        Set<Integer> set = new HashSet<>();
        Node current = ll.head;
        Node previous = null;
        while (current != null) {
            int currentValue = current.value;
            if (set.contains(currentValue)) {
                previous.next = current.next;
                ll.size --;
            } else {
                set.add(currentValue);
                previous = current;
            }
            current = current.next;
        }
    }
}
