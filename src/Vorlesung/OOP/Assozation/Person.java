package Vorlesung.OOP.Assozation;

public class Person {
    private String name;
    private int age;


    private Address address;
    private Kontakt[] kontakts;

    public Person(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.kontakts = new Kontakt[3]; // {null, null , null}
    }

    public void addKontakt(Kontakt k) {
        for(int i = 0; i < kontakts.length; i++) {
            if(kontakts[i] == null) {
                kontakts[i] = k;
                break;
            }
        }
    }


    public void printKontakts() {
        for(int i = 0; i < kontakts.length; i++) {
            if(kontakts[i] != null) {
                System.out.println(kontakts[i].getType()+ ": " + kontakts[i].getValue());
            }
        }
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
