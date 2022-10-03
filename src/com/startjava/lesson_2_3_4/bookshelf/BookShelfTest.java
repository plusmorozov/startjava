package com.startjava.lesson_2_3_4.bookshelf;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BookShelfTest {

    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf();
        Scanner scanner = new Scanner(System.in);
        int selection;
        do {
            printBookShelf(bookShelf);
            printMenu();
            selection = selectionHanding(bookShelf, scanner.nextInt());
        } while (selection != 7);
    }

    private static void printBookShelf(BookShelf bookShelf) {
        int cntBook = bookShelf.getCntBook();
        if(cntBook == 0) {
            System.out.println("\nПолка пуста\n");
        } else {
            int lenghBookShelf = bookShelf.getMaxLenthBook();
            Book[] books = bookShelf.getBooks();
            System.out.println();
            // вывод книг
            for (int i = 0; i < cntBook; i++) {
                int numSpace = lenghBookShelf - books[i].toString().length();
                printBook(bookShelf, i, numSpace);
                printLine(lenghBookShelf);
            }
            int i = 0;
            // вывод пустых ячеек
            while (i < bookShelf.getBookShelfSize() - cntBook) {
                printLine(lenghBookShelf);
                i++;
            }
            System.out.println();
        }
    }

    private static void printMenu() {
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
                    Введите номер пункта меню:
                    """);
    }

    private static int selectionHanding(BookShelf bookShelf, int selection) {
        Scanner scanner = new Scanner(System.in);
        switch (selection) {
            case 1 -> {
                    System.out.print("Введите название книги: ");
                    String title = scanner.nextLine();
                    System.out.print("Введите автора книги: ");
                    String author = scanner.nextLine();
                    System.out.print("Введите год издания книги: ");
                try {
                    int year = scanner.nextInt();
                    bookShelf.addBook(new Book(title, author, year));
                } catch(InputMismatchException e) {
                    System.out.println("Введите корректное значение года");
                }
            }
            case 2 -> {
                System.out.print("Введите название книги: ");
                String title = scanner.nextLine();
                Book book = bookShelf.findBook(title);
                if(book == null) {
                    System.out.println("\nКнига не найдена\n");
                } else {
                    printLine(book.toString().length());
                    printBook(bookShelf, bookShelf.getBookIndex(title), 0);
                    printLine(book.toString().length());
                }
            }
            case 3 -> {
                System.out.print("Введите название книги: ");
                bookShelf.deleteBook(scanner.nextLine());
            }
            case 4 -> System.out.println("\nКоличество книг на полке: " + bookShelf.getCntBook() + "\n");
            case 5 -> System.out.println("\nСвободных мест на полке: " + bookShelf.getFreeSpace() + "\n");
            case 6 -> bookShelf.clear();
            case 7 -> System.out.println("Программа завершает работу");
            case 0 -> bookShelf.testData();
            default -> System.out.println("Выбран несуществующий пункт меню");
        }
        return selection;
    }

    private static void printBook(BookShelf bookShelf, int idBook, int numSpace) {
        Book[] books = bookShelf.getBooks();
        System.out.print("|" + books[idBook]);
        // вывод недостающих до максимальной длины строки пробелов
        for (int i = 0; i < numSpace; i++) {
            System.out.print(" ");
        }
        System.out.println("|");
    }

    private static void printLine(int lenghLine) {
        System.out.print("|");
        for (int i = 0; i < lenghLine; i++) {
            System.out.print("-");
        }
        System.out.println("|");
    }
}