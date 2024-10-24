import java.util.*;

abstract class Figure {
    double length, breadth, height;

    public void readDimensions(Scanner s) {
        System.out.print("Enter length: ");
        length = s.nextDouble();
        System.out.print("Enter breadth: ");
        breadth = s.nextDouble();
        System.out.print("Enter height: ");
        height = s.nextDouble();
    }

    public void displayDimensions() {
        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
        System.out.println("Height: " + height);
    }

    abstract double area();
}

class Rectangle extends Figure {
    double area() {
        return length * breadth;
    }
}

class Triangle extends Figure {
    double area() {
        return 0.5 * breadth * height;
    }
}
class FigureArea {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();
        System.out.println("Enter dimensions for the Rectangle:");
        rectangle.readDimensions(s);
        rectangle.displayDimensions();
        System.out.println("Area of the Rectangle: " + rectangle.area());

        Triangle triangle = new Triangle();
        System.out.println("\nEnter dimensions for the Triangle:");
        triangle.readDimensions(s);
        triangle.displayDimensions();
        System.out.println("Area of the Triangle: " + triangle.area());
    }
}
