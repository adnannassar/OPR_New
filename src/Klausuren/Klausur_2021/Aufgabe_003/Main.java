package Klausuren.Klausur_2021.Aufgabe_003;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        String[] wörter = {"Fahrrad", "123 Abflussreinigung", "Fahrstuhl",
                "frische Blumen", "Fahrrad", "Pfirsich"};
        Map<Character, Collection<String>> resultMap = erzeugeIndex2(wörter);
        System.out.println(resultMap);
    }

    public static Map<Character, Collection<String>> erzeugeIndex(String[] wörter) {
        Map<Character, Collection<String>> erg = new TreeMap<>();
        for (int i = 0; i < wörter.length; i++) {
            char ersteBuchstabe = wörter[i].charAt(0);
            if (!erg.keySet().contains(ersteBuchstabe)) {
                erg.put(ersteBuchstabe, new HashSet<>());
            }
            Collection<String> wörterInDasKey = erg.get('F');

            String wortAusDemArray = wörter[i];

            wörterInDasKey.add(wortAusDemArray);

            // oder die letzten drei Zeilen kann auch so geschrieben werden:
            // erg.get(ersteBuchstabe).add(wörter[i]);
        }
        return erg;
    }

    public static Map<Character, Collection<String>> erzeugeIndex2(String[] wörter) {
        Map<Character, Collection<String>> erg = new TreeMap<>();
        for (int i = 0; i < wörter.length; i++) {
            char ersteBuchstabe = wörter[i].charAt(0);

            if (!erg.keySet().contains(ersteBuchstabe)) {
                erg.put(ersteBuchstabe, new HashSet<>());
            }

            Set<Character> keySet = erg.keySet();
            for (Character c : keySet) {
                if (Character.toLowerCase(c) == Character.toLowerCase(ersteBuchstabe)) {
                    erg.get(c).add(wörter[i]);
                }
            }
            erg.get(ersteBuchstabe).add(wörter[i]);
        }
        return erg;
    }
}

