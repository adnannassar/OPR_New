package Klausuren.Klausur_08_02_2021.Aufgabe_006;

import java.io.*;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Aufgabe_006 {
    public static void main(String[] args) {
        File file = new File("IO_Files/src3.txt");


        Set<Byte> set = new HashSet<>();
        set.add(((byte) 'A'));
        set.add(((byte) 'B'));


        try {
            System.out.println(enthaelt(new FileInputStream(file), set));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    // use can use the remove method of the set as a trick to check if all bytes are found
    public static boolean enthaelt(InputStream is, Set<Byte> set) throws IOException {
        // Read the input stream byte by byte
        int currentByte;
        while ((currentByte = is.read()) != -1) {
            // Remove the current byte from the set if it exists
            set.remove((byte) currentByte);
            // If the set is empty, all required bytes have been found
            if (set.isEmpty()) {
                return true;
            }
        }
        // If the loop ends and the set is not empty, not all bytes were found
        return false;
    }
}

