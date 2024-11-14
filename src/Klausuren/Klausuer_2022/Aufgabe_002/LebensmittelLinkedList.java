package Klausuren.Klausuer_2022.Aufgabe_002;


import java.util.Iterator;
import java.util.LinkedList;

public abstract class LebensmittelLinkedList {

    // abstract method
    public abstract LinkedList<Zutat> getZutaten();

    // template method
    public final String zutatentext() {
        LinkedList<Zutat> zutaten = getZutaten();
        if (zutaten != null) {
            StringBuilder erg = new StringBuilder();
            if (zutaten.size() == 1) {
                erg.append("Zutat: ").append(zutaten.get(0).getName());
            } else {
                erg.append("Zutaten: ");
                int i = 0;

                for (Zutat zutat : zutaten) {
                    erg.append(zutat.getName());
                    if (i < zutaten.size() - 1) {
                        erg.append(", ");
                    }
                    i++;
                }
            }
            return erg.toString();
        } else {
            return "Keine Zutaten!";
        }
    }

    // template method
    public final boolean istVegan() {
        LinkedList<Zutat> zutaten = getZutaten();
        if (zutaten != null) {
            Iterator<Zutat> it = zutaten.iterator();
            while (it.hasNext()) {
                if (!it.next().isVegan()) {
                    return false;
                }
            }
            return true;
        }

        return false;
    }
}
