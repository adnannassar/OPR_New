package Vorlesung.Interfaces;

public class Main {
    public static void main(String[] args) {
        MyInterface i1 = new C(1);
        i1.printI1();

        MyInterface i2 = new D();
        i2.printI1();
    }
}
