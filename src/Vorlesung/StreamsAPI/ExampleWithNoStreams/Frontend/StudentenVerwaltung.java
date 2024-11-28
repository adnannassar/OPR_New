package Vorlesung.StreamsAPI.ExampleWithNoStreams.Frontend;

import Vorlesung.StreamsAPI.ExampleWithNoStreams.Backend.MappingService;
import Vorlesung.StreamsAPI.ExampleWithNoStreams.DB.DB_Student;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class StudentenVerwaltung {

    public static void main(String[] args) {
        DB_Student dbStudent1 = new DB_Student(2, "Adib", 25);
        DB_Student dbStudent2 = new DB_Student(4, "Aya", 21);
        DB_Student dbStudent3 = new DB_Student(1, "Haya", 22);
        DB_Student dbStudent4 = new DB_Student(3, "Nouhaila", 24);

        Collection<DB_Student> dbStudentList = new LinkedList<>();
        dbStudentList.add(dbStudent1);
        dbStudentList.add(dbStudent2);
        dbStudentList.add(dbStudent3);
        dbStudentList.add(dbStudent4);


        Collection<StudentMappedNameAndNote> studentMappedNameAndNotes = MappingService.mapDbStundenToFrontendStudent(dbStudentList);

        System.out.println("Db_Student: ");
        for (DB_Student dbStudent : dbStudentList) {
            System.out.println("Db_Student: " + dbStudent);
        }
        System.out.println("...................................");

        System.out.println("StudentMappedNameAndNote: ");
        for (StudentMappedNameAndNote studentMappedNameAndNote : studentMappedNameAndNotes) {
            System.out.println(studentMappedNameAndNote);
        }

        System.out.println("...................................");
        System.out.println("StudentMappedNameAndNote with note <= 2: ");
        Collection<StudentMappedNameAndNote> studentMappedNameAndNotesFiltered = new LinkedList<>();
        for (StudentMappedNameAndNote studentMappedNameAndNote : studentMappedNameAndNotes) {
            studentMappedNameAndNotesFiltered.addAll(filterByNote(studentMappedNameAndNote));
        }

        for (StudentMappedNameAndNote studentMappedNameAndNote : studentMappedNameAndNotesFiltered) {
            System.out.println(studentMappedNameAndNote);
        }
    }

    static Collection<StudentMappedNameAndNote> filterByNote(StudentMappedNameAndNote studentMappedNameAndNote) {
        Collection<StudentMappedNameAndNote> studentMappedNameAndNotes = new LinkedList<>();
        if (studentMappedNameAndNote.getNote() <= 2) {
            studentMappedNameAndNotes.add(studentMappedNameAndNote);
        }
        return studentMappedNameAndNotes;
    }
}
