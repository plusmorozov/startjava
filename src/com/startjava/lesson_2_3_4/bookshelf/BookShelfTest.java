package com.startjava.lesson_2_3_4.bookshelf;

import java.util.Scanner;

public class BookShelfTest {
    public static void main(String[] args) {
        boolean exit = false;
        BookShelf bookShelf = new BookShelf();
        do {
            System.out.println("""
                    1. Добавить книгу
                    2. Найти книгу
                    3. Удалить книгу
                    4. Вывести количество книг на полке
                    5. Вывести количество свободных мест
                    6. Вывести информацию обо всех книгах
                    7. Очистить полку
                    8. Завершить
                    """);
            System.out.print("Введите номер пунка меню: ");
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()) {
                case 1 -> bookShelf.addBook();
                case 2 -> bookShelf.findBookByTitle().toString();
//            case 3 ->
//            case 4 ->
//            case 5 ->
                case 6 -> bookShelf.showBooks();
                case 7 -> bookShelf.clear();
                case 8 -> exit = true;
            }
        } while (!exit);


    }
}