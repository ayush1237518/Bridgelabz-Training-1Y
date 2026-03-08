
package com.gla;
class SavingsAccount extends Account {

    SavingsAccount(int accountNumber, double balance) {
        super(accountNumber, balance);
    }

    double calculateInterest() {
        return balance * 0.04;
    }
}
