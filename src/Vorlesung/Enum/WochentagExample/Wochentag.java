package Vorlesung.Enum.WochentagExample;

public enum Wochentag {
    MONTAG, DIENSTAG, MITTWOCH, DONNERSTAG, FREITAG, SAMSTAG, SONNTAG;

    // MONTAG> --> ordinal --> 0
    // DIENSTAG> --> ordinal --> 1
    // MITTWOCH> --> ordinal --> 2
    // DONNERSTAG> --> ordinal --> 3
    // FREITAG> --> ordinal --> 4
    // SAMSTAG> --> ordinal --> 5
    // SONNTAG> --> ordinal --> 6

    public boolean istWochenende() {
        return this == SAMSTAG || this == SONNTAG;
    }
    public Wochentag naechsterTag() {
        return values()[(this.ordinal() + 1) % values().length];
    }

}
