package Klausuren.Januar_2024.Aufgabe_008.OOP;


public class MeinRegel implements PINregel {
    @Override
    public boolean istZulaessig(String pin) {
        return pin.length() >= 5 && pin.charAt(0) != pin.charAt(pin.length() - 1);
    }
}
