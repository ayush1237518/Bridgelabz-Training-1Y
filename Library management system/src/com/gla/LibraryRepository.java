package com.gla;

import com.gla.Book;
import java.util.ArrayList;
import java.util.List;

public class LibraryRepository {
    private final List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(int id) {
        books.removeIf(b -> b.getId() == id);
    }

    public List<Book> getBooks() {
        return books;
    }
    public Book getBookById(int id) {
        for (Book b : books) {
            if (b.getId() == id) {
                return b;
            }
        }
        return null;
    }
}
