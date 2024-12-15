import geometry.Circle;
import geometry.Rectangle;
import java.util.Scanner;

public class GeometryMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Circle calculations
        System.out.println("Enter the radius of the circle: ");
        double radius = s.nextDouble();
        Circle circle = new Circle(radius);
        System.out.println("Circle Area: " + circle.area());
        System.out.println("Circle Perimeter: " + circle.perimeter());

        // Rectangle calculations
        System.out.println("\nEnter the length of the rectangle: ");
        double length = s.nextDouble();
        System.out.println("Enter the width of the rectangle: ");
        double width = s.nextDouble();
        Rectangle rectangle = new Rectangle(length, width);
        System.out.println("Rectangle Area: " + rectangle.area());
        System.out.println("Rectangle Perimeter: " + rectangle.perimeter());
    }
}
