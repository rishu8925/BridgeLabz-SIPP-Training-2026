abstract class Shape {
    abstract double area();
    abstract double perimeter();
}

class Circle extends Shape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }

    @Override
    double perimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }

    @Override
    double perimeter() {
        return 2 * (length + width);
    }
}

class Triangle extends Shape {
    private double a, b, c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    double area() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    double perimeter() {
        return a + b + c;
    }
}

public class ShapeReport {
    public static void main(String[] args) {

        Shape[] shapes = {
                new Circle(5),
                new Rectangle(4, 6),
                new Triangle(3, 4, 5)
        };

        System.out.println("===== Shape Report =====");

        for (Shape shape : shapes) {
            System.out.println("\n" + shape.getClass().getSimpleName());
            System.out.println("Area = " + shape.area());
            System.out.println("Perimeter = " + shape.perimeter());
        }
    }
}