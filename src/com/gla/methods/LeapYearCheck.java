
package com.gla.methods;

import java.util.Scanner;

public class LeapYearCheck {

    public static boolean isLeapYear(int year) {
        if (year < 1582) return false;
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();

        if (year < 1582) {
            System.out.println("Year should be >= 1582");
        } else if (isLeapYear(year)) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not a Leap Year");
        }

    }

}
