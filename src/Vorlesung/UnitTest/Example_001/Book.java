package Vorlesung.UnitTest.Example_001;

import java.time.LocalDate;

public class Book {
    private String title;
    private String author;
    private int year;
    private double price;


    public Book(String title, String author, int year, double price) {
        this.title = title;
        this.author = author;
        this.year = year;
        if (price < 0) {
            throw new PriceNegativeException("Price is negative");
        }
        this.price = price;
    }


    public void deleteBook() {
        title = null;
        author = null;
        year = 0;
        price = 0;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            throw new PriceNegativeException("Price cannot be negative");
        }
        this.price = price;

    }

    public String asText() {
        return title + "; " + author + "; " + year + "; " + price;
    }

    public int bookOld() {
        if (year <= 0) {
            return -1;
        }
        return LocalDate.now().getYear() - year;
    }

    public boolean bookIsTrendy() {
        if (bookOld() == -1 || bookOld() > 2) {
            return false;
        }
        return true;
    }
}
