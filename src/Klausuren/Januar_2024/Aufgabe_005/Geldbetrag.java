package Klausuren.Januar_2024.Aufgabe_005;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

public class Geldbetrag {
    private String waehrung;
    private double betrag;

    public Geldbetrag(String waehrung, double betrag) {
        this.waehrung = waehrung;
        this.betrag = betrag;
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

    public String getWaehrung() {
        return waehrung;
    }

    public void setWaehrung(String waehrung) {
        this.waehrung = waehrung;
    }

    public double getBetrag() {
        return betrag;
    }

    public void setBetrag(double betrag) {
        this.betrag = betrag;
    }
}