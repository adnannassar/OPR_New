package Aufgaben.RaumverwaltrungProgramm;

public class Raum {
    private char trakt;
    private char etage;
    private String nummer;
    private Professor nutzer;

    public Raum(char trakt, char etage, String nummer) {
        this.trakt = trakt;
        this.etage = etage;
        this.nummer = nummer;
    }

    public char getTrakt() {
        return trakt;
    }

    public char getEtage() {
        return etage;
    }

    public String getNummer() {
        return nummer;
    }

    public Professor getNutzer() {
        return nutzer;
    }

    public void setNutzer(Professor prof) {
        this.nutzer = prof;
    }

    public void removeNutzer() {
        this.nutzer = null;
    }


    @Override
    public String toString() {
        String erg = trakt + "." + etage + "." + nummer;
        if (nutzer != null) {
            erg += ": " + nutzer;
        }
        return erg;
    }
}
