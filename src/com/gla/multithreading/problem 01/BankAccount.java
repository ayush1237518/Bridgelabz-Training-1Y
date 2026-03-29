
package com.gla.multithreading;

public class BankAccount {
    private String accountHolder;

    public BankAccount(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void checkBalance(String userType) {
        System.out.println(userType + " user (" + accountHolder + ") is checking balance...");
    }
}
