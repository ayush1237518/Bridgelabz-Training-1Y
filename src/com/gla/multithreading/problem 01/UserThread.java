
package com.gla.multithreading;

public class UserThread implements Runnable {
    private BankAccount account;
    private String userType;

    public UserThread(BankAccount account, String userType) {
        this.account = account;
        this.userType = userType;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            account.checkBalance(userType);
            System.out.println("Priority: " + Thread.currentThread().getPriority());

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
