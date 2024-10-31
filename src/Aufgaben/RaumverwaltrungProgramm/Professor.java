package Aufgaben.RaumverwaltrungProgramm;

public class Professor {
    private String name;


    public Professor(String name) {
        this.name = name;
    }

    public String getNamme() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
