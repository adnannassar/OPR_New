package Vorlesung.OOP.Static;

public class Baum {
    String  name;
    static int age;


    public void printNormal(){
        System.out.println("Name: "+name);
    }

    public static void printStatic(){
        System.out.println("Age: "+age);
    }
}
