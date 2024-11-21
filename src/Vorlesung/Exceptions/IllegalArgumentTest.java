package Vorlesung.Exceptions;

public class IllegalArgumentTest {

}

class Student {
    String name = "Test";

    public Student(String name) throws IllegalArgumentException {
        if (!name.equals("Hallo")) {
            throw new IllegalArgumentException("Name muss Hallo sein");
        } else {
            this.name = name;
        }
    }
}

