package ols2307.linkedlist;

public class SinglyLinkedList {
    private Node head = null;

    public void display() {
        if (head == null) {
            System.out.println("\nList Empty!\n");
            return;
        }

        Node itr = head;
        while (true) {
            System.out.println(itr.getData());
            if (itr.getNext() == null)
                break;
            itr = itr.getNext();
        }
    }

    public void append(int data) {
        if (head == null) {
            head = new Node(data);
            return;
        }

        Node itr = head;

        while (itr.getNext() != null) {
            itr = itr.getNext();
        }

        itr.setNext(new Node(data));
    }

    public void insert(int data) {
        if (head == null) {
            head = new Node(data);
            return;
        }

        head = new Node(data, head);
    }
}
