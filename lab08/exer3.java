import java.util.Scanner;

interface Shape {
    double calculateArea();
}

class Rectangle implements Shape {
    double length;
    double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}

class Circle implements Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

public class exer3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter length of rectangle:");
        double length = scanner.nextDouble();
        System.out.println("Enter width of rectangle:");
        double width = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(length, width);
        System.out.println("Area of rectangle: " + rectangle.calculateArea());

        System.out.println("Enter radius of circle:");
        double radius = scanner.nextDouble();
        Circle circle = new Circle(radius);
        System.out.println("Area of circle: " + circle.calculateArea());
    }
}