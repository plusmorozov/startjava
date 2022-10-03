package com.startjava.lesson_2_3_4.bookshelf;

public class Book {

    private String author;
    private String title;
    private int year;
    private int lengthBook;

    public Book(String title, String author, int year, int lengthBook) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.lengthBook = lengthBook;
    }

    public String getTitle() {
        return title;
    }

    public int getLengthBook() {
        return lengthBook;
    }

    public String toString() {
        return author + ", " + title + ", " + year;
    }
}