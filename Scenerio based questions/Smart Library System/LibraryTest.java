
package com.gla;
public class LibraryTest {

    public static void main(String[] args) {

        Book b1 = new TextBook(101, "Java Programming", 500);
        Book b2 = new Magazine(102, "Tech Today", 200);

        System.out.println("Fine for TextBook: " + b1.calculateFine(3));
        System.out.println("Fine for Magazine: " + b2.calculateFine(3));
    }
}
