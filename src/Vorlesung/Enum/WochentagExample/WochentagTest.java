package Vorlesung.Enum.WochentagExample;

public class WochentagTest {
    public static void main(String[] args) {

        if (Wochentag.SONNTAG.istWochenende()) {
            System.out.println("Wochenende");
        }

        if(Wochentag.FREITAG.ordinal() > Wochentag.DONNERSTAG.ordinal()){
            System.out.println("Freitag ist nach Donnerstag");
        }

        if(Wochentag.MONTAG.naechsterTag().equals(Wochentag.DIENSTAG)){
            System.out.println("Montag ist vor Dienstag");
        }
    }
}
