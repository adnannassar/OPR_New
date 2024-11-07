package Vorlesung.Collections.Iteration.EnhancedFor;

import java.util.LinkedList;

public class EnhancedForTest {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);

        for (Integer zeiger : linkedList) {
            System.out.print(zeiger + " ");
        }

        System.out.println();
    }
}
