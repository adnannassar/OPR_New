package Vorlesung.UnitTest.Example_001;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;


public class BookTest {

    private static Book book = new Book("Asterix der Gallier", "Uderzo", 1965, 0);

    @Before
    public void setUp() {
        book = new Book("Asterix der Gallier", "Uderzo", 1965, 0);
    }

    @Test
    @DisplayName("Test if asText is correct with correct input")
    public void testIfAsTextCorrectWithCorrectInput() {
        // Arrange
        book.setPrice(10.99);

        // Act
        String result = book.asText();

        // Assert
        String expected = "Asterix der Gallier; Uderzo; 1965; 10.99";
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Test if asText is correct with wrong input")
    public void testIfAsTextCorrectWithWrongInput() {
        // Arrange
        book.setPrice(5);
        // Act
        String result = book.asText();

        // Assert
        String expected = "Asterix der Gallier; Uderzo; 1965; 10";
        assertNotEquals(expected, result);
    }

    @Test
    @DisplayName("Test if bookOld returns correct value")
    public void testIfBookOldReturnsCorrectValue() {
        // Arrange
        book.setYear(2014);
        // Act
        int result = book.bookOld();

        // Assert
        int expected = 10;
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Test if bookOld returns correct value with wrong input")
    public void testIfBookOldReturnsCorrectValueWithWrongInput() {
        // Arrange
        book.setYear(5);

        // Act
        int result = book.bookOld();

        // Assert
        int expected = 10;
        assertNotEquals(expected, result);
    }

    @Test
    @DisplayName("Test if bookIsTrendy returns correct value with wrong input")
    public void testIfBookIsTrendyReturnsCorrectValueWithWrongInput() {
        // Arrange
        book.setYear(2023);

        // Act
        boolean result = book.bookIsTrendy();

        // Assert
        assertTrue(result);
    }

    @Test
    @DisplayName("Test if bookIsTrendy returns correct value")
    public void testIfBookIsTrendyReturnsCorrectValue() {
        // Arrange
        book.setYear(2000);
        // Act
        boolean result = book.bookIsTrendy();

        // Assert
        assertFalse(result);
    }

    @Test
    @DisplayName("Test if book is null")
    public void testIfBookIsDeleted() {
        // Arrange
        book.setYear(2023);
        book.setTitle("Test");

        // Act
        book.deleteBook();

        // Assert
        assertNull(book.getTitle());
        assertNull(book.getAuthor());
        assertFalse(book.bookIsTrendy());
        assertEquals(0, book.getYear());
        assertEquals(0, book.getPrice(), 0);
    }


    @Test
    @DisplayName("Test if negative price throws exception")
    public void testIfNegativePriceThrowsException() {
        // Assert
        assertThrows(PriceNegativeException.class, () -> book.setPrice(-1));
    }


    @Test
    @DisplayName("Test if negative price does not throw exception")
    public void testIfNegativePriceDoesNotThrowException() {
        // Assert
        assertDoesNotThrow(() -> book.setPrice(10));
    }
}