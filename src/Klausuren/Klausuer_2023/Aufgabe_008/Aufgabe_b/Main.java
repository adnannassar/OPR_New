package Klausuren.Klausuer_2023.Aufgabe_008.Aufgabe_b;

import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        LongStream
                .iterate(1, n -> n < Long.MAX_VALUE, n -> n * 2 + 1)
                .filter(n -> isPrimZahl((int) n))
                .sorted()
                .forEach(System.out::println);

        /*
        LongStream.of(1, 3, 7, 15, 31)
                .filter(n -> isPrimZahl((int) n))
                .sorted()
                .forEach(System.out::println);
        */
    }

    private static boolean isPrimZahl(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
