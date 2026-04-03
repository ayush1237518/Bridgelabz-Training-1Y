
package com.gla.wrapper-classes;

public class BankLimit {

    public static double remainingLimit(Double limit) {
        if (limit == null) {
            return 0.0;
        }
        return limit;
    }

    public static void main(String[] args) {
        System.out.println(remainingLimit(5000.0));
        System.out.println(remainingLimit(null));
    }
}
