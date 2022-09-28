package com.startjava.lesson_2_3_4.bookshelf;

import java.util.Arrays;
import java.util.Scanner;

public class BookShelf {

    private int cntBook;
    private int bookShelfSize = 10;
    Book[] books = new Book[bookShelfSize];
    private Scanner scanner = new Scanner(System.in);

    public void addBook() {
        if(cntBook < bookShelfSize) {
            books[cntBook] = new Book();
//            System.out.print("Введите название книги: ");
//            books[cntBook].setTitle(scanner.nextLine());
//            System.out.print("Введите автора книги: ");
//            books[cntBook].setAuthor(scanner.nextLine());
//            System.out.print("Введите год издания книги: ");
//            books[cntBook].setYear(scanner.nextInt());

            cntBook++;
        } else {
            System.out.println();
            System.out.println("Добавить книгу невозможно, закончилось место на полке");
            System.out.println();
        }
    }

    public Book findBookByTitle() {
        System.out.print("Введите название книги: ");
        String title = scanner.nextLine();
        Book current = null;
        for (int i = 0; i < cntBook; i++) {
            if(books[i].getTitle().equals(title)) {
                current = books[i];
                break;
            }
        }
        return current;
    }

    public void deleteBook () {
        Book book = findBookByTitle();
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

    public void printBookShelf() {
        int lenghBookShelf = 0;
        if(cntBook == 0) {
            System.out.println("\nПолка пуста\n");
        } else {
            // вычисление максимальной длины полки
            for (int i = 0; i < cntBook; i ++) {
                int lenghBook = books[i].toString().length();
                if(lenghBook > lenghBookShelf) {
                    lenghBookShelf = lenghBook;
                }
            }
            System.out.println();
            // вывод книг
            for (int i = 0; i < cntBook; i ++) {
                printBook(i,lenghBookShelf - books[i].toString().length());
                printLine(lenghBookShelf);
            }
            int i = 0;
            // вывод пустых ячеек
            while (i < bookShelfSize - cntBook) {
                printLine(lenghBookShelf);
                i++;
            }
            System.out.println();
        }
    }

    public void clear() {
        Arrays.fill(books, null);
        cntBook = 0;
        System.out.println("\nПолка очищена\n");
    }

    public void printBook(int idBook, int numSpace) {
        System.out.print("|" + books[idBook].toString());
        // вывод недостающих до максимальной длины строки пробелов
        for (int i = 0; i < numSpace; i++) {
            System.out.print(" ");
        }
        System.out.println("|");
    }

    public void printLine (int lenghLine) {
        System.out.print("|");
        for (int i = 0; i < lenghLine; i++) {
            System.out.print("-");
        }
        System.out.println("|");
    }

    public int getBookIndex (Book book) {
        return Arrays.asList(books).indexOf(book);
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