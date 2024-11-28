package Vorlesung.StreamsAPI.ExampleWithNoStreams.Frontend;

import Vorlesung.StreamsAPI.ExampleWithNoStreams.Backend.MappingService;
import Vorlesung.StreamsAPI.ExampleWithNoStreams.DB.DB_Student;

public class Main {
    public static void main(String[] args) {
        DB_Student dbStudent = new DB_Student(1, "Adib", 25);
        System.out.println("Db_Student: " + dbStudent);

       StudentMappedAge frontendStudent =  MappingService.mapDbStundenToFrontendStudent(dbStudent);
        System.out.println("FrontendStudent: " + frontendStudent);
    }
}
