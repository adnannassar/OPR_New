package Vorlesung.JavaInputOutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ReadersAndWriters {
    public static void main(String[] args) {
        writeIntoFileUsingReader(new File("IO_Files/Greetings.txt"),
                        "Hallo Welcome in Java Kurse");
    }

    public static void writeIntoFileUsingReader(File f, String message) {
        try (PrintWriter printWriter = new PrintWriter(f)) {
            printWriter.println(message);
            printWriter.flush();
            System.out.println("Message written successfully");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
