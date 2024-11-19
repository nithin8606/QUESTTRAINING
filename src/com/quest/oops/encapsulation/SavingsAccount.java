package com.quest.oops.encapsulation;
public class SavingsAccount extends Account {

    private static final double MINIMUM_BALANCE = 1000.0;

    public SavingsAccount(String accountNumber, String accountHolderName, double balance) {
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
        if (balance - amount >= MINIMUM_BALANCE) {
            balance -= amount;
            Transaction transaction = new Withdraw(amount);
            transaction.process(this);
        } else {
            System.out.println("Insufficient funds! Minimum balance required: " + MINIMUM_BALANCE);
        }
    }
}
