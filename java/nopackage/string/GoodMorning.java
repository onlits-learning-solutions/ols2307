import java.util.Scanner;

public class GoodMorning {
    public static void main(String[] args) {
        String name = new String();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        name = scanner.nextLine();
        System.out.println("Good morning! " + name);
        scanner.close();
    }
}