package ols2307.exceptionhandling;

public class DivisionByZero {
    public static void main(String[] args) {
        // case 1
        // int a = 400, b = 75, c = 50;
        // case 2
        int a = 300, b = 50, c = 50;

        try {
            int x = a / (b - c);
            System.out.println("x = " + x);
        } catch (ArithmeticException exception) {
            System.out.println("Exception occured! Please contact support!");
        }

        System.out.println("Aal is well!");
    }
}
