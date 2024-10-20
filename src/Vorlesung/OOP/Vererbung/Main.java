package Vorlesung.OOP.Vererbung;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Adib", 25, 123345, 1.0f);
        student.printStudentInfo();

        Professor professor = new Professor("Müller", 50, "IT");

        Mitarbeiter mitarbeiter = new Mitarbeiter("Aya" ,20, 5000);
    }
}
