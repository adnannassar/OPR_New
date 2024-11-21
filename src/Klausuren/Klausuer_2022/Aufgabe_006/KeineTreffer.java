package Klausuren.Klausuer_2022.Aufgabe_006;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class KeineTreffer implements Suchprotokollierer{
    private Set<String> keineTrefferSet= new HashSet<>();
    @Override
    public void protokillieren(String suchbegriff, List<Artikel> artikels) {
            if(!artikels.isEmpty()){
                keineTrefferSet.add(suchbegriff);
            }
    }

    public Set<String> getKeineTrefferSet() {
        return keineTrefferSet;
    }
}
