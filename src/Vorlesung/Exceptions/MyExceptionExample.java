package Vorlesung.Exceptions;

import javax.swing.*;

public class MyExceptionExample {
    public static void main(String[] args) {

        testThePrintMethode();
    }

    public static void testThePrintMethode() {
        String[] namesStartWithA = {"Aya", "Adnan", "Adib", "Shahd"};
        try {
            printArray(namesStartWithA);
        } catch (WordDoesNotStartWithAException e) {
            System.out.println(e.getMessage());
        }
    }


    public static void printArray(String[] names) throws WordDoesNotStartWithAException {
        for (int i = 0; i < names.length; i++) {
            if (!names[i].startsWith("A")) {
                throw new WordDoesNotStartWithAException("Word does not start with A --> " + names[i]);
            }
        }
    }
}
