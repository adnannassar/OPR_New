package Klausuren.Januar_2024.Aufgabe_008.Inline;

public class Main {
    public static void main(String[] args) {
        OnlineBanking onlineBanking = new OnlineBanking();
        onlineBanking.setzePINregel(new PINregel() {
            @Override
            public boolean istZulaessig(String pin) {
                return pin.length() >= 5 && pin.charAt(0) != pin.charAt(pin.length() - 1);
            }
        });

        // kein pin ist zulässig
        onlineBanking.setzePINregel(new PINregel() {
            @Override
            public boolean istZulaessig(String pin) {
                return false;
            }
        });
    }
}
