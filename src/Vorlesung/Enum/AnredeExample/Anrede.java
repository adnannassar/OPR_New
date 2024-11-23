package Vorlesung.Enum.AnredeExample;

public enum Anrede {
    SIR("Herr"),
    DAME("Frau");

    private String value;

    Anrede(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }
}
