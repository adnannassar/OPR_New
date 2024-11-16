package Vorlesung.Interfaces;

public class C extends B implements MyInterface, MyInterface2 {

    public C(int value) {
        super(value);
    }

    @Override
    public void printB2() {
        System.out.println("Print b2 from C class");
    }


    @Override
    public void printI0() {
        System.out.println("Print I0 from C class");
    }

    @Override
    public void printI1() {
        System.out.println("Print I1 from C class");
    }

    @Override
    public void printI2() {
        System.out.println("Print I2 from C class");
    }
}
