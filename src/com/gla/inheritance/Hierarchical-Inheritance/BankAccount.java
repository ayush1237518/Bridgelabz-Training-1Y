
 package com.gla.inheritance;

class BankAccount {
    int accountNumber;
    double balance;

    BankAccount(int acc, double bal) {
        accountNumber = acc;
        balance = bal;
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(int acc, double bal, double rate) {
        super(acc, bal);
        interestRate = rate;
    }

    void displayAccountType() {
        System.out.println("Savings Account");
    }
}

class CheckingAccount extends BankAccount {
    double withdrawalLimit;

    CheckingAccount(int acc, double bal, double limit) {
        super(acc, bal);
        withdrawalLimit = limit;
    }

    void displayAccountType() {
        System.out.println("Checking Account");
    }
}
