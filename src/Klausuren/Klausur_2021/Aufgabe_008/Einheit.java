package Klausuren.Klausur_2021.Aufgabe_008;

public enum Einheit {
    MUM(10000000),
    MM(1000000),
    CM(100000),
    DM(10000),
    M(1000),
    KM(1);

    // cm 12000 --> 1200 dm ---> 120m --> 1,2 km

    private long geeigneteEinheit;

    Einheit(long geeigneteEinheit) {
        this.geeigneteEinheit = geeigneteEinheit;
    }

    public long getGeeigneteEinheit() {
        return geeigneteEinheit;
    }
}
