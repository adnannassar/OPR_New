package Klausuren.Klausuer_2022.Aufgabe_003;

import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {

        StringTokenizer tokenizer = new StringTokenizer("E-Bike", "-");
        System.out.println(tokenizer.countTokens());
        tokenizer.nextToken();
        tokenizer.nextToken();
        // tokenizer.nextToken(); // throws NoSuchElementException
    }
}
