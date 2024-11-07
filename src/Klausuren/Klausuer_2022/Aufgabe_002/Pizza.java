package Klausuren.Klausuer_2022.Aufgabe_002;

public class Pizza extends Lebensmittel {
    private Zutat[] zutaten;


    public Pizza(Zutat[] zutaten) {
        this.zutaten = zutaten;
    }


    @Override
    public Zutat[] getZutaten() {
        return zutaten;
    }
}
