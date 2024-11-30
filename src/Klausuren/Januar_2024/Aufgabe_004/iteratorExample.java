package Klausuren.Januar_2024.Aufgabe_004;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class iteratorExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer tempValue = iterator.next();
            if (tempValue % 2 == 0) {
                System.out.println(tempValue);
            }
        }
    }
}
