package Aufgaben.Mannschaften;

public class Arzt extends Mitglieder {

    private String fachrichtung;
    private static final double Gehalt = 100000.0;

    public Arzt(String Vorname, String Nachname, String fachrichtung) {
        super(Vorname, Nachname);
        this.fachrichtung = fachrichtung;
    }

    public String getFachrichtung() {
        return fachrichtung;
    }

    @Override
    public double berechneGehalt() {
        return Gehalt;
    }

    @Override
    public String getSonsiges() {
        return "Fachrichtung: " + fachrichtung;
    }
}
