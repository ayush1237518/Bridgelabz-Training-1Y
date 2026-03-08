
package com.gla;
public class BankTest {

    public static void main(String[] args) {

        Account a1 = new SavingsAccount(1001, 10000);
        Account a2 = new CurrentAccount(1002, 10000);

        System.out.println("Savings Interest: " + a1.calculateInterest());
        System.out.println("Current Interest: " + a2.calculateInterest());
    }
}
