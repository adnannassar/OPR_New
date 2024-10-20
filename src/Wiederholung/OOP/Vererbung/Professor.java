package Wiederholung.OOP.Vererbung;

public class Professor extends Person {
   private String fachbereich;
    public Professor(String name, int age, String fachbereich) {
        super(name, age);
        this.fachbereich = fachbereich;
    }

    public String getFachbereich() {
        return fachbereich;
    }

    public void setFachbereich(String fachbereich) {
        this.fachbereich = fachbereich;
    }
}
