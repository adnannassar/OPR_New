package Klausuren.Klausuer_2022.Aufgabe_006;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class CounterProtokoller implements Suchprotokollierer {
    private Map<String, Integer> counterMap = new TreeMap<>();

    @Override
    public void protokillieren(String suchbegriff, List<Artikel> artikels) {
        for (Artikel artikel : artikels) {
            if (counterMap.containsKey(artikel.name)) {
                counterMap.put(artikel.name, counterMap.get(artikel.name) + 1);
            } else {
                counterMap.put(artikel.name, 1);
            }

        }
    }

    public Map<String, Integer> getCounterMap() {
        return counterMap;
    }
}
