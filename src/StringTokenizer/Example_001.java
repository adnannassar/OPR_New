package StringTokenizer;

import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.util.*;

public class Example_001 {


    public static void main(String[] args) throws FileNotFoundException {
        String text = "Dies ist ein\n" +
                "Beispieltext. Dieser Text\n" +
                "soll satzweise ausgegeben werden.\n" +
                "Dabei muss auf vieles geachtet werden.";
        System.out.println("Before tokenization");
        System.out.println(text);

        text = text.replaceAll("\n", " ");
        text = text.replaceAll("\\. ", ".");

        StringTokenizer st = new StringTokenizer(text, ".");
        System.out.println("\nAfter tokenization");
        while (st.hasMoreTokens()) {
            String temp = st.nextToken() + ".";
            System.out.println(temp);
        }
    }
}
