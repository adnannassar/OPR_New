package Klausuren.Klausuer_2022.Aufgabe_002;

public class Zutat {
    private String name;
    private boolean isVegan;

    public Zutat(String name, boolean isVegan) {
        this.name = name;
        this.isVegan = isVegan;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isVegan() {
        return isVegan;
    }

    public void setVegan(boolean vegan) {
        isVegan = vegan;
    }
}
