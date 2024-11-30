package Klausuren.Januar_2024.Aufgabe_004;

public class Main {
    public static void main(String[] args) {
        try {
            Temperatur t0 = new Temperatur(-300.0f);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        Temperatur t1 = new Temperatur(20.0f);
        Temperatur t2 = new Temperatur(20.0f);
        Temperatur t3 = new Temperatur(21.0f);
        Temperatur t4 = new Temperatur(22.0f);

        Temperaturverwaltung temperaturverwaltung = new Temperaturverwaltung();
        temperaturverwaltung.fuegeHinzuNormal(t1);
        temperaturverwaltung.fuegeHinzuNormal(t2);
        temperaturverwaltung.fuegeHinzuNormal(t3);
        temperaturverwaltung.fuegeHinzuNormal(t4);

        System.out.println(temperaturverwaltung.getTemperaturen());


    }
}
