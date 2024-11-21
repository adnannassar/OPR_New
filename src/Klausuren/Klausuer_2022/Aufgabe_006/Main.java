package Klausuren.Klausuer_2022.Aufgabe_006;

public class Main {


    public static void main(String[] args) {
        KeineTreffer keineTreffer = new KeineTreffer();

        Onlineshop onlineshop = new Onlineshop(keineTreffer);
        onlineshop.suche("Cola");
        onlineshop.suche("Pepsi");



        System.out.println(keineTreffer.getKeineTrefferSet());

        CounterProtokoller counterProtokoller = new CounterProtokoller();
        onlineshop.setProtokollierer(counterProtokoller);
        onlineshop.suche("Cola");
        onlineshop.suche("Pepsi");
        System.out.println(counterProtokoller.getCounterMap());
    }

}
