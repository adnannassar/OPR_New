package Vorlesung.Collections.Listen;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        // size before adding elements
        System.out.println("Size before adding elements: " + arrayList.size());

        // add elements
        arrayList.add("Hello");
        arrayList.add("World");
        arrayList.add("Java");
        arrayList.add("Programming");
        arrayList.add("Language");

        // size after adding elements
        System.out.println("Size after adding elements: " + arrayList.size());

        // print list
        System.out.println(arrayList);

        // contains
        System.out.println("contains Java before remove: " + arrayList.contains("Java"));


        // remove element
        arrayList.remove("Java");

        // print list

        // contains
        System.out.println("contains Java after remove: " + arrayList.contains("Java"));



        // print list
        System.out.println(arrayList);

        // get element
        System.out.println("value at index 2: " + arrayList.get(2));

        // set element
        arrayList.set(2, "Test");


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
        arrayList.add("Hello");
        arrayList.add("World");
        arrayList.add("Java");
        arrayList.add("Programming");
        arrayList.add("Language");

        // print list
        System.out.println(arrayList);

        // subList
        System.out.println("Sublist: " + arrayList.subList(1, 4));



    }
}
