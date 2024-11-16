package Vorlesung.Interfaces;

public abstract class B extends A {
    public B(int value) {
        super(value);
    }

    public void printB() {
        System.out.println("B");
    }

    public abstract void printB2();
}
