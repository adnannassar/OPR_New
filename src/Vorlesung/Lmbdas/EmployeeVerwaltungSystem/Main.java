package Vorlesung.Lmbdas.EmployeeVerwaltungSystem;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        // 20 employee
        Verwaltung verwaltung = new Verwaltung();
        {
            verwaltung.add(new Employee("Esraa", "Alawad", 1));
            verwaltung.add(new Employee("Mariam", "Alaoirafli", 2));
            verwaltung.add(new Employee("Ali", "Khan", 3));
            verwaltung.add(new Employee("Sara", "Smith", 4));
            verwaltung.add(new Employee("John", "Doe", 5));
            verwaltung.add(new Employee("Ahmed", "Hassan", 6));
            verwaltung.add(new Employee("Noor", "Ali", 7));
            verwaltung.add(new Employee("Laila", "Ahmed", 8));
            verwaltung.add(new Employee("Hassan", "Yousef", 9));
            verwaltung.add(new Employee("Fatima", "Zahra", 10));
            verwaltung.add(new Employee("Youssef", "Ibrahim", 11));
            verwaltung.add(new Employee("Omar", "Farouk", 12));
            verwaltung.add(new Employee("Zara", "Salem", 13));
            verwaltung.add(new Employee("Amir", "Kamal", 14));
            verwaltung.add(new Employee("Layla", "Khalid", 15));
            verwaltung.add(new Employee("Huda", "Nasir", 16));
            verwaltung.add(new Employee("Samir", "Rashid", 17));
            verwaltung.add(new Employee("Aisha", "Hussein", 18));
            verwaltung.add(new Employee("Karim", "Ali", 19));
            verwaltung.add(new Employee("Nada", "Mohamed", 20));
        }

        System.out.println("Name start with A");
        verwaltung.printAllEmployeesWithStartLetter(e -> e.getVorname().startsWith("A"));
        System.out.println("............................................");
        System.out.println("Name start with B");
        verwaltung.printAllEmployeesWithStartLetter(e -> e.getVorname().startsWith("B"));
        System.out.println("............................................");
        System.out.println("Name start with H");
        verwaltung.printAllEmployeesWithStartLetter(e -> e.getVorname().startsWith("H"));
    }
}
