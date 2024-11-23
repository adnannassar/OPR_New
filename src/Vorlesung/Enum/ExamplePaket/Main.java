package Vorlesung.Enum.ExamplePaket;

public class Main {

    static void paket(double gewicht) {
        if (Paket.valueOf("S").maxGewicht() >= gewicht) {
            System.out.println("Das Paket passt mit dem Gewicht " + gewicht + " passt in S");
        } else if (Paket.valueOf("M").maxGewicht() >= gewicht) {
            System.out.println("Das Paket passt mit dem Gewicht " + gewicht + " passt in M");
        } else if (Paket.valueOf("L").maxGewicht() >= gewicht) {
            System.out.println("Das Paket passt mit dem Gewicht " + gewicht + " passt in L");
        } else if (Paket.valueOf("XL").maxGewicht() >= gewicht) {
            System.out.println("Das Paket passt mit dem Gewicht " + gewicht + " passt in XL");
        } else {
            System.out.println("Das Paket ist zu groß");
        }
    }

    public static void main(String[] args) {
        paket(1);
        paket(3);
        paket(6);
        paket(11);
        paket(26);
    }


}
