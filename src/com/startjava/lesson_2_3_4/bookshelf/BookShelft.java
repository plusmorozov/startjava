package com.startjava.lesson_2_3_4.bookshelf;

public class BookShelft {
    private int CNT_BOOKS;
    static Book[] books = new Book[10];

    /*
        добавить книгу
        найти книгу
        удалить книгу
        получить все книги (только для визуализации полки)
        получить количество книг на полке
        получить количество свободного места
        очистить полку
     */

    public static void addBook(String author, String title, int year) {
        books[0].setAuthor(author);
        books[0].setTitle(title);
        books[0].setYear(year);
    }

    public static Book findBookById(int id) {
        Book current = null;
        for (Book book : books) {
            if(book.getId() == id) {
                current = book;
                break;
            }
        }
        return current;
    }

}
