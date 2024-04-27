package ols2307.interfaceexample;

public class Square2 implements Shape {
    private float side;         //Instance Variable

    Square2(float side) {        //here side is a parameter
        this.side = side;
    }

    public float area() {
        return side * side;
    }

    public float perimeter() {
        return 4 * side;
    }
}
