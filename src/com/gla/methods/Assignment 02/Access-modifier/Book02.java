
package com.gla.methods;

public class Book02 {

    private String title;
    private String author;
    private double price;

    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0;
    }

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void display() {
        System.out.println(title + " " + author + " " + price);
    }

    public static void main(String[] args) {

        Book b1 = new Book();
        Book b2 = new Book("Java", "James", 500);

        b1.display();
        b2.display();
    }
    
}
