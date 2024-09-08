package ols2307.linkedlist;

import java.util.Scanner;

public class SinglyLinkedListTest {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("MAIN MENU");
            System.out.println("1. Display (Traverse)");
            System.out.println("2. Append");
            System.out.println("3. Insert (Beginning)");
            System.out.print("Enter choice [0 to exit]: ");
            int response = scanner.nextInt();
            switch (response) {
                case 0:
                    System.out.println("Bye!");
                    scanner.close();
                    System.exit(0);
                    break;
                case 1:
                    System.out.println("The contents of the list are:");
                    list.display();
                    break;
                case 2:
                    System.out.print("Enter a value: ");
                    list.append(scanner.nextInt());
                    System.out.println("\nData Inserted!\n");
                    break;
                case 3:
                    System.out.print("Enter a value: ");
                    list.insert(scanner.nextInt());
                    System.out.println("\nData Inserted!\n");
                    break;
                default:
                    System.out.println("\nInvalid option!\n");
                    break;
            }
        }
    }
}
