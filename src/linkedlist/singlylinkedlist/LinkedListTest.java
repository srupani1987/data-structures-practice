package linkedlist.singlylinkedlist;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertNodeAtStart(1);
        ll.insertNodeAtStart(2);
        ll.insertNodeAtStart(3);
        ll.insertNodeAtStart(2);
        ll.insertNodeAtStart(5);
        ll.insertNodeAtStart(6);

        ll.traversalLL();

        LLRemoveDups removeDups = new LLRemoveDups();
        removeDups.deleteDups(ll);
        ll.traversalLL();
    }
}
