package ols2307.interfaceexample;

public class ShapeProvider {
    static private Shape shape = null;

    static Shape getShape(String name, float side) {
        if (name == "square") {
            shape = new Square2(side);
        }
        return shape;
    }

    static Shape getShape(String name, float length, float breadth) {
        if (name == "rectangle") {
            shape = new Rectangle(length, breadth);
        }
        return shape;
    }
}
