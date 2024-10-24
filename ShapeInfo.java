import java.util.*;

class Shape {
    String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}

class Circle extends Shape {
    double radius;
    double PI = 3.14;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getArea() {
        return PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double length;
    double width;

    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }
}

public class ShapeInfo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the color of the circle: ");
        String circleColor = s.nextLine();
        System.out.print("Enter the radius of the circle: ");
        double radius = s.nextDouble();
        s.nextLine();

        System.out.print("Enter the color of the rectangle: ");
        String rectangleColor = s.nextLine();
        System.out.print("Enter the length of the rectangle: ");
        double length = s.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        double width = s.nextDouble();

        Circle circle = new Circle(circleColor, radius);

        Rectangle rectangle = new Rectangle(rectangleColor, length, width);

        System.out.println("\nCircle:");
        System.out.println("Color: " + circle.getColor());
        System.out.println("Area: " + circle.getArea());

        System.out.println("\nRectangle:");
        System.out.println("Color: " + rectangle.getColor());
        System.out.println("Area: " + rectangle.getArea());
    }
}
