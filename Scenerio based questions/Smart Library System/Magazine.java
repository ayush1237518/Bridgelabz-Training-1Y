
package com.gla;
class Magazine extends Book {

    Magazine(int bookId, String title, double price) {
        super(bookId, title, price);
    }

    double calculateFine(int daysLate) {
        return daysLate * 5;
    }
}
