package com.gla;

import java.util.Scanner;

public class LibraryService {

    private final LibraryRepository libraryRepository = new LibraryRepository();

    public void addBook(Scanner sc) {
        System.out.print("Enter Book ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Book Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Author Name: ");
        String author = sc.nextLine();

        libraryRepository.addBook(new Book(id, name, author));
        System.out.println("Book Added!");
    }

    public void removeBook(Scanner sc) {
        System.out.print("Enter Book ID to remove: ");
        int id = sc.nextInt();

        libraryRepository.removeBook(id);
        System.out.println("Book Removed!");
    }

    public void viewBooks() {
        for (Book b : libraryRepository.getBooks()) {
            b.display();
        }
    }

    public void searchBook(Scanner sc) {
        sc.nextLine();
        System.out.print("Enter book name to search: ");
        String name = sc.nextLine();

        boolean found = false;

        for (Book b : libraryRepository.getBooks()) {
            if (b.toString().toLowerCase().contains(name.toLowerCase())) {
                b.display();
                found = true;
            }
        }

        if (!found) {
            System.out.println("Book not found!");
        }
    }

    //  RENT BOOK
    public void rentBook(Scanner sc) {
        System.out.print("Enter Book ID to Rent: ");
        int id = sc.nextInt();

        Book book = libraryRepository.getBookById(id);

        if (book == null) {
            System.out.println("Book not found!");
            return;
        }

        if (book.isIssued()) {
            System.out.println("Book is already issued!");
        } else {
            book.setIssued(true);
            System.out.println("Book rented successfully!");
        }
    }

    //  RETURN BOOK
    public void returnBook(Scanner sc) {
        System.out.print("Enter Book ID to Return: ");
        int id = sc.nextInt();

        Book book = libraryRepository.getBookById(id);

        if (book == null) {
            System.out.println("Book not found!");
            return;
        }

        if (!book.isIssued()) {
            System.out.println("Book was not issued!");
        } else {
            book.setIssued(false);
            System.out.println("Book returned successfully!");
        }
    }
}