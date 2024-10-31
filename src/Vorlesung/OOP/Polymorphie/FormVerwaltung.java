package Vorlesung.OOP.Polymorphie;

public class FormVerwaltung {
    private Form[] forms;

    public FormVerwaltung() {
        forms = new Form[10];
    }


    public void addForm(Form form) {
        for (int i = 0; i < forms.length; i++) {
            if (forms[i] == null) {
                forms[i] = form;
                break;
            }
        }
    }

    public void printFormInfo() {
        for (int i = 0; i < forms.length; i++) {
            if (forms[i] != null) {
                if (forms[i] instanceof Square) {
                    System.out.print("Square ");
                } else if (forms[i] instanceof Rectangle) {
                    System.out.print("Rectangle ");
                } else if (forms[i] instanceof Triangle) {
                    System.out.print("Triangle ");
                } else if (forms[i] instanceof Circle) {
                    System.out.print("Circle ");
                }
                System.out.print("Color: " + forms[i].getColor());
                System.out.print(", Area: " + forms[i].berechneFläche());
                System.out.println();
            }
        }
    }
}
