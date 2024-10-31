package Aufgaben.Mannschaften;

public class Trainer extends Mitglieder {

    private Spieler lieblingsSpieler;
    private static final double GEHALT = 165000.0;

    public Trainer(String Vorname, String Nachname) {
        super(Vorname, Nachname);
    }

    public Spieler getlieblingsSpieler() {
        return lieblingsSpieler;
    }

    public void setLieblingsSpieler(Spieler lieblingsSpieler) {
        this.lieblingsSpieler = lieblingsSpieler;
    }

    @Override
    public double berechneGehalt() {
        return GEHALT;
    }

    @Override
    public String getSonsiges() {
        return "Lieblingsspieler: " + lieblingsSpieler;
    }
}
