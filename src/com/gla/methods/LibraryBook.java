
package com.gla.methods;

public class LibraryBook {

    private String title;
    private String author;
    private double price;
    private boolean available = true;

    public LibraryBook(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void borrow() {
        if (available) {
            available = false;
            System.out.println("Book Borrowed");
        } else {
            System.out.println("Not Available");
        }
    }

    public void display() {
        System.out.println(title + " " + author + " " + price + " " + available);
    }

    public static void main(String[] args) {

        LibraryBook b = new LibraryBook("Java", "James", 500);

        b.display();
        b.borrow();
        b.display();
    }
    
}
