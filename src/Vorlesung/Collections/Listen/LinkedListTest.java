package Vorlesung.Collections.Listen;

import java.util.LinkedList;
import java.util.Objects;


// type parameter E == type sicher == generisch

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<Integer> arrayList = new LinkedList<>();
        // size before adding elements
        System.out.println("Size before adding elements: " + arrayList.size());

        // add elements
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);
        arrayList.add(50);


        int value = Integer.parseInt(arrayList.get(1).toString());


        // size after adding elements
        System.out.println("Size after adding elements: " + arrayList.size());

        // print list
        System.out.println(arrayList);

        // remove element
        arrayList.remove(2);

        // print list
        System.out.println(arrayList);

        // get element
        System.out.println("value at index 2: " + arrayList.get(2));

        // set element
        arrayList.set(2, 100);


        // print list
        System.out.println("after set: " + arrayList);

        //  indexOf
        System.out.println("index of 100: " + arrayList.indexOf(100));

        // clear list
        arrayList.clear();

        // size after clearing list
        System.out.println("Size after clearing list: " + arrayList.size());

        // print list
        System.out.println(arrayList);

        // add elements
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);
        arrayList.add(50);

        // print list
        System.out.println(arrayList);

        // subList
        System.out.println("Sublist: " + arrayList.subList(1, 4));



    }
}
