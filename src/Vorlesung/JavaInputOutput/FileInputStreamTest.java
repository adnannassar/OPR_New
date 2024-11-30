package Vorlesung.JavaInputOutput;

import Klausuren.Klausur_2021.Aufgabe_009.Wunschziel;

import java.io.*;

public class FileInputStreamTest {


    public static void main(String[] args) {
        File file = new File("IO_Files/test.txt");
        readFromFile(file);
    }

    private static void readFromFile(File file) {
        try {
            FileInputStream fis = new FileInputStream(file);
            int result;
            while ((result = fis.read()) != -1) {
                System.out.print((char) result);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
