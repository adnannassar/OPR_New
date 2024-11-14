package Vorlesung.Collections.Sets.TreeSet;

import java.util.*;

public class Uni {

    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();

        students.add(new Student("Belal", 23));
        students.add(new Student("Belal", 23));
        students.add(new Student("Carlos", 24));
        students.add(new Student("Carlos", 24));
        students.add(new Student("Aya", 22));

        System.out.println(students);



    }

}

