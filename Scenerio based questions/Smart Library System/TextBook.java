
package com.gla;
class TextBook extends Book {

    TextBook(int bookId, String title, double price) {
        super(bookId, title, price);
    }

    double calculateFine(int daysLate) {
        return daysLate * 2;
    }
}
