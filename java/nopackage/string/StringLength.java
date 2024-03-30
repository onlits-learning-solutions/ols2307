import java.util.Scanner;

public class StringLength {
    public static void main(String[] args) {
        String string;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        string = scanner.nextLine();
        int length = string.length();
        System.out.println("The length of '" + string + "' is " + length + ".");
        scanner.close();
    }
}
