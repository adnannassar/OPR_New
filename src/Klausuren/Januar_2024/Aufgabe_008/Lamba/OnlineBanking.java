package Klausuren.Januar_2024.Aufgabe_008.Lamba;

public class OnlineBanking {
    private PINregel regel;
    private String pin;

    public OnlineBanking(PINregel regel, String pin) {
        if (regel.istZulaessig(pin)) {
            this.regel = regel;
            this.pin = pin;
        } else {
            throw new IllegalArgumentException("PIN ist nicht zulässig");
        }
    }

    public void setzePINregel(PINregel regel) {
        this.regel = regel;
    }

    public void setPin(String pin) {
        if (regel.istZulaessig(pin)) {
            this.pin = pin;
        } else {
            throw new IllegalArgumentException("PIN ist nicht zulässig");
        }
    }

    @Override
    public String toString() {
        return "OnlineBanking{pin=" + pin + '}';
    }
}
