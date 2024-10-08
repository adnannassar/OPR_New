package Wiederholung.OOP.Vererbung;

public class Student extends Person {
    private int mtrnr;
    private float note;

    public Student(String name, int age, int mtrnr, float note) {
        super(name, age);
        this.mtrnr = mtrnr;
        this.note = note;
    }

    public int getMtrnr() {
        return mtrnr;
    }

    public void setMtrnr(int mtrnr) {
        this.mtrnr = mtrnr;
    }

    public float getNote() {
        return note;
    }

    public void setNote(float note) {
        this.note = note;
    }

    public void printStudentInfo() {
        System.out.println("Student: ");
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Mtrnr: " + mtrnr);
        System.out.println("Note: " + note);
    }


}
