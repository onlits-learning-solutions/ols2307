package ols2307.linkedlist;

import java.util.Scanner;

public class SinglyLinkedListTest {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("MAIN MENU");
            System.out.println("1. Display (Traverse)");
            System.out.print("Enter choice [0 to exit]: ");
            int response = scanner.nextInt();
            switch (response) {
                case 0:
                    System.out.println("Bye!");
                    System.exit(0);
                    break;
                case 1:
                    list.display();
                    break;
                default:
                    System.out.println("\nInvalid option!\n");
                    break;
            }
        }
        // scanner.close();
    }
}
