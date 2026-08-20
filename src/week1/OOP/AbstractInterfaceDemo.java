package week1.OOP;

public class AbstractInterfaceDemo {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(5),
                new Rectangle(4, 6),
                new Triangle(6, 4, 5, 5, 6)
        };

        for (Shape s : shapes) {
            System.out.printf("%s - Area: %.2f, Perimeter: %.2f%n", s.getName(), s.area(), s.perimeter());

            if (s instanceof Drawable d) {
                d.draw();
            }
        }
    }
}