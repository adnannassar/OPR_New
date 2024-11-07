package Vorlesung.OOP.TemplateMethode;

public class Main {
    public static void main(String[] args) {
        Square square = new Square("Red", 4);
        Rectangle rectangle = new Rectangle("Blue", 2, 5);
        Triangle triangle = new Triangle("Yellow", 2, 3, 1);
        Circle circle = new Circle("Black", 1.5);


        FormVerwaltung formVerwaltung = new FormVerwaltung();
        formVerwaltung.addForm(square);
        formVerwaltung.addForm(rectangle);
        formVerwaltung.addForm(triangle);
        formVerwaltung.addForm(circle);

        formVerwaltung.printFormen();


        square.printFormFläche();
        rectangle.printFormFläche();
        triangle.printFormFläche();
        circle.printFormFläche();


    }
}
