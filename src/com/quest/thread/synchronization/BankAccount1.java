package com.quest.thread.synchronization;


public class BankAccount1 {
    private double balance;


    public BankAccount1(double initialBalance) {
        this.balance = initialBalance;
    }


    public synchronized void deposit(double amount) {
        balance += amount;
        System.out.println(Thread.currentThread().getName() + " deposited: $" + amount + " | Balance: $" + balance);
    }


    public synchronized void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " withdrew: $" + amount + " | Balance: $" + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + " withdrawal failed due to insufficient balance.");
        }
    }
}

