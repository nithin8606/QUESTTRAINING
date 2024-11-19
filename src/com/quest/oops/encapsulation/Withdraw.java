package com.quest.oops.encapsulation;
public class Withdraw extends Transaction {

    public Withdraw(double amount) {
        super(amount);
    }

    @Override
    public void process(Account account) {
        System.out.println("Withdrawal of " + amount + " processed.");
        System.out.println("New Balance: " + account.getBalance());
    }
}

