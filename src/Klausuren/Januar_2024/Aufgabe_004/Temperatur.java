package Klausuren.Januar_2024.Aufgabe_004;

public class Temperatur {
    private final float t;

    public Temperatur(float t) throws IllegalArgumentException {
        if (t < -273.15f) {
            throw new IllegalArgumentException("Temperatur darf nicht unter -273.15 Grad Celsius sein.");
        } else {
            this.t = t;
        }
    }

    public float wert() {
        return t;
    }

    @Override
    public String toString() {
        return "Temperatur{" +
                "t=" + t +
                '}';
    }
}