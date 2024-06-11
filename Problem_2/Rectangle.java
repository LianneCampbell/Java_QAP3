package Problem_2;

public class Rectangle extends Shape {
    private double width = 1.0;
    private double length = 1.0;

    // Default constructor
    public Rectangle() {
    }

    // Constructor with width and length parameters
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    // Constructor with width, length, color, and filled parameters
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    // Getter and Setter methods
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    // Method to calculate area
    public double getArea() {
        return width * length;
    }

    // Method to calculate perimeter
    public double getPerimeter() {
        return 2 * (width + length);
    }

    // toString method
    @Override
    public String toString() {
        return "Rectangle[Shape[color=" + color + ", filled=" + filled + "], width=" + width + ", length=" + length
                + "]";
    }
}