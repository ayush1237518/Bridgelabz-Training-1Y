package com.gla;

import java.util.ArrayList;
import java.util.List;

public class LibraryService {

    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public boolean issueBook(Book book) {
        if (books.contains(book)) {
            System.out.println("Issued: " + book.getTitle());
            return true;
        }
        return false;
    }

    public void returnBook(Book book) {
        System.out.println("Returned: " + book.getTitle());
    }
}
