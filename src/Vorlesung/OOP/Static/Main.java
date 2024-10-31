package Vorlesung.OOP.Static;

public class Main {
    public static void main(String[] args) {
        Baum b = new Baum();
        b.name = "Apfel";

        Baum.age = 20;

        b.printNormal();

        Baum.printStatic();

        System.out.println(Math.random());

    }
}
