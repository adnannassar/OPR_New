package Vorlesung.StreamsAPI.ExampleWithStreamAPI.Frontend;


import Vorlesung.StreamsAPI.ExampleWithStreamAPI.DB.DB_Student;

import java.util.List;
import java.util.stream.Stream;

public class StudentenVerwaltung {

    public static void main(String[] args) {
        Stream.of(
                        new DB_Student(2, "Adib", 25),
                        new DB_Student(4, "Aya", 21),
                        new DB_Student(1, "Haya", 22),
                        new DB_Student(3, "Nouhaila", 24))
                .map(dbStudent -> new StudentMappedNameAndNote(dbStudent.getName(), dbStudent.getNote()))
                .filter(nameNoteStudent -> nameNoteStudent.getNote() <= 2)
                .forEach(item -> System.out.println(item));
    }
}
