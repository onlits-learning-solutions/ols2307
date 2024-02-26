import java.util.Scanner;

public class Complex {
    private float real;
    private float imaginary;

    public void read() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the real part of complex number: ");
        real = scanner.nextFloat();
        System.out.print("Enter the imaginary part of complex number: ");
        imaginary = scanner.nextFloat();
        scanner.close();
    }

    public void display() {
        System.out.println("The number is " + real + " + " + imaginary + "i");
    }

    public static void main(String[] args) {
        Complex complex = new Complex();    //here complex is a reference variable
        complex.read();
        complex.display();
    }
}
