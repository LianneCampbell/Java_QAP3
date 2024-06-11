package Problem_2;

public class Demo {
    public static void main(String[] args) {
        // Test Shape class
        Shape shape = new Shape();
        System.out.println(shape);

        Shape shape2 = new Shape("blue", false);
        System.out.println(shape2);

        // Test Circle class
        Circle circle = new Circle();
        System.out.println(circle);

        Circle circle2 = new Circle(2.5);
        System.out.println(circle2);

        Circle circle3 = new Circle(3.5, "green", true);
        System.out.println(circle3);

        // Test Rectangle class
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        Rectangle rectangle2 = new Rectangle(2.0, 4.0);
        System.out.println(rectangle2);

        Rectangle rectangle3 = new Rectangle(3.0, 6.0, "yellow", false);
        System.out.println(rectangle3);

        // Test Square class
        Square square = new Square();
        System.out.println(square);

        Square square2 = new Square(3.0);
        System.out.println(square2);

        Square square3 = new Square(4.0, "black", true);
        System.out.println(square3);
    }
}
