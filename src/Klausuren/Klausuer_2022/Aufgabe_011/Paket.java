package Klausuren.Klausuer_2022.Aufgabe_011;

import java.util.Optional;

public enum Paket {
    S(2),
    M(5),
    L(10),
    XL(25);

    private int maxGewicht;

    Paket(int maxGewicht) {
        this.maxGewicht = maxGewicht;
    }

    public int maxGewicht() {
        return maxGewicht;
    }
}