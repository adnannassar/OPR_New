package Klausuren.Klausuer_2022.Aufgabe_006;

import java.util.ArrayList;
import java.util.List;

public class Katalog {
    private List<Artikel> artikels;


    public Katalog() {
      this.artikels = new ArrayList<>();
      this.artikels.add(new Artikel("Cola"));
      this.artikels.add(new Artikel("Pepsi"));
      this.artikels.add(new Artikel("Cola"));
    }

    public List<Artikel> suche(String suchbegriff) {
        List<Artikel> list = new ArrayList<>();

        for (Artikel artikel : artikels) {
            if (artikel.name.contains(suchbegriff)) {
                list.add(artikel);
            }
        }
        return list;
    }

}
