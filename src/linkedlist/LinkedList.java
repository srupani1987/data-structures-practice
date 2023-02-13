package linkedlist;

public class LinkedList {
    public Node head;
    public Node tail;
    public int size;

    public void createLinkedList(int nodeValue) {
        Node newNode = new Node();
        newNode.value = nodeValue;
        newNode.next = null;

        head = newNode; //1
        tail = newNode;//1
        size = 1;
    }

    public void insertNode(int nodeValue) {
        Node newNode = new Node();
        newNode.value = nodeValue;
        newNode.next = null;
        tail.next = newNode;//1-->2
        tail = newNode;//2
        size++;
    }

    public void traversalLL() {
        Node tempNode = head;
        for (int i = 0; i < size; i++) {
            System.out.print(tempNode.value);
            if (i != size - 1) {
                System.out.print(" --> ");
            }
            tempNode = tempNode.next;
        }
        System.out.println("\n");
    }

}
