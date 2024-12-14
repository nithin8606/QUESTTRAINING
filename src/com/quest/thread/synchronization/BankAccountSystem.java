package com.quest.thread.synchronization;

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Synchronized method to deposit money
    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.println(Thread.currentThread().getName() + " deposited: " + amount);
        System.out.println("Current balance: " + balance);
    }

    // Synchronized method to withdraw money
    public synchronized void withdraw(int amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " withdrew: " + amount);
        } else {
            System.out.println(Thread.currentThread().getName() + " withdrawal failed due to insufficient balance.");
        }
        System.out.println("Current balance: " + balance);
    }
}

public class BankAccountSystem {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(100);

        
        Thread t1 = new Thread(() -> account.deposit(100), "Thread-1");
        Thread t2 = new Thread(() -> account.withdraw(50), "Thread-2");
        Thread t3 = new Thread(() -> account.withdraw(200), "Thread-3");

        t1.start();
        t2.start();
        t3.start();
    }
}

