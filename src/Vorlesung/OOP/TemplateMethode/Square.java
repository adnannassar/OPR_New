package Vorlesung.OOP.TemplateMethode;

public class Square extends Form {
    private double width;

    public Square(String color, double width) {
        super(color);
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double berechneFläche() {
        return width * width;
    }
}
