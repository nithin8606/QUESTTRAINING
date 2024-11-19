package com.quest.oops.encapsulation;

public class Deposit extends Transaction {

    public Deposit(double amount) {
        super(amount);
    }

    @Override
    public void process(Account account) {
        System.out.println("Deposit of " + amount + " processed.");
        System.out.println("New Balance: " + account.getBalance());
    }
}

