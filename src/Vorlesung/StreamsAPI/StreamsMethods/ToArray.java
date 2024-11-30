package Vorlesung.StreamsAPI.StreamsMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ToArray {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4));

        Integer[] array = list.stream().toArray(Integer[]::new);

        System.out.println(array.length);
        System.out.println("Array elements:");
        for (Integer i : array) {
            System.out.println(i);
        }
    }
}
