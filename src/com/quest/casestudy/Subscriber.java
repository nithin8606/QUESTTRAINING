package com.quest.casestudy;

import java.io.Serializable;

public class Subscriber implements Serializable {
    private String id;
    private String name;
    private String phoneNumber;
    private String planType;
    private double balance;

    public Subscriber(String id, String name, String phoneNumber, String planType, double balance) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.planType = planType;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getPlanType() {
        return planType;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Phone: " + phoneNumber + ", Plan: " + planType + ", Balance: ₹" + balance;
    }
}


