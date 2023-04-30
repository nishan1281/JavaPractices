package org.example.FactoryMethod;

interface Shape {
    void draw();
}

class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle.");
    }
}

class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle.");
    }
}

class ShapeFactory {
    public static Shape createShape(String type) {
        if (type.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        } else if (type.equalsIgnoreCase("circle")) {
            return new Circle();
        } else {
            throw new IllegalArgumentException("Invalid shape type");
        }
    }
}

public class FactoryMethodExample {
    public static void main(String[] args) {
        Shape rectangle = ShapeFactory.createShape("rectangle");
        rectangle.draw(); // Output: Drawing a rectangle.

        Shape circle = ShapeFactory.createShape("circle");
        circle.draw(); // Output: Drawing a circle.
    }
}