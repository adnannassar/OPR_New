package Vorlesung.OOP.Vererbung;

public class Mitarbeiter extends Person {
    private double gehalt;


    public Mitarbeiter(String name, int age, double gehalt) {
        super(name, age);
        this.gehalt = gehalt;
    }

    public double getGehalt() {
        return gehalt;
    }

    public void setGehalt(double gehalt) {
        this.gehalt = gehalt;
    }
}
