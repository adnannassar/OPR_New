package Vorlesung.OOP.AbstractClass;

public class Rectangle extends Form {
    private double width, length;


    public Rectangle(String color, double width, double length) {
        super(color);
        this.width = width;
        this.length = length;
    }

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

    @Override
    public double berechneFläche() {
        return width * length;
    }
}
