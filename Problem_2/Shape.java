package Problem_2;

public class Shape {
    protected String color = "red";
    protected boolean filled = true;

    // Default constructor
    public Shape() {
    }

    // Constructor with parameters
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    // Getter and Setter methods
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    // toString method
    @Override
    public String toString() {
        return "Shape[color=" + color + ", filled=" + filled + "]";
    }
}