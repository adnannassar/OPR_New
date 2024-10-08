package Wiederholung.OOP.Basic;

public class Student {

    private String name;
    private float note;

    // constructor
    public Student(String name, float note) {
        this.name = name;
        this.note = note;
    }

    // getter
    public String getName(){
        return name;
    }

    public float getNote(){
        return note;
    }

    // setter
    public void setName(String name) {
        this.name = name;
    }

}
