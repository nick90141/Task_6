package com.itvdn.jdbcandhibernate.ex_003_hibernate_get_and_insert;

import com.itvdn.jdbcandhibernate.ex_003_hibernate_get_and_insert.entity.Book;

public class Main {

    public static void main(String[] args) {
        BookHelper bookHelper = new BookHelper();
        Book book = bookHelper.getBookById(2L);
        System.out.println(book);


        Book newBook = new Book();
        newBook.setName("New Book");
        newBook.setAuthor_id(1L);
        bookHelper.addBook(newBook);
    }
}
