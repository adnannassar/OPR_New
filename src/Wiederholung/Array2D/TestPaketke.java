package Wiederholung.Array2D;

import Wiederholung.OOP.Vererbung.*;


public class TestPaketke {
    public static void main(String[] args) {
        Student student = new Student("Adib", 25, 123345, 1.0f);
        student.printStudentInfo();

        Professor professor = new Professor("Müller", 50, "IT");

        Mitarbeiter mitarbeiter = new Mitarbeiter("Aya" ,20, 5000);
    }
}
