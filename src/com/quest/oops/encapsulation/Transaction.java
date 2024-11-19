package com.quest.oops.encapsulation;
public abstract class Transaction {
    protected double amount;

    public Transaction(double amount) {
        this.amount = amount;
    }

    public abstract void process(Account account);
}
