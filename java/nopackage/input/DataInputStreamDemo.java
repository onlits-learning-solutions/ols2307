import java.io.DataInputStream;
import java.io.IOException;

public class DataInputStreamDemo {
    public static void main(String[] args) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(System.in);
        System.out.print("Enter a number: ");
        int n = Integer.parseInt(dataInputStream.readLine());
        System.out.println("The first ten multiples of " + n + " are:");
        int mul = 1;
        for(int i=1; i<=10; i++) {
            System.out.print(n * i + " ");
        }
        System.out.println();
    }    
}
