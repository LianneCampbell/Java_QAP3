package Problem_3;

public class Demo {
    public static void main(String[] args) {
        // Test Point class
        Point point = new Point(1.5f, 2.5f);
        System.out.println(point); // Output: (1.5,2.5)

        point.setXY(3.5f, 4.5f);
        System.out.println(point); // Output: (3.5,4.5)

        // Test MovablePoint class
        MovablePoint movablePoint = new MovablePoint(1.0f, 1.0f, 0.5f, 0.5f);
        System.out.println(movablePoint); // Output: (1.0,1.0), speed=(0.5,0.5)

        movablePoint.move();
        System.out.println(movablePoint); // Output: (1.5,1.5), speed=(0.5,0.5)

        movablePoint.setSpeed(1.0f, 1.0f);
        movablePoint.move();
        System.out.println(movablePoint); // Output: (2.5,2.5), speed=(1.0,1.0)
    }
}