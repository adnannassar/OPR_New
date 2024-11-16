package Vorlesung.Exceptions;

public class WordDoesNotStartWithAException extends Exception {

    public WordDoesNotStartWithAException() {

    }

    public WordDoesNotStartWithAException(String message) {
        super(message);
    }
}
