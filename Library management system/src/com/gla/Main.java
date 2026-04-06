package com.gla;

public class Main {
    public static void main(String[] args) {

        LibraryService service = new LibraryService();

        Book book = new Book();
        book.setTitle("Java Basics");
        book.setCategory(Category.SCIENCE);

        service.addBook(book);
        service.issueBook(book);
        service.returnBook(book);
    }
}
