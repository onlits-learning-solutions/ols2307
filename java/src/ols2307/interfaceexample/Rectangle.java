package ols2307.interfaceexample;

public class Rectangle implements Shape {

    private float length;
    private float breadth;

    Rectangle(float length, float breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public float area() {
        return length * breadth;
    }

    public float perimeter() {

        return 2 * (length + breadth);
    }
}
