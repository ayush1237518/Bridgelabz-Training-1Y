
package com.gla;
class Account {

    int accountNumber;
    double balance;

    static String bankName = "National Bank";

    Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    double calculateInterest() {
        return 0;
    }
}
