package ols2307.interfaceexample;

import java.util.Scanner;

public class ShapeClient {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter side: ");
        float side = scanner.nextFloat();
        Shape shape = ShapeProvider.getShape("square", side);   //Instantiating  a class
        System.out.println(shape);
        System.out.println("Area of square is: " + shape.area());

        System.out.print("Enter length: ");
        float length = scanner.nextFloat();
        System.out.print("Enter breadth: ");
        float breadth = scanner.nextFloat();
        shape = ShapeProvider.getShape("rectangle", length, breadth);   //Instantiating  a class
        System.out.println(shape);
        System.out.println("Area of rectangle is: " + shape.area());
        scanner.close();
    }
}
