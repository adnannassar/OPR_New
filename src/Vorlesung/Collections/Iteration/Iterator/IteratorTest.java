package Vorlesung.Collections.Iteration.Iterator;

import java.util.Iterator;
import java.util.LinkedList;

public class IteratorTest {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);


        Iterator<Integer> it = linkedList.iterator();

        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
    }
}
