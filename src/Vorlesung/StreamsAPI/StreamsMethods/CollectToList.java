package Vorlesung.StreamsAPI.StreamsMethods;

import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectToList {
    public static void main(String[] args) {
        List<String> collectList = Stream
                .of("Shaker", "Amani", "Zainab", "Nesrin", "Klausur_Extra", "Omar", "Abdou", "Mariam")
                .filter(name -> name.toLowerCase().endsWith("r"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        Iterator<String> it = collectList.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }


    }
}
