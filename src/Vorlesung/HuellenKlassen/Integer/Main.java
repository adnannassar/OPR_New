package Vorlesung.HuellenKlassen.Integer;

public class Main {
    public static void main(String[] args) {
        int number = 42;
        String numberAsString = Integer.toString(number);
        int numberAsInteger =   Integer.parseInt(numberAsString);

        System.out.println(numberAsInteger + 8); // 50
    }
}
