package Klausuren.Klausuer_2022.Aufgabe_010;

import java.io.*;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Copy {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("IO_Files/src2.txt");
            FileOutputStream fos = new FileOutputStream("IO_Files/src2_copy.txt");

            System.out.println("Anzahl kopierter Bytes: " + kopiere(fis, fos, 17));
            System.out.println("File copied successfully");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    private static long kopiere(InputStream is, OutputStream os, long n) {
        int a;
        int count = 0;
        while (true) {
            try {
                if (!((a = is.read()) != -1 && count <= n)) {
                    os.write(a);
                } else {
                    break;
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
            count++;
        }
        return count;
    }
}


