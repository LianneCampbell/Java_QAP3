package Problem_2;

public class Circle extends Shape {
    private double radius = 1.0;

    // Default constructor
    public Circle() {
    }

    // Constructor with radius parameter
    public Circle(double radius) {
        this.radius = radius;
    }

    // Constructor with radius, color, and filled parameters
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    // Getter and Setter methods
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Method to calculate area
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate perimeter
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    // toString method
    @Override
    public String toString() {
        return "Circle[Shape[color=" + color + ", filled=" + filled + "], radius=" + radius + "]";
    }
}
