package Klausuren.Klausuer_2023.Aufgabe_012;

import java.io.*;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Copy {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("IO_Files/src.txt");
            FileOutputStream fos = new FileOutputStream("IO_Files/src_copy.txt");
            Set<Integer> s = new HashSet<>();
            Random r = new Random();
            for (int i = 0; i < 26; i++) {
                s.add(r.nextInt(65, 91));
            }
            System.out.println("Anzahl kopierter Bytes: " + kopiere(fis, fos, s));
            System.out.println("File copied successfully");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static long kopiere(InputStream is, OutputStream os, Set<Integer> s) throws IOException {
        int a;
        int count = 0;
        while ((a = is.read()) != -1) {
            if (s.contains(a)) {
                os.write(a);
                count++;
            } else {
                break;
            }
        }
        return count;
    }
}
