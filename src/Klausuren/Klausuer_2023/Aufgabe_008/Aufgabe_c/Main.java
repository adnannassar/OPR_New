package Klausuren.Klausuer_2023.Aufgabe_008.Aufgabe_c;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println(solveUsingLambda(new FileReader("IO_Files/src.txt"), 20));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    private static boolean solveUsingLambda(Reader r, int n) {
        return
                new BufferedReader(r)
                        .lines()
                        .allMatch(line -> line.length() >= n);
    }


    private static boolean readFile(Reader r, int n) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(r);
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            if (line.length() < n) {
                return false;
            }
        }
        return true;
    }
}
