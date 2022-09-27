package com.startjava.lesson_2_3_4.bookshelf;

import java.util.Arrays;

public class Book {
    private String author;
    private String title;
    private int year;

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public String toString() {
        return getAuthor() + ", " + getTitle() + ", " + getYear();
    }
}
