package Aufgaben.RaumverwaltrungProgramm;

public class Raumverwaltung {
    private Raum[] raeume;

    public Raumverwaltung() {
        raeume = new Raum[10];
    }

    public void addRaum(Raum raum) {
        for (int i = 0; i < raeume.length; i++) {
            if (raeume[i] == null) {
                raeume[i] = raum;
                break;
            }
        }
    }


    public  void ausgabeRaumliste(){
        for (int i = 0; i < raeume.length; i++) {
            if (raeume[i] != null) {
                System.out.println(raeume[i]);
            }
        }
    }

}


