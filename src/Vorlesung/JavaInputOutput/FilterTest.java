package Vorlesung.JavaInputOutput;

import java.io.File;

public class FilterTest {
    public static void main(String[] args) {
        File folder = new File("IO_Files");
        File[] files = folder.listFiles(file -> file.getName().endsWith(".pdf"));
        System.out.println("PDF files:");
        if (files != null) {
            for (File f : files) {
                System.out.println(f);
            }
        }

        System.out.println("---------------------------------------------");
        System.out.println("Text files:");
        File[] files2 = folder.listFiles(new TxtFilter());
        if (files2 != null) {
            for (File f : files2) {
                System.out.println(f);
            }
        }

    }
}
