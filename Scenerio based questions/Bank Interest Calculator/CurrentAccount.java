
package com.gla;
class CurrentAccount extends Account {

    CurrentAccount(int accountNumber, double balance) {
        super(accountNumber, balance);
    }

    double calculateInterest() {
        return balance * 0.02;
    }
}
