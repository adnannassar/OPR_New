package Klausuren.Klausur_08_02_2021.Aufgabe_006.Aufgabe_008;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            FilteredInputStream filteredInputStream =
                    new FilteredInputStream(new FileInputStream(new File("IO_Files/src5.txt")), i -> i == 65);
            System.out.println(filteredInputStream.read());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
