package Vorlesung.UnitTest.Example_001;

public class PriceNegativeException extends IllegalArgumentException {
    public PriceNegativeException(String message) {
        super(message);
    }
}
