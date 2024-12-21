package Vorlesung.UnitTest.ManuelTest;

import Vorlesung.UnitTest.Example_001.Book;

public class TestAll {
    public static void main(String[] args) {
        TestForBook.runAllTest(new Book("Asterix der Gallier", "Uderzo", 1965, 9.8));
    }
}
