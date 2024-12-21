package Klausuren.Klausuer_2022.Aufgabe_003;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import java.util.NoSuchElementException;
import java.util.StringTokenizer;

import static org.junit.Assert.assertThrows;

public class Aufgabe_003 {

    @Test
    @DisplayName("Test if nextToken throws NoSuchElementException")
    public void test() {
        // Arrange
        StringTokenizer tokenizer = new StringTokenizer("E-Bike", "-");

        // Act
        tokenizer.nextToken();
        tokenizer.nextToken();

        // Assert
        assertThrows(NoSuchElementException.class, () -> tokenizer.nextToken());

        // alternative
        // assertThrows(NoSuchElementException.class,tokenizer::countTokens);
    }
}
