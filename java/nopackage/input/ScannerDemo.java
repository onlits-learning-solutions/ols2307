import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        int a, b, c, x = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        a = scanner.nextInt();
        System.out.print("Enter the value of b: ");
        b = scanner.nextInt();
        System.out.print("Enter the value of c: ");
        c = scanner.nextInt();
        scanner.close();
        try {
            x = a / (b - c);
            System.out.println("The value of x is " + x);
        } catch (ArithmeticException ex) {
            System.out.println("Division by zero occured!");
        }
    }
}
