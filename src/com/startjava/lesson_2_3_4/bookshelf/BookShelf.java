package com.startjava.lesson_2_3_4.bookshelf;

import java.util.Arrays;

public class BookShelf {

    private int cntBook;
    private int BOOK_SHELF_CAPACITY = 10;
    private Book[] books;
    private int maxLengthBook;

    public BookShelf() {
        books = new Book[BOOK_SHELF_CAPACITY];
    }

    public void addBook(Book book) {
        if(cntBook < BOOK_SHELF_CAPACITY) {
            books[cntBook] = book;
            cntBook++;
        } else {
            System.out.println("\nДобавить книгу невозможно, закончилось место на полке\n");
        }
        setMaxLengthBook(book);
    }

    public Book findBook(String title) {
        for (int i = 0; i < cntBook; i++) {
            if(books[i].getTitle().equals(title)) {
                return books[i];
            }
        }
        return null;
    }

    public void deleteBook(String title) {
        int indexBook = getBookIndex(title);
        if(indexBook >= 0) {
            System.arraycopy(books, indexBook + 1, books, indexBook, cntBook - (indexBook + 1));
            cntBook--;
        } else {
            System.out.println("\nКнига не найдена на полке\n");
        }
    }

    public int getFreeSpace() {
        return BOOK_SHELF_CAPACITY - cntBook;
    }

    public void clear() {
        Arrays.fill(books, null);
        cntBook = 0;
        System.out.println("\nПолка очищена\n");
    }

    public int getBookIndex(String title) {
        for (int i = 0; i < cntBook; i++) {
            if(books[i].getTitle().equals(title)) {
                return i;
            }
        }
//      в findBook при отстутствии книги возвращается null и он обрабатывается,
//      а в случае int, какое значение возвращать, если ничего не найдено?
        return -1;
    }

    public int getBookShelfSize() {
        return BOOK_SHELF_CAPACITY;
    }

    public int getCntBook() {
        return cntBook;
    }

    public Book[] getBooks() {
        return Arrays.copyOf(books, books.length);
    }

    public int getMaxLenthBook() {
        return maxLengthBook;
    }

    public void setMaxLengthBook(Book book) {
        if(book.getLengthBook() > maxLengthBook) {
            maxLengthBook = book.getLengthBook();
        }
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
        maxLengthBook = 57;
        cntBook = 10;
    }
}