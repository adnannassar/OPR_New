package Klausuren.Januar_2024.Aufgabe_008.OOP;


public class NegativeRegel implements PINregel {
    @Override
    public boolean istZulaessig(String pin) {
        return false;
    }
}
