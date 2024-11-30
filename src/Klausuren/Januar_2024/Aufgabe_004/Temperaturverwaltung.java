package Klausuren.Januar_2024.Aufgabe_004;

import java.util.Iterator;
import java.util.LinkedList;

public class Temperaturverwaltung {
    private final LinkedList<Temperatur> temperaturen;

    public Temperaturverwaltung() {
        temperaturen = new LinkedList<>();
    }


    public LinkedList<Temperatur> getTemperaturen() {
        return temperaturen;
    }

    public int fuegeHinzuKeineDoppeltenWerte(Temperatur t) {
        Iterator<Temperatur> ts = temperaturen.iterator();
        boolean schonEnthalten = false;
        while (ts.hasNext() && !schonEnthalten) {
            schonEnthalten = ts.next().wert() == t.wert();
        }
        if (!schonEnthalten) {
            temperaturen.add(t);
        }
        return temperaturen.size();
    }


    public int fuegeHinzuNormal(Temperatur t) {
        Iterator<Temperatur> ts = temperaturen.iterator();
        while (ts.hasNext()) {
            Temperatur pointer = ts.next();
            if (pointer.wert() == t.wert()) {
                return temperaturen.size();
            }
        }
        temperaturen.add(t);
        return temperaturen.size();
    }
}