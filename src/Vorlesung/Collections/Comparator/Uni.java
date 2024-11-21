package Vorlesung.Collections.Comparator;

import java.util.*;

public class Uni {

    public static void main(String[] args) {

        Set<Student> students = new TreeSet<>(); // no double elements, sorted
        students.add(new Student("Belal", 20));
        students.add(new Student("Carlos", 24));
        students.add(new Student("Carlos", 24));
        students.add(new Student("Aya", 22));

        // System.out.println("Before sorting");
        System.out.println(students);

        NameComparator ageComparator = new NameComparator();
        // students.sort();
        //  Collections.sort(students);
        // students.sort(ageComparator);
        //  Collections.sort(students, ageComparator);
        //  System.out.println("After sorting");
        // System.out.println(students);

    }

    static class NameComparator implements Comparator<Student> {
        @Override
        public int compare(Student s1, Student s2) {
            return s1.getName().compareTo(s2.getName());
        }
    }
}

