package Klausuren.Klausur_08_02_2021.Aufgabe_006;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.HashSet;
import java.util.Set;

public class Aufgabe_005 {
    public static void main(String[] args) {
        File file = new File("IO_Files/src4.txt");
        try {
            System.out.println("Ergebnis: " + minLaengeUndZeichen(new FileReader(file), (short) 11, (short) 4));
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }

    private static boolean minLaengeUndZeichen(Reader r, short länge, short sequence) {
        int counter = 0;
        int tmp;
        Set<Integer> set = new HashSet<>();
        try {
            while ((tmp = r.read()) != -1 && counter < länge) {
                set.add(tmp);
                counter++;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return set.size() == sequence;
    }
}