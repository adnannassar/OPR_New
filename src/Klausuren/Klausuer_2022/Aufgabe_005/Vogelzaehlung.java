package Klausuren.Klausuer_2022.Aufgabe_005;

import java.util.*;

/**
 * Ein Objekt dieser Klasse dient dazu, die Anzahl Exemplare von Vögeln zu zählen
 */
public class Vogelzaehlung {
    private Map<String, Integer> vogelMap;

    public Vogelzaehlung() {
        this.vogelMap = new TreeMap<>();
    }

    /**
     * Es wird eine Anzahl an Exemplaren eines Vogels gezählt.
     * Gibt es bereits einen Zählwert für diesen Vogel, wird dieser Wert um die Anzahl erhöht.
     *
     * @param vogel  Vogel, der gezählt wird
     * @param anzahl Anzahl Exemplare des Vogels; es wird davon ausgegangen, dass die Anzahl größer als 0 ist
     */
    public void vogel(String vogel, int anzahl) {
        if (anzahl > 0) {
            if (vogelMap.containsKey(vogel)) {
                anzahl += anzahl(vogel); // null pointer exception
            }
            vogelMap.put(vogel, anzahl);
        }
    }


    // print the map
    public void printMap() {
        for (Map.Entry<String, Integer> entry : vogelMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        }
    }

    /**
     * Liefert alle Vögel, die gezählt wurden
     *
     * @return alle Vögel als Collection; bei einer Iteration über die Collection sollen die Vögel in
     * alphabetischer Reihenfolge durchlaufen werden
     */
    public Collection<String> alleVoegel() {
        return vogelMap.keySet();
    }

    /**
     * Liefert den Zählwert für eienn Vogel.
     *
     * @param vogel Vogel, für den der Zählwert geliefert wird
     * @return Zählwert für den Vogel oder 0, wenn Vogel bisher nicht gezählt wurde
     */
    public int anzahl(String vogel) {
        try {
            return vogelMap.get(vogel);
        } catch (NullPointerException e) {
            return 0;
        }
        // return vogelMap.getOrDefault(vogel, 0);
    }

    public int anzahlAlleVögel() {
        Collection<Integer> valuesList = vogelMap.values();
        int summe = 0;

        Iterator<Integer> it = valuesList.iterator();
        while (it.hasNext()) {
            summe += it.next();
        }
            /*
            for (Integer i : valuesList) {
                summe += i;
            }
            */

        return summe;
    }

    public int enhancedAnzahlAlleVögel() {
        int summe = 0;
        Iterator<Integer> it = vogelMap.values().iterator();
        while (it.hasNext()) {
            summe += it.next();
        }

        return summe;
    }

    public int streamAnzahlAlleVögel() {
        return vogelMap.values().stream().mapToInt(Integer::intValue).sum();
    }


}
