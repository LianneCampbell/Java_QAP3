package Problem_3;

public class Point {
    private float x = 0.0f;
    private float y = 0.0f;

    // Default constructor
    public Point() {
    }

    // Constructor with parameters
    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // Getter and Setter methods
    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        return new float[] { x, y };
    }

    // toString method
    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}
