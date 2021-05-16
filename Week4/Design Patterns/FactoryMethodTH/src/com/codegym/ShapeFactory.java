package com.codegym;

public class ShapeFactory {
    public static Shape getShape(String msg) {
        Shape shape;
        switch (msg) {
            case "Circle": {
                shape = new Circle();
                break;
            }
            case "Square": {
                shape = new Square();
                break;
            }
            case "Rectangle": {
                shape = new Rectangle();
                break;
            }
            default:
                throw new IllegalStateException("Unexpected value: " + msg);
        }
        return shape;
    }
}
