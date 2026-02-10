
package com.gla.arrays;

import java.time.LocalDate;
import java.util.Scanner;

public class DateArithmetic {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String inputDate = sc.nextLine();

        LocalDate date = LocalDate.parse(inputDate);

        LocalDate result = date
                .plusDays(7)
                .plusMonths(1)
                .plusYears(2)
                .minusWeeks(3);

        System.out.println(result);
    }
}
