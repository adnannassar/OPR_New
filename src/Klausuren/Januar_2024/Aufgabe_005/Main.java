package Klausuren.Januar_2024.Aufgabe_005;

import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Geldbetrag gb1 = new Geldbetrag("EUR", 12);
        Geldbetrag gb2 = new Geldbetrag("EUR", 8);
        Geldbetrag gb3 = new Geldbetrag("EUR", 30);
        Geldbetrag gb4 = new Geldbetrag("USD", 100);

        System.out.println(summiere(Arrays.asList(gb1, gb2, gb3, gb4)));
    }

    public static Map<String, Double> summiere(Collection<Geldbetrag> betraege) {
        Map<String, Double> ergMap = new TreeMap<>();
        for (Geldbetrag gb : betraege) {
            if (ergMap.containsKey(gb.getWaehrung())) {
                String waehrung = gb.getWaehrung();
                double alteWart = ergMap.get(waehrung);
                double neuenWert = gb.getBetrag();
                ergMap.put(waehrung, (alteWart + neuenWert));
            } else {
                ergMap.put(gb.getWaehrung(), gb.getBetrag());
            }
        }
        return ergMap;
    }

}
