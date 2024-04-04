import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a number: ");
        int n = Integer.parseInt(bufferedReader.readLine());
        System.out.println("The factors of " + n + " are: ");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
