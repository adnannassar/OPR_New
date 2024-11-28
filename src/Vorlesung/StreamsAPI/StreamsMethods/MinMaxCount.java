package Vorlesung.StreamsAPI.StreamsMethods;

import java.util.*;

public class MinMaxCount {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 10));

        Optional<Integer> min = list.stream().min(Integer::compare);
        System.out.println("Min  " + min.get());

        Optional<Integer> max = list.stream().max(Integer::compare);
        System.out.println("Max  " + max.get());

        long count = list.stream().count();
        System.out.println("Count " + count);
    }
}
