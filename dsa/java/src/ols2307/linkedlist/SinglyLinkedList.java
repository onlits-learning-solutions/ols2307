package ols2307.linkedlist;

public class SinglyLinkedList {
    private Node head = null;
    public void display() {
        if(head == null) {
            System.out.println("\nList Empty!\n");
            return;
        }
    }

    public void add(int data) {
        if(head == null) {
            head = new Node(data);
        }
    }
}
