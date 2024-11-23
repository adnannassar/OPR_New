package Vorlesung.Enum.AnredeExample;

import Vorlesung.OOP.Assozation.Address;

public class Employee {
    private String vorname;
    private String nachname;
    private int alter;
    private Address address;
    private Anrede anrede;

    public Employee(String vorname, String nachname, int alter, Address address, Anrede gender) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.alter = alter;
        this.address = address;
        this.anrede = gender;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public Anrede getAnrede() {
        return anrede;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "vorname='" + vorname + '\'' +
                ", nachname='" + nachname + '\'' +
                ", alter=" + alter +
                '}';
    }
}
