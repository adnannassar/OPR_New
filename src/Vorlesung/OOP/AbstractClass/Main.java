package Vorlesung.OOP.AbstractClass;

public class Main {
    public static void main(String[] args) {
        Square square = new Square("Red", 4);
        Rectangle rectangle = new Rectangle("Blue", 2, 5);
        Triangle triangle = new Triangle("Yellow", 2, 3, 1);
        Circle circle = new Circle("Black", 1.5);




        System.out.println(square.berechneFläche());
        System.out.println(rectangle.berechneFläche());
        System.out.println(triangle.berechneFläche());
        System.out.println(circle.berechneFläche());
    }
}
