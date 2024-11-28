package Vorlesung.StreamsAPI.ExampleWithNoStreams.Backend;

import Vorlesung.StreamsAPI.ExampleWithNoStreams.DB.DB_Student;
import Vorlesung.StreamsAPI.ExampleWithNoStreams.Frontend.StudentMappedAge;
import Vorlesung.StreamsAPI.ExampleWithNoStreams.Frontend.StudentMappedNameAndNote;

import java.util.Collection;
import java.util.LinkedList;

public class MappingService {
    public static StudentMappedAge mapDbStundenToFrontendStudent(DB_Student dbStudent) {
        return new StudentMappedAge(dbStudent.getAge());
    }

    public static Collection<StudentMappedNameAndNote> mapDbStundenToFrontendStudent(Collection<DB_Student> dbStudents) {
        Collection<StudentMappedNameAndNote> studentMappedNameAndNotes = new LinkedList<>();
        for (DB_Student dbStudent : dbStudents) {
            studentMappedNameAndNotes.add(new StudentMappedNameAndNote(dbStudent.getName(), dbStudent.getNote()));
        }
        return studentMappedNameAndNotes;
    }

}
