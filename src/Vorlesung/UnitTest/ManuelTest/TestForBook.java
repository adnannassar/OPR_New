package Vorlesung.UnitTest.ManuelTest;

import Vorlesung.UnitTest.Example_001.Book;

public class TestForBook {
    public static void main(String[] args) {
        Book book = new Book("Asterix der Gallier", "Uderzo", 1965, 9.8);
        testIfAsTextCorrectWithCorrectInput(book);
        testIfAsTextCorrectWithWrongInput(book);
        testIfBookOldReturnsCorrectValue(book);
        testIfBookOldReturnsCorrectValueWithWrongInput(book);
    }

    public static void runAllTest( Book book){
        testIfAsTextCorrectWithCorrectInput(book);
        testIfAsTextCorrectWithWrongInput(book);
        testIfBookOldReturnsCorrectValue(book);
        testIfBookOldReturnsCorrectValueWithWrongInput(book);
    }

    private static void testIfAsTextCorrectWithCorrectInput(Book book) {
        String expected = "Asterix der Gallier; Uderzo; 1965; 9.8";
        if (expected.equals(book.asText())) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }
    }

    private static void testIfAsTextCorrectWithWrongInput(Book book) {
        String expected = "Test; Test; Bla; Bla";
        if (expected.equals(book.asText())) {
            System.out.println("Test failed");
        } else {
            System.out.println("Test passed");
        }
    }

    private static void testIfBookOldReturnsCorrectValue(Book book) {
        int expected = 59;
        if (expected == book.bookOld()) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }
    }

    private static void testIfBookOldReturnsCorrectValueWithWrongInput(Book book) {
        int expected = 60;
        if (expected == book.bookOld()) {
            System.out.println("Test failed");
        } else {
            System.out.println("Test passed");
        }
    }
}
