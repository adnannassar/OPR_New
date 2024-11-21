package Klausuren.Klausuer_2022.Aufgabe_006;

import java.util.List;

public class Onlineshop {
    private Katalog katalog;
    private Suchprotokollierer protokollierer;


    public Onlineshop(Suchprotokollierer protokollierer) {
        this.katalog = new Katalog();
        this.protokollierer = protokollierer;
    }

    public void setProtokollierer(Suchprotokollierer protokollierer) {
        this.protokollierer = protokollierer;
    }

    public List<Artikel> suche(String suchbegriff) {
        List<Artikel> treffer = katalog.suche(suchbegriff);
        protokollierer.protokillieren(suchbegriff, treffer);
        return treffer;
    }
}
