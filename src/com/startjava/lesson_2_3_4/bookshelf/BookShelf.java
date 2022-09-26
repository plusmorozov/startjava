package com.startjava.lesson_2_3_4.bookshelf;

import java.util.Arrays;
import java.util.Scanner;

public class BookShelf {
    private int cntBook;
    private int bookShelfSize = 10;
    Book[] books = new Book[bookShelfSize];
    private Scanner scanner = new Scanner(System.in);

//    public BookShelf(int bookShelfSize) {
//        this.bookShelfSize = bookShelfSize;
//    }

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
//            books[cnt_book] = new Book();
//            System.out.print("Введите название книги: ");
//            books[cnt_book].setTitle(scanner.nextLine());
//            System.out.print("Введите автора книги: ");
//            books[cnt_book].setAuthor(scanner.nextLine());
//            System.out.print("Введите год издания книги: ");
//            books[cnt_book].setYear(scanner.nextInt());
//            cnt_book++;
//            Ввод тестовых данных
//          _____________________________________
            books[0] = new Book();
            books[0].setTitle("Книга");
            books[0].setAuthor("Автор №1");
            books[0].setYear(2022);

            books[1] = new Book();
            books[1].setTitle("Книга      №1");
            books[1].setAuthor("Автор     №1");
            books[1].setYear(2022);

            cntBook = 2;
//          _____________________________________


        } else {
            System.out.println("Книга не добавлена. Закончилось место на полке");
        }
    }

    public Book findBookByTitle() {
        Book current = null;
        System.out.print("Введите название книги: ");
        for (Book book : books) {
            if(book.getTitle() == scanner.nextLine()) {
                current = book;
                break;
            } else {
                System.out.println("Книгу не удалось найти");
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

    public void showBooks() {
        int lenghBookShelf = 0;
        for (int i = 0; i < cntBook; i ++) {
            lenghBookShelf = books[i].toString().length() > lenghBookShelf ? books[i].toString().length() : lenghBookShelf ;
        }
        for (int i = 0; i < cntBook; i ++) {
            System.out.print("|" + books[i].toString());
            // вывод недостающих до максимальной длины строки пробелов
            for (int j = 0; j < lenghBookShelf - books[i].toString().length(); j++) {
                System.out.print(" ");
            }
            System.out.println("|");
            // вывод разделителя между книгами
            System.out.print("|");
            for (int j = 0; j < lenghBookShelf; j++) {
                System.out.print("-");
            }
            System.out.println("|");
        }
    }

    public void clear() {
        Arrays.fill(books, null);
        cntBook = 0;
    }



}
