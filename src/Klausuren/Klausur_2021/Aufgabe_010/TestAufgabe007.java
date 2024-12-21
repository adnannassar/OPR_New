package Klausuren.Klausur_2021.Aufgabe_010;

import Klausuren.Klausur_2021.Aufgabe_007.Aufgabe_007;
import org.junit.Test;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import static org.junit.Assert.*;

public class TestAufgabe007 {

    @Test
    public void test1() {
        // Arrange
        BufferedInputStream bs = null;
        try {
            bs = new BufferedInputStream(new FileInputStream(new File("IO_Files/test.txt")));
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        // Act
        boolean expected = Aufgabe_007.hatMindestlaenge(bs, 6);

        // Assert
        assertTrue(expected);

    }

    @Test
    public void test2() {
        // Arrange
        BufferedInputStream bs = null;
        try {
            bs = new BufferedInputStream(new FileInputStream(new File("IO_Files/test.txt")));
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        // Act
        boolean expected = Aufgabe_007.hatMindestlaenge(bs, 100);

        // Assert
        assertFalse(expected);

    }

    @Test
    public void test3() {
        // Arrange
        BufferedInputStream bs = null;
        try {
            bs = new BufferedInputStream(new FileInputStream(new File("IO_Files/test.txt")));
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        // Assert
        BufferedInputStream finalBs = bs;
        assertThrows(IllegalArgumentException.class, () -> {
            // Act
            Aufgabe_007.hatMindestlaenge(finalBs, -1);
        });

    }
}
