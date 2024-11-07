package Klausuren.Klausuer_2022.Aufgabe_002;


public abstract class Lebensmittel {

    // abstract method
    public abstract Zutat[] getZutaten();

    // template method
    public final String zutatentext() {
        Zutat[] zutaten = getZutaten();
        if (zutaten != null) {
            String erg = "";
            if (zutaten.length == 1) {
                erg += "Zutat: " + zutaten[0].getName();
            } else {
                erg += "Zutaten: ";
                for (int i = 0; i < zutaten.length; i++) {
                    erg += zutaten[i].getName();
                    if (i < zutaten.length - 1) {
                        erg += ", ";
                    }
                }
            }
            return erg;
        } else {
            return "Keine Zutaten!";
        }
    }

    // template method
    public final boolean istVegan() {
        Zutat[] zutaten = getZutaten();
        if (zutaten != null) {
            for (int i = 0; i < zutaten.length; i++) {
                if (!zutaten[i].isVegan()) {
                    return false;
                }
            }
            return true;
        }

        return false;
    }
}
