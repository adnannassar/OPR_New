package Vorlesung.StreamsAPI.StreamsMethods;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class WeitereStreams {
    public static void main(String[] args) {
        IntStream.range(1, 10).forEach(System.out::print);
        System.out.println();
        DoubleStream.of(1.1, 2.2, 3.3, 4.4, 5.5).forEach(System.out::print);

    }
}
