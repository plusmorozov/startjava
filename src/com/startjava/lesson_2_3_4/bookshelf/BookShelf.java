package com.startjava.lesson_2_3_4.bookshelf;

import java.util.Arrays;

public class BookShelf {

    private static int cntBook;
    private static int bookShelfSize;
    private static Book[] books;

    public BookShelf() {
        cntBook = 0;
        bookShelfSize = 10;
        books = new Book[bookShelfSize];
    }

    public void addBook() {
        if(cntBook < bookShelfSize) {
            books[cntBook] = new Book();
            cntBook++;
        } else {
            System.out.println();
            System.out.println("Добавить книгу невозможно, закончилось место на полке");
            System.out.println();
        }
    }

    public Book findBookByTitle(String title) {
        Book current = null;
        for (int i = 0; i < cntBook; i++) {
            if(books[i].getTitle().equals(title)) {
                current = books[i];
                break;
            }
        }
        return current;
    }

    public void deleteBook (String title) {
        Book book = findBookByTitle(title);
        if (book != null) {
            int indexBook = getBookIndex(book);
            System.arraycopy(books, indexBook + 1, books, indexBook, cntBook - (indexBook + 1));
            cntBook--;
        } else {
            System.out.println("\nКнига не найдена на полке\n");
        }
    }

    public int numberBooks() {
        return cntBook;
    }

    public int freeSpaceShelf() {
        return bookShelfSize - cntBook;
    }

    public void clear() {
        Arrays.fill(books, null);
        cntBook = 0;
        System.out.println("\nПолка очищена\n");
    }

    public int getBookIndex (Book book) {
        return Arrays.asList(books).indexOf(book);
    }

    public static int getBookShelfSize() {
        return bookShelfSize;
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