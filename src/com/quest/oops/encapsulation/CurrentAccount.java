package com.quest.oops.encapsulation;
public class CurrentAccount extends Account {

    public CurrentAccount(String accountNumber, String accountHolderName, double balance) {
        super(accountNumber, accountHolderName, balance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        Transaction transaction = new Deposit(amount);
        transaction.process(this);
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            Transaction transaction = new Withdraw(amount);
            transaction.process(this);
        } else {
            System.out.println("Insufficient funds!");
        }
    }
}

