package ols2307.stack;

import java.util.Scanner;

public class StackTestOld {
    public static void main(String[] args) {
        Stack stack = new Stack();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("MAIN MENU");
            System.out.println("1. Display (Traverse)");
            System.out.println("2. Push");
            System.out.println("3. Pop");
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
                    stack.display();
                    break;
                case 2:
                    System.out.print("Enter a value: ");
                    stack.push(scanner.nextInt());
                    System.out.println("\nData Pushed!\n");
                    break;
                case 3:
                    stack.pop();
                    System.out.println("\nData Popped!\n");
                    break;
                default:
                    System.out.println("\nInvalid option!\n");
                    break;
            }
        }
    }
}
