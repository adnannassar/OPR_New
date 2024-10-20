package Aufgaben.Aufgaben_001;

import java.util.Scanner;

public class Aufgabe_009 {
    public static void main(String[] args) {
        // Database:
        String correctPass = "ABC_12345";
        String correctName = "admin";

        Scanner scanner = new Scanner(System.in);

        System.out.print("Geben sie Benutzername: ");
        String name = scanner.next();

        System.out.print("Geben sie Passwort: ");
        String password = scanner.next();

        if(name.equals(correctName) && password.equals(correctPass)) {
            System.out.println("Du bis eingeloggt!");
        }
        else if(!name.equals(correctName)) {
            System.out.println("Falsche Benutzername");
        }
        else{
            System.out.println("Falsche Passwort");
        }
    }
}
