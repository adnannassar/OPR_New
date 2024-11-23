package Vorlesung.Lmbdas.EmployeeVerwaltungSystem;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Verwaltung {

    private LinkedList<Employee> employees;

    public Verwaltung() {
        this.employees = new LinkedList<>();
    }

    public void add(Employee employee) {
        this.employees.add(employee);
    }

    // enhanced for loop
    public void printAllEmployeesEnhancedForLoop() {
        for (Employee e : employees) {
            System.out.println(e);
        }
    }

    // forEach!
    public void printAllEmployeesWithForEachFunction() {
        employees.forEach(e -> System.out.println(e));
    }

    public void printAllEmployeesWithStartLetter(Predicate<Employee> predicate) {
        Iterator<Employee> iterator = employees.iterator();
        while (iterator.hasNext()) {
            Employee e = iterator.next();
            if (predicate.test(e)) {
                System.out.println(e);
            }
        }
    }

}
