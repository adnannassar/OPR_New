package Vorlesung.StreamsAPI.StreamsMethods;

import Vorlesung.OOP.Final.B;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupedBy {
    public static void main(String[] args) {
        Map<Integer, List<String>> map =
                Stream
                        .of("Shaker", "Amani", "Zainab", "Nesrin", "Klausur_Extra", "Omar", "Abdou", "Mariam")
                        .collect(Collectors.groupingBy(name -> name.length()));
        System.out.println(map);


        Map<Character, List<String>> map2 =
                Stream
                        .of("Shaker", "Amani", "Zainab", "Nesrin", "Klausur_Extra", "Omar", "Abdou", "Mariam")
                        .collect(Collectors.groupingBy(name -> name.toLowerCase().charAt(0)));
        System.out.println(map2);


        Map<Boolean, Integer> map3 =
                Stream
                        .of("Shaker", "Amani", "Zainab", "Nesrin", "Klausur_Extra", "Omar", "Abdou", "Mariam")
                        .collect(Collectors.groupingBy(name -> name.toLowerCase().startsWith("a"), Collectors.summingInt(name -> 1)));
        System.out.println(map3);
    }
}
