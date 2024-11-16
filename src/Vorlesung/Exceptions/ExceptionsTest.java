package Vorlesung.Exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionsTest {

    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        System.out.println(div(a, b));

        System.out.println("Weiter!");

        try {
            readFile("file.txt");
        } catch (IOException e) {
            System.err.println("File not found!");
        }


    }

    public static int div(int a, int b) {
        try {
            return a / b; // could throw an arithmetic exception
        } catch (ArithmeticException e) {
            System.err.println("Division durch 0 ist nicht erlaubt!");
        }
        return -1;
    }

    // example for finally block
    public static int div2(int a, int b) {
        try {
            // connect to database
            // do some operations
        } catch (Exception e) {
            // handle exception
        } finally {
            // close connection
        }
        return -1;
    }

    // example for throw and throws using JavaIO
    public static void readFile(String path) throws IOException {
        try {
            FileReader fileReader = new FileReader("file.txt");
            fileReader.read();

        } catch (IOException e) {
            throw new IOException("File not found!");
        }
    }


}
