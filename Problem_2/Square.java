package Problem_2;

public class Square extends Rectangle {

    // Default constructor
    public Square() {
    }

    // Constructor with side parameter
    public Square(double side) {
        super(side, side);
    }

    // Constructor with side, color, and filled parameters
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    // Getter method for side
    public double getSide() {
        return getWidth();
    }

    // Setter method for side
    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    // Override setWidth and setLength to maintain square properties
    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setLength(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    // toString method
    @Override
    public String toString() {
        return "Square[Rectangle[Shape[color=" + color + ", filled=" + filled + "], side=" + getSide() + "]]";
    }
}