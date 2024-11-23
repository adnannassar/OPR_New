package Vorlesung.Lmbdas.Calculator;

public class Add implements CalculateAction {
    @Override
    public int calculate(int a, int b) {
        return a + b;
    }
}
