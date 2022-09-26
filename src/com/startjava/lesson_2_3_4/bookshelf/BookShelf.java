package com.startjava.lesson_2_3_4.bookshelf;

import java.util.Arrays;
import java.util.Scanner;

public class BookShelf {
    private int cntBook;
    private int bookShelfSize = 10;
    Book[] books = new Book[bookShelfSize];
    private Scanner scanner = new Scanner(System.in);

    /*
        добавить книгу
        найти книгу
        удалить книгу
        получить все книги (только для визуализации полки)
        получить количество книг на полке
        получить количество свободного места
        очистить полку
     */

    public void addBook() {
        if(cntBook < bookShelfSize) {
//            books[cntBook] = new Book();
//            System.out.print("Введите название книги: ");
//            books[cntBook].setTitle(scanner.nextLine());
//            System.out.print("Введите автора книги: ");
//            books[cntBook].setAuthor(scanner.nextLine());
//            System.out.print("Введите год издания книги: ");
//            books[cntBook].setYear(scanner.nextInt());
//            cnt_book++;
//            books[cntBook].setId(cntBook);
//            Ввод тестовых данных
//          _____________________________________
            books[0] = new Book();
            books[0].setId(0);
            books[0].setTitle("Книга");
            books[0].setAuthor("Автор                     №1");
            books[0].setYear(2022);

            books[1] = new Book();
            books[1].setId(1);
            books[1].setTitle("Книга2");
            books[1].setAuthor("Автор     №1");
            books[1].setYear(2022);

            cntBook = 2;
//          _____________________________________
        } else {
            System.out.println("Книга не добавлена. Закончилось место на полке");
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
        findBookByTitle();

        /*Book current = null;
        for (Book book : books) {
            if(book.getTitle() == title) {
                // удалить книгу
                break;
            }
        }*/
    }

//    public void showBooks() {
//        int lenghBookShelf = 0;
//        for (int i = 0; i < cntBook; i ++) {
//            lenghBookShelf = books[i].toString().length() > lenghBookShelf ? books[i].toString().length() : lenghBookShelf ;
//        }
//        System.out.println();
//        for (int i = 0; i < cntBook; i ++) {
//            System.out.print("|" + books[i].toString());
//            // вывод недостающих до максимальной длины строки пробелов
//            for (int j = 0; j < lenghBookShelf - books[i].toString().length(); j++) {
//                System.out.print(" ");
//            }
//            System.out.println("|");
//            // вывод разделителя между книгами
//            System.out.print("|");
//            for (int j = 0; j < lenghBookShelf; j++) {
//                System.out.print("-");
//            }
//            System.out.println("|");
//        }
//        System.out.println();
//    }

    public void printBookShelf() {
        int lenghBookShelf = 0;
        if(cntBook == 0) {
            System.out.println("\nПолка пуста\n");
        } else {
            for (int i = 0; i < cntBook; i ++) {
                lenghBookShelf = books[i].toString().length() > lenghBookShelf ? books[i].toString().length() : lenghBookShelf ;
            }
            System.out.println();
            for (int i = 0; i < cntBook; i ++) {
                printBook(i,lenghBookShelf - books[i].toString().length());
                printLine(lenghBookShelf);
            }
            int i = 0;
            while (i < bookShelfSize - cntBook) {
                printLine(lenghBookShelf);
                i++;
            }
            System.out.println();
        }
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

    public void clear() {
        Arrays.fill(books, null);
        cntBook = 0;
        System.out.println("\nПолка очищена\n");
    }
    public int numberBooks() {
        return cntBook;
    }

    public int freeSpaceShelf() {
        return bookShelfSize - cntBook;
    }
}
