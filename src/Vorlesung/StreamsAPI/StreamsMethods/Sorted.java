package Vorlesung.StreamsAPI.StreamsMethods;

import java.util.Comparator;
import java.util.stream.Stream;

public class Sorted {
    public static void main(String[] args) {
        System.out.println("Sort String");
        Stream
                .of("Shaker", "Amani", "Zainab", "Nesrin", "Klausur_Extra", "Omar", "Abdou", "Mariam")
                .sorted()
                .forEach(System.out::println);

        System.out.println("\nSort complex Datatype");
        Stream
                .of(
                        new Student("Shaker", 20),
                        new Student("Amani", 21),
                        new Student("Omar", 22))
                .sorted(Comparator.comparingInt(s -> s.age))
                .forEach(System.out::println);
    }
}
