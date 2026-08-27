package oop.shapes;

public class ShapeDemo {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        Rectangle r = new Rectangle(4, 6);
        Triangle t = new Triangle(6, 4, 5, 5, 6);

        System.out.printf("%s - Area: %.2f, Perimeter: %.2f%n", c.getName(), c.area(), c.perimeter());
        System.out.printf("%s - Area: %.2f, Perimeter: %.2f%n", r.getName(), r.area(), r.perimeter());
        System.out.printf("%s - Area: %.2f, Perimeter: %.2f%n", t.getName(), t.area(), t.perimeter());
    }
}