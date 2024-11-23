package Vorlesung.Enum.AnredeExample;

import Vorlesung.OOP.Assozation.Address;

public class Verwaltung {
    public static void main(String[] args) {
        Employee employee = new Employee(
                "Aya",
                "AlZoubi",
                20,
                new Address(
                        "Meine Strasse",
                        "Dortmund",
                        "1",
                        "12345"),
                Anrede.DAME
        );

        System.out.println(employee.getAnrede().value());
    }

}
