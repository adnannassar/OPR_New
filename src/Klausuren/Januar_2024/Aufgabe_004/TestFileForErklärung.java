package Klausuren.Januar_2024.Aufgabe_004;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class TestFileForErklärung {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4));

        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            if (it.next() > 0) { // 2
                if (it.next() < 2) { // 3
                    if (it.next() == 1) { // 4
                        System.out.println("Ich habe eine 1 gefunden");
                    }
                }
            }
        }



        System.out.println("..............................................");
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > 0) {
                if (list.get(i) < 2) {
                    if (list.get(i) == 1) {
                        System.out.println("Ich habe eine 1 gefunden");
                    }
                }
            }
        }
    }
}
