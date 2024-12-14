package com.quest.thread.synchronization;


public class MainBank {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000.0);

        Thread depositThread1 = new Thread(() -> account.deposit(200), "DepositThread-1");
        Thread depositThread2 = new Thread(() -> account.deposit(300), "DepositThread-2");

        Thread withdrawThread1 = new Thread(() -> account.withdraw(500), "WithdrawThread-1");
        Thread withdrawThread2 = new Thread(() -> account.withdraw(800), "WithdrawThread-2");

        depositThread1.start();
        depositThread2.start();
        withdrawThread1.start();
        withdrawThread2.start();

        try {
            depositThread1.join();
            depositThread2.join();
            withdrawThread1.join();
            withdrawThread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("All transactions completed.");
    }
}

