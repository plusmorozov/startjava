package com.startjava.lesson_2_3_4.bookshelf;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BookShelfTest {

    public static void main(String[] args) {
        boolean exit = false;
        BookShelf bookShelf = new BookShelf();
        do {
            System.out.println("Состояние полки в данный момент:");
            bookShelf.printBookShelf();
            System.out.println("""
                    1. Добавить книгу
                    2. Найти книгу
                    3. Удалить книгу
                    4. Вывести количество книг на полке
                    5. Вывести количество свободных мест
                    6. Вывести информацию обо всех книгах
                    7. Очистить полку
                    8. Завершить
                    _____________________________________
                    0. Заполнить полку тестовыми данными
                   
                    """);
            System.out.print("Введите номер пункта меню: ");
            Scanner scanner = new Scanner(System.in);
            try {
                switch (scanner.nextInt()) {
                    case 1 -> bookShelf.addBook();
                    case 2 -> {
                        Book book = bookShelf.findBookByTitle();
                        if(book == null) {
                            System.out.println("\nКнига не найдена\n");
                        } else {
                            bookShelf.printLine(book.toString().length());
                            bookShelf.printBook(bookShelf.getBookIndex(book), 0);
                            bookShelf.printLine(book.toString().length());
                        }
                    }
                    case 3 -> bookShelf.deleteBook();
                    case 4 -> System.out.println("\nКоличество книг на полке: " + bookShelf.numberBooks() + "\n");
                    case 5 -> System.out.println("\nСвободных мест на полке: " + bookShelf.freeSpaceShelf() + "\n");
                    case 6 -> bookShelf.printBookShelf();
                    case 7 -> bookShelf.clear();
                    case 8 -> exit = true;
                    case 0 -> bookShelf.testData();
                    default -> System.out.println("Выбран несуществующий пункт меню");
                }
            } catch(InputMismatchException e) {
                System.out.println("!!! Введите корректное значение года !!!");
            }
        } while (!exit);
    }
}