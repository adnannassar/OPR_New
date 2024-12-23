package Klausuren.Klausur_Juli_2024.Aufgabe_007;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>(
                (o1, o2) -> {
            o1 = o1.replace(" ", "");
            o2 = o2.replace(" ", "");
            return o1.compareTo(o2);
        });

        set.add("zu viel");
        set.add("zug");
        set.add("zum");

        for (String s : set) {
            System.out.println(s);
        }
    }
}
