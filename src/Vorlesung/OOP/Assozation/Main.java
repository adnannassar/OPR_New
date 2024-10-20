package Vorlesung.OOP.Assozation;

public class Main {
    public static void main(String[] args) {
        Address address = new Address("Teststr", "Dortmund", "1", "12345");

        Person p = new Person("Ahmad", 25, address);

        Kontakt email = new Kontakt("Email", "test@gmail.com");
        Kontakt handynr = new Kontakt("Handynummer", "0049 12313231231");

        p.addKontakt(email);
        p.addKontakt(handynr);

        System.out.println(p.getName());
        System.out.println(p.getAge());
        System.out.println(
                p.getAddress().getStraße() + " " +
                        p.getAddress().getHausnummer() + " " +
                        p.getAddress().getPlz() + " " +
                        p.getAddress().getOrt());
        p.printKontakts();
    }
}
