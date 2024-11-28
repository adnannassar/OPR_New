package Vorlesung.StreamsAPI.ExampleWithStreamAPI.Frontend;

public class StudentMappedNameAndNote {
    private String name;
    private int note;


    public StudentMappedNameAndNote(String name, int note) {
        this.name = name;
        this.note = note;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int age) {
        this.note = age;
    }

    @Override
    public String toString() {
        return "StudentMappedNameAndNote{" +
                "name='" + name + '\'' +
                ", note=" + note +
                '}';
    }
}
