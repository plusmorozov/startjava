package com.startjava.lesson_2_3_4.bookshelf;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BookShelfTest {

    public static void main(String[] args) {
        boolean exit = false;
        BookShelf bookShelf = new BookShelf();
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("\nСостояние полки в данный момент:");
            printBookShelf();
            System.out.println("""
                    1. Добавить книгу
                    2. Найти книгу
                    3. Удалить книгу
                    4. Вывести количество книг на полке
                    5. Вывести количество свободных мест
                    6. Очистить полку
                    7. Завершить
                    _____________________________________
                    0. Заполнить полку тестовыми данными
                    """);
            System.out.println();
            System.out.print("Введите номер пункта меню: ");
                switch (scanner.nextInt()) {
                    case 1 -> {
                        try {
                            bookShelf.addBook();
                        } catch(InputMismatchException e) {
                        System.out.println("Введите корректное значение года");
                        }
                    }
                    case 2 -> {
                        System.out.print("Введите название книги: ");
                        scanner.nextLine();
                        Book book = bookShelf.findBookByTitle(scanner.nextLine());
                        if(book == null) {
                            System.out.println("\nКнига не найдена\n");
                        } else {
                            printLine(book.toString().length());
                            printBook(bookShelf.getBookIndex(book), 0);
                            printLine(book.toString().length());
                        }
                    }
                    case 3 -> {
                        System.out.print("Введите название книги: ");
                        scanner.nextLine();
                        bookShelf.deleteBook(scanner.nextLine());
                    }
                    case 4 -> System.out.println("\nКоличество книг на полке: " + bookShelf.numberBooks() + "\n");
                    case 5 -> System.out.println("\nСвободных мест на полке: " + bookShelf.freeSpaceShelf() + "\n");
                    case 6 -> bookShelf.clear();
                    case 7 -> exit = true;
                    case 0 -> bookShelf.testData();
                    default -> System.out.println("Выбран несуществующий пункт меню");
                }
        } while (!exit);
    }

    private static void printBookShelf() {
        int lenghBookShelf = 0;
        int cntBook = BookShelf.getCntBook();
        Book[] books = BookShelf.getBooks();
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
            while (i < BookShelf.getBookShelfSize() - cntBook) {
                printLine(lenghBookShelf);
                i++;
            }
            System.out.println();
        }
    }

    public static void printBook(int idBook, int numSpace) {
        Book[] books = BookShelf.getBooks();
        System.out.print("|" + books[idBook].toString());
        // вывод недостающих до максимальной длины строки пробелов
        for (int i = 0; i < numSpace; i++) {
            System.out.print(" ");
        }
        System.out.println("|");
    }

    public static void printLine(int lenghLine) {
        System.out.print("|");
        for (int i = 0; i < lenghLine; i++) {
            System.out.print("-");
        }
        System.out.println("|");
    }
}