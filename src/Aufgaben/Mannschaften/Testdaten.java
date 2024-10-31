package Aufgaben.Mannschaften;

public class Testdaten {
    public static void main(String[] args) {
        Mannschaft mannschaft = new Mannschaft("BVB");


        // Erzeugen der Objekte

        Spieler spieler1 = new Spieler("Götze", "Mario", "Mittelfeld", 5);
        Spieler spieler2 = new Spieler("Aubameyang", "Pierre-Emerik", "Stürmer", 18);
        Trainer trainer = new Trainer("Tuchel", "Thomas");
        trainer.setLieblingsSpieler(spieler2);
        Arzt arzt = new Arzt("Braun", "Markus", "Orthopädie");


        Mitglieder[] mitglieder = {spieler1, spieler2, trainer, arzt};

        System.out.printf("%s%30s%30s%30s%50s", "Type", "Name", "Vorname", "Jahresgehalt", "Sonsiges");
        for (int i = 0; i < mitglieder.length; i++) {
            System.out.printf("\n%c%35s%30s%30.2f%50s", '#', mitglieder[i].getNachname(), mitglieder[i].getVorname(), mitglieder[i].berechneGehalt(), mitglieder[i].getSonsiges());
        }


    }
}



