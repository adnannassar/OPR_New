package Klausuren.Klausuer_2022.Aufgabe_002;


import java.util.LinkedList;

public abstract class LebensmittelLinkedList {

    // abstract method
    public abstract LinkedList<Zutat> getZutaten();

    // template method
    public final String zutatentext() {
        LinkedList<Zutat> zutaten = getZutaten();
        if (zutaten != null) {
            String erg = "";
            if (zutaten.size() == 1) {
                erg += "Zutat: " + zutaten.get(0).getName();
            } else {
                erg += "Zutaten: ";
                for (int i = 0; i < zutaten.size(); i++) {
                    erg += zutaten.get(i).getName();
                    if (i < zutaten.size() - 1) {
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
        LinkedList<Zutat> zutaten = getZutaten();
        if (zutaten != null) {
            for (int i = 0; i < zutaten.size(); i++) {
                if (!zutaten.get(i).isVegan()) {
                    return false;
                }
            }
            return true;
        }

        return false;
    }
}
