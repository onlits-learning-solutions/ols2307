package ols2307.stack;

public class Stack {
    private Node top;

    public void display() {
        if (top == null) {
            System.out.println("\nStack empty!\n\n");
            return;
        }

        Node cursor = top;

        while (true) {
            System.out.println(cursor.getData());
            if (cursor.getNext() == null) {
                return;
            }

            cursor = cursor.getNext();
        }

    }

    public int push(int data) {
        if (empty()) {
            top = new Node(data);
            return peek();
        }

        top = new Node(data, top);

        return peek();
    }

    public int pop() {
        if(empty()){
            System.out.println("\nStack underflow!\n\n");
            return peek();
        }

        top = top.getNext();
        System.out.println("\nData popped!\n\n");
        return peek();
    }

    public int peek() {
        if (empty()) {
            System.out.println("\nStack empty!\n");
            return -1;
        }
        return top.getData();
    }

    public boolean empty() {
        if (top == null)
            return true;
        else
            return false;
    }
}
