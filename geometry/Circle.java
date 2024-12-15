package geometry;

public class Circle {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate the area of the circle
    public double area() {
        return Math.PI * radius * radius;
    }

    // Method to calculate the perimeter of the circle
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}
