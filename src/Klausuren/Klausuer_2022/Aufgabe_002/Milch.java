package Klausuren.Klausuer_2022.Aufgabe_002;

public class Milch extends Lebensmittel {
    private Zutat[] zutaten;

    public Milch(Zutat[] zutaten) {
        this.zutaten = zutaten;
    }


    @Override
    public Zutat[] getZutaten() {
        return zutaten;
    }
}
