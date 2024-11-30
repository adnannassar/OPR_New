package Vorlesung.JavaInputOutput;

import java.io.File;

public class FileClassTest {
    public static void main(String[] args) {
        System.out.println("File:");
        File file = new File("IO_Files/test.txt");
        System.out.println("File exists: " + file.exists());
        System.out.println("File name: " + file.getName());
        System.out.println("Is file? " + file.isFile());
        System.out.println("Is directory? " + file.isDirectory());
        System.out.println("File path: " + file.getPath());
        System.out.println("File absolute path: " + file.getAbsolutePath());


        System.out.println("......................................................");
        System.out.println("Directory using files names array:");
        File folder = new File("IO_Files");
        System.out.println("Is directory? " + file.isDirectory());
        String[] fileNames = folder.list();
        if (fileNames != null) {
            for (String fileName : fileNames) {
                System.out.println(fileName);
            }
        }

        System.out.println("......................................................");
        System.out.println("Directory using files array:");

        File[] files = folder.listFiles();
        if (files != null) {
            for (File f : files) {
                System.out.println(f.length());
            }
        }
    }
}
