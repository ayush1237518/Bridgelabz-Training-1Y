
package com.gla.methods;

public class MovieTicket {

    String movieName;
    int seatNumber;
    double price;

    void bookTicket(String name, int seat, double p) {
        movieName = name;
        seatNumber = seat;
        price = p;
    }

    void display() {
        System.out.println("Movie: " + movieName);
        System.out.println("Seat: " + seatNumber);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {

        MovieTicket t = new MovieTicket();

        t.bookTicket("Avengers", 15, 250);
        t.display();
    }
}
