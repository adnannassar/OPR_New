package Vorlesung.OOP.TemplateMethode;

public class FormVerwaltung {
    private Form[] formen;

    public FormVerwaltung() {
        this.formen = new Form[10];
    }

    public void addForm(Form form) {
        for (int i = 0; i < formen.length; i++) {
            if (formen[i] == null) {
                formen[i] = form;
                break;
            }
        }
    }

    // print all forms
    public void printFormen() {
        for (int i = 0; i < formen.length; i++) {
            Form form = formen[i];
            if (form != null) {
                if (form instanceof Square) {
                    System.out.println("Quadrat: Fläche: " + form.berechneFläche() + ", Farbe: " + form.getColor());
                }
                if (form instanceof Circle) {
                    System.out.println("Kreis: Fläche: " + form.berechneFläche() + ", Farbe: " + form.getColor());
                }
                if (form instanceof Triangle) {
                    System.out.println("Dreieck: Fläche: " + form.berechneFläche() + ", Farbe: " + form.getColor());
                }
                if (form instanceof Rectangle) {
                    System.out.println("Rechteck: Fläche: " + form.berechneFläche() + ", Farbe: " + form.getColor());
                }
            }
        }
    }
}
