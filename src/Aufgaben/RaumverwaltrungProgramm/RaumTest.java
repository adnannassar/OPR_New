package Aufgaben.RaumverwaltrungProgramm;

public class RaumTest {

    public static class RaumverwaltungTest {
        public static void main(String[] args) {
            Raum raum1 = new Raum('C', '2', "30");

            Raum raum2 = new Raum('C', '2', "40");
            Professor prof1 = new Professor("Konstantin Koll");
            raum2.setNutzer(prof1);

            Raum raum3 = new Raum('C', '2', "41");
            Professor prof2 = new Professor("Michael Stark");
            raum3.setNutzer(prof2);

            Raum raum4 = new Raum('A', '2', "02");
            Raum raum5 = new Raum('A', '2', "03");

            Raumverwaltung verwaltung = new Raumverwaltung();

            verwaltung.addRaum(raum1);
            verwaltung.addRaum(raum2);
            verwaltung.addRaum(raum3);
            verwaltung.addRaum(raum4);
            verwaltung.addRaum(raum5);

            verwaltung.ausgabeRaumliste();
        }

    }
}
