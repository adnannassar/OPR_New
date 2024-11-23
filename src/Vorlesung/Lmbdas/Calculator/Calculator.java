package Vorlesung.Lmbdas.Calculator;

import java.util.function.BinaryOperator;

public class Calculator {
    public static void main(String[] args) {
        Add add = new Add(); // oop way

        // lambda way or functional programming way
        CalculateAction sub = (a, b) -> a - b;
        CalculateAction mul = (a, b) -> a * b;
        CalculateAction div = (a, b) -> a / b;
        CalculateAction mod = (a, b) -> a % b;

        System.out.println(add.calculate(10, 20));
        System.out.println(sub.calculate(10, 20));
        System.out.println(mul.calculate(10, 20));
        System.out.println(div.calculate(10, 20));
        System.out.println(mod.calculate(10, 20));
    }
}
