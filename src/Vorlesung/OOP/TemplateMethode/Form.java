package Vorlesung.OOP.TemplateMethode;

public abstract class Form {
    private String color;

    public Form(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public final void printFormFläche(){
        double fläche = berechneFläche();
        System.out.println("Die Fläche der Form beträgt: " + fläche);
    }

    public abstract double berechneFläche();
}
