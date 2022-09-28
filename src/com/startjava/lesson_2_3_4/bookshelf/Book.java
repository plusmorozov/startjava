package com.startjava.lesson_2_3_4.bookshelf;

import java.util.Arrays;
import java.util.Scanner;

public class Book {

    private String author;
    private String title;
    private int year;
    private Scanner scanner = new Scanner(System.in);

    public Book() {
        System.out.print("Введите название книги: ");
        title = scanner.nextLine();
        System.out.print("Введите автора книги: ");
        author = scanner.nextLine();
        System.out.print("Введите год издания книги: ");
        year = scanner.nextInt();
    }

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
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

    public String toString() {
        return author + ", " + title + ", " + year;
    }
}