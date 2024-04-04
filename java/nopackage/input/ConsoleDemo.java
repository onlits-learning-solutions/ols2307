import java.io.Console;

public class ConsoleDemo {
    public static void main(String[] args) {
        Console console = System.console();
        System.out.print("Enter username: ");
        String username = console.readLine();
        System.out.print("Enter password: ");
        String password = new String(console.readPassword());
        System.out.println(username + ", your password is: " + password);
    }    
}
