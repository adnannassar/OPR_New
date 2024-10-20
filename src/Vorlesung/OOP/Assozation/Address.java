package Vorlesung.OOP.Assozation;

public class Address {
    private String straße;
    private String ort;
    private String hausnummer;
    private String plz;


    public Address(String straße, String ort, String hausnummer, String plz) {
        this.straße = straße;
        this.ort = ort;
        this.hausnummer = hausnummer;
        this.plz = plz;
    }

    public String getStraße() {
        return straße;
    }

    public void setStraße(String straße) {
        this.straße = straße;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public String getHausnummer() {
        return hausnummer;
    }

    public void setHausnummer(String hausnummer) {
        this.hausnummer = hausnummer;
    }

    public String getPlz() {
        return plz;
    }

    public void setPlz(String plz) {
        this.plz = plz;
    }
}
