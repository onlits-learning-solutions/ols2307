package ols2307.interfaceexample;

public class Square implements Shape {
    private float side;         //Instance Variable

    Square(float side) {        //here side is a parameter
        this.side = side;
    }

    public float area() {
        return side * side;
    }

    public float perimeter() {
        return 4 * side;
    }
}
