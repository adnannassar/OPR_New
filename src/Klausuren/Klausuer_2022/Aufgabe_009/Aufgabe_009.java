package Klausuren.Klausuer_2022.Aufgabe_009;

import java.util.stream.IntStream;

public class Aufgabe_009 {

    interface DoubleStream {
        IntStream mapToInt(MapToIn mapToIn);
    }

    @FunctionalInterface
    interface MapToIn {
        int apply(double value);
    }

}
