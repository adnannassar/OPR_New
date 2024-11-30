package Vorlesung.StreamsAPI.StreamsMethods;

import java.util.stream.Stream;

public class Peek {
    public static void main(String[] args) {
        Stream
                .of(1,20,30,40)
                .peek( n -> System.out.print("Original: " + n + ", Mapped : "))
                .map( n -> n * 2)
                .forEach(System.out::println);
    }
}
