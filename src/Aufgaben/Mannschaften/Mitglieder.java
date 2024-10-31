package Aufgaben.Mannschaften;

public abstract class Mitglieder {
    private String Vorname;
    private String Nachname;
    private int id;
    private static int counter = 0;

    public Mitglieder(String Vorname, String Nachname) {
        this.Vorname = Vorname;
        this.Nachname = Nachname;
        counter++;
        id = counter;
    }

    public String getVorname() {
        return Vorname;
    }

    public String getNachname() {
        return Nachname;
    }

    public abstract double berechneGehalt();

    public abstract String getSonsiges();


    public int getId() {
        return id;
    }
}
