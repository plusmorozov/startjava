package com.startjava.lesson_2_3_4.bookshelf;

import java.util.Arrays;

public class BookShelf {

    private static int cntBook;
    private static int BOOK_SHELF_SIZE = 10;
    private static Book[] books;

    public BookShelf() {
        books = new Book[BOOK_SHELF_SIZE];
    }

    public void addBook(Book book) {
        if(cntBook < BOOK_SHELF_SIZE) {
            books[cntBook] = book;
            cntBook++;
        } else {
            System.out.println("\nДобавить книгу невозможно, закончилось место на полке\n");
        }
    }

    public Book findBook(String title) {
        for (int i = 0; i < cntBook; i++) {
            if(books[i].getTitle().equals(title)) {
                return books[i];
            }
        }
        return null;
    }

    public void deleteBook(Book book) {
        if (book != null) {
            int indexBook = getBookIndex(book);
            System.arraycopy(books, indexBook + 1, books, indexBook, cntBook - (indexBook + 1));
            cntBook--;
        } else {
            System.out.println("\nКнига не найдена на полке\n");
        }
    }

    public int getFreeSpace() {
        return BOOK_SHELF_SIZE - cntBook;
    }

    public void clear() {
        Arrays.fill(books, null);
        cntBook = 0;
        System.out.println("\nПолка очищена\n");
    }

    public int getBookIndex(Book book) {
        return Arrays.asList(books).indexOf(book);
    }

    public static int getBookShelfSize() {
        return BOOK_SHELF_SIZE;
    }

    public static int getCntBook() {
        return cntBook;
    }

    public static Book[] getBooks() {
        return Arrays.copyOf(books, books.length);
    }

    public void testData() {
        books[0] = new Book("Мастер и Маргарита", "Булгаков М.", 2013);
        books[1] = new Book("Зеленая миля", "Стивен Кинг", 2014);
        books[2] = new Book("Шерлок Холмс", "Артур Конан Дойл", 2019);
        books[3] = new Book("Прислуга", "Кэтрин Стокетт", 2011);
        books[4] = new Book("Граф Монте-Кристо", "Александр Дюма", 2017);
        books[5] = new Book("Крестный отец", "Марио Пьюзо", 2002);
        books[6] = new Book("О всех созданиях - больших и малых", "Джеймс Хэрриорт", 2012);
        books[7] = new Book("Двенадцать стульев", "Илья Ильф, Евгений Петров", 2018);
        books[8] = new Book("Отверженные", "Виктор Гюго", 2020);
        books[9] = new Book("Алмазная колесница", "Борис Акунин", 2016);
        cntBook = 10;
    }
}