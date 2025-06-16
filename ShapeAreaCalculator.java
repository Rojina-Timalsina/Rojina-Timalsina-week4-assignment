//Abstract class: Shape with abstract method double calculateArea().
//Subclasses:
//Rectangle with fields length and width
//Circle with field radius
//Triangle with fields base and height
//Override calculateArea() in each to return area.
//Create an array of Shape references and compute total area.
//File: ShapeAreaCalculator.java.


abstract class Shape {
    
    public abstract double calculateArea();
}


class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}

// Circle class
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Triangle class
class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}


public class ShapeAreaCalculator {
    public static void main(String[] args) {
        
        Shape[] shapes = {
            new Rectangle(5, 3),
            new Circle(4),
            new Triangle(6, 2)
        };

        double totalArea = 0;

        
        for (Shape shape : shapes) {
            double area = shape.calculateArea();
            System.out.println("Area: " + area);
            totalArea += area;
        }

        System.out.println("Total Area: " + totalArea);
    }
}