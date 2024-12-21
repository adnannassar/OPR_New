package Klausuren.Klausur_2021.Aufgabe_007;

import java.io.*;

public class Aufgabe_007 {
    public static void main(String[] args) {
        try {
            System.out.println(hatMindestlaenge(new FileInputStream(new File("IO_Files/test.txt")), -1));
        } catch (IllegalArgumentException | FileNotFoundException e) {
            System.out.printf(e.getMessage());
        }
    }

    public static boolean hatMindestlaenge(InputStream is, long mindestLaenge) throws IllegalArgumentException {
        if (is == null || mindestLaenge < 0) {
            throw new IllegalArgumentException("Mindestlaenge ist kleiner als 0");
        }
        BufferedInputStream bis = new BufferedInputStream(is);
        long counter = 0;
        while (counter < mindestLaenge) {
            try {
                if (bis.read() == -1) break;
            } catch (IOException e) {
                System.out.printf(e.getMessage());
            }
            counter++;
        }
        return counter >= mindestLaenge;
    }
}
