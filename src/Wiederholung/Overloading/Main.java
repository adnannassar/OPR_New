package Wiederholung.Overloading;

public class Main {
    public static void main(String[] args) {
      test1("Adib" , 1);
      test1(1 , " adib");
    }

    // Überladen = Overloading
    public static void test1(String name, int x) {
        System.out.println("Hallo String " + name);
    }

    public static void test1(int x, String name) {
        System.out.println("Hallo int " + x + name);
    }
}
