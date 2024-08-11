package ols2307.dsa.array;

import java.util.Scanner;

public class ArrayOperation {
    private static final int MAX = 10;
    private static int[] nums = new int[MAX];
    private static int size;

    static void messageBox(String message) {
        System.out.println("\n+-----------------------------------------+");
        System.out.print(message);
        System.out.println("\n+-----------------------------------------+\n");
    }

    static void display() {
        if (size == 0) {
            messageBox("Array is empty!");
            return;
        }

        System.out.println("The array contains the following number:");
        for (int i = 0; i < size; i++) {
            System.out.println(nums[i]);
        }
    }

    static void insert(int value, int index) {
        if (size > MAX - 1) {
            messageBox("Overflow!");
            return;
        }

        if (index > size) {
            messageBox("Invalid index");
            return;
        }
        for (int i = size; i > index; i--) {
            nums[i] = nums[i - 1];
        }
        nums[index] = value;
        size++;

        messageBox("Insert successful!");
    }

    public static void main(String[] args) {
        int value, index;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("MAIN MENU");
            System.out.println("1. Display array (traversal)");
            System.out.print("Enter choice (0 to exit): ");
            int op = scanner.nextInt();
            switch (op) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    display();
                    break;
                case 2:
                    System.out.println("Enter value: ");
                    value = scanner.nextInt();
                    System.out.println("Enter index: ");
                    index = scanner.nextInt();
                    insert(value, index);
                    break;
                default:
                    break;
            }
        }
    }
}
