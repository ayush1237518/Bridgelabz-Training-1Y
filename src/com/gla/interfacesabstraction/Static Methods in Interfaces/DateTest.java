
package com.gla.interfaces-abstraction;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

interface DateUtils {

    static String formatDate(LocalDate date, String pattern) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return date.format(formatter);
    }
}
public class DateTest {
    public static void main(String[] args) {

        System.out.println(DateUtils.formatDate(LocalDate.now(), "dd-MM-yyyy"));
        System.out.println(DateUtils.formatDate(LocalDate.now(), "yyyy/MM/dd"));
    }

}
