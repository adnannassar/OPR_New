package Vorlesung.Collections.Iteration.For;

import java.util.LinkedList;

public class ForTest {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);


        for (int i = 0; i < linkedList.size() / 2; i++) {
            System.out.print(linkedList.get(i) + " ");
        }
        System.out.println();


    }
}
