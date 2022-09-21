package com.startjava.lesson_2_3_4.bookshelf;

public class Book {
    private String author;
    private String title;
    private int year;

//    Book(String author,String title, int year){
//        setAuthor(author);
//        setTitle(title);
//        setYear(year);
//    }

    public Book(String author, String title, int year) {
        this.author = author;
        this.title = title;
        this.year = year;
    }

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
}
