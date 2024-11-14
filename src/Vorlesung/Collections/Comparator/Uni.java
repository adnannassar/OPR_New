package Vorlesung.Collections.Comparator;

import java.util.Comparator;
import java.util.LinkedList;

public class Uni {

    public static void main(String[] args) {
        LinkedList<Student> students = new LinkedList<>();
        students.add(new Student("Belal", 23));
        students.add(new Student("Carlos", 24));
        students.add(new Student("Aya", 22));

        System.out.println("Before sorting");
        System.out.println(students);

        AgeComparator ageComparator = new AgeComparator();
        students.sort(ageComparator);

        System.out.println("After sorting");
        System.out.println(students);

    }

    static class AgeComparator implements Comparator<Student> {
        @Override
        public int compare(Student s1, Student s2) {
            if (s1.getAge() > s2.getAge()) {
                return -1;
            } else if (s1.getAge() < s2.getAge()) {
                return 1;
            } else {
                return 0;
            }
        }
    }
}

