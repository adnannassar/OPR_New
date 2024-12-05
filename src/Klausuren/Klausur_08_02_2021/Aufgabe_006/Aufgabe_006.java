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


    public static boolean enthaelt(InputStream is, Set<Byte> set) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        String result = br.readLine();
        Byte[] bytes = new Byte[result.length()];
        for (int i = 0; i < result.length(); i++) {
            bytes[i] = (byte) result.charAt(i);
        }

        for (int j = 0; j < bytes.length; j++) {
            if (bytes[j] != null && !set.contains(bytes[j])) {
                return false;
            }
        }
        return true;
    }
}
