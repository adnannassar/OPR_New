package Klausuren.Klausuer_2022.Aufgabe_005;

import com.sun.security.jgss.GSSUtil;

public class Main {
    public static void main(String[] args) {
        Vogelzaehlung vogelzaehlung = new Vogelzaehlung();


        vogelzaehlung.vogel("Vogel_2", 100);
        vogelzaehlung.vogel("Vogel_1", 50);
        vogelzaehlung.vogel("Vogel_1", 300);
        vogelzaehlung.vogel("Vogel_1", -10);

        vogelzaehlung.printMap();

        System.out.println(vogelzaehlung.alleVoegel());

        System.out.println("Anzahl von Vögel_1: " + vogelzaehlung.anzahl("Vogel_1"));
        System.out.println("Anzahl von Vögel_10: " + vogelzaehlung.anzahl("Vogel_10"));

        System.out.println("Anzahl all Vögel iterator: " + vogelzaehlung.anzahlAlleVögel());
        System.out.println("Anzahl all Vögel enhanced: " + vogelzaehlung.enhancedAnzahlAlleVögel());
        System.out.println("Anzahl all Vögel stream: " + vogelzaehlung.streamAnzahlAlleVögel());


    }
}
