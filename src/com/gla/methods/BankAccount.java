
package com.gla.methods;

public class BankAccount {

    String accountHolder;
    int accountNumber;
    double balance;

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    void displayBalance() {
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {

        BankAccount acc = new BankAccount();

        acc.accountHolder = "Aman";
        acc.accountNumber = 101;
        acc.balance = 5000;

        acc.deposit(2000);
        acc.withdraw(1000);
        acc.displayBalance();
    }
}
