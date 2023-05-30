package linkedlist.singlylinkedlist;

public class LinkedList {
    public Node head;
    public Node tail;
    public int size;

    public void createSinglyLinkedList(int nodeValue) {
        Node newNode = new Node();
        newNode.value = nodeValue;
        newNode.next = null;

        head = newNode; //1
        tail = newNode;//1
        size = 1;
    }

    /**
     * inserting node at first/start position
     * @param nodeValue
     */
    public void insertNodeAtStart(int nodeValue) {
        Node newNode = new Node();
        newNode.value = nodeValue;
        newNode.next = head;
        //tail.next = newNode;//1-->2
        head = newNode;//2
        size++;
    }

    /**
     * inserting node at last position
     * @param nodeValue
     */
    public void insertNodeAtLast(int nodeValue) {
        Node newNode = new Node();
        newNode.value = nodeValue;
        newNode.next = null;
        tail.next = newNode;//1-->2
        tail = newNode;//2
        size++;
    }

    // Insert Method SinglyLinkedList
    public void insertInLinkedList(int nodeValue, int location) {
        Node node = new Node();
        node.value = nodeValue;
        if (head == null) {
            createSinglyLinkedList(nodeValue);
            return;
        } else if (location == 0) {
            node.next = head;
            head = node;
        } else if (location >= size) {
            node.next = null;
            tail.next = node;
            tail = node;
        } else {
            Node tempNode = head;
            int index = 0;
            while (index < location - 1) {
                tempNode = tempNode.next;
                index++;
            }
            Node nextNode = tempNode.next;
            tempNode.next = node;
            node.next = nextNode;
        }
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
