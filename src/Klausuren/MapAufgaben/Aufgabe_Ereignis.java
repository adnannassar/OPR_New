package Klausuren.MapAufgaben;

import java.util.*;

public class Aufgabe_Ereignis {


    public static void main(String[] args) {
        Map<String, Integer> ereignisse = Map.of(
                "Ereignis1", 2020,
                "Ereignis2", 2020,
                "Ereignis3", 2021,
                "Ereignis4", 2022,
                "Ereignis5", 2022,
                "Ereignis6", 2023,
                "Ereignis7", 2024
        );

        Map<Integer, Collection<String>> erg = ereignisseNachJahren(ereignisse);
        Set<Integer> jahre = erg.keySet();
        for (int jahr : jahre) {
            System.out.println(jahr + ": " + erg.get(jahr));
        }
    }

    public static Map<Integer, Collection<String>> ereignisseNachJahren(Map<String, Integer> ereignisseMitJahren) {
        Map<Integer, Collection<String>> ereignisseNachJahr = new TreeMap<>();

        // Schlüssel (Ereignisnamen) aus der Map abrufen
        // Alle Jahre extrahieren und sortieren
        Set<String> ereignisNamen = ereignisseMitJahren.keySet();
        Set<Integer> alleJahre = new TreeSet<>(ereignisseMitJahren.values());

        for (int jahr : alleJahre) {
            Collection<String> ereignisseInDiesemJahr = new LinkedList<>();
            for (String ereignis : ereignisNamen) {
                if (ereignisseMitJahren.get(ereignis) == jahr) {
                    ereignisseInDiesemJahr.add(ereignis);
                }
            }
            // Ereignisse für das Jahr in die Map einfügen
            ereignisseNachJahr.put(jahr, ereignisseInDiesemJahr);
        }
        return ereignisseNachJahr;
    }

}
