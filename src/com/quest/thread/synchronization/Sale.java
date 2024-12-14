package com.quest.thread.synchronization;

import java.io.*;
public class Sale {
    private int transactionId;
    private String customerName;
    private String customerContact;
    private Vehicle vehicleSold;
    private int quantity;
    private double totalAmount;

    public Sale(String customerName, String customerContact, Vehicle vehicleSold, int quantity) {
        this.customerName = customerName;
        this.customerContact = customerContact;
        this.vehicleSold = vehicleSold;
        this.quantity = quantity;
        this.totalAmount = vehicleSold.getPrice() * quantity;
    }
    public void generateReceipt() {
        String receiptFilename = "Receipt_" + transactionId + ".txt";
        try (PrintWriter writer = new PrintWriter(receiptFilename)) {
            writer.println("Transaction ID: " + transactionId);
            writer.println("Customer Name: " + customerName);
            writer.println("Customer Contact: " + customerContact);
            writer.println("Vehicle Sold: " + vehicleSold.getMake() + " " + vehicleSold.getModel());
            writer.println("Quantity: " + quantity);
            writer.println("Total Amount: $" + totalAmount);
            System.out.println("Receipt generated: " + receiptFilename);
        } catch (Exception e) {
            System.out.println("Error generating receipt: " + e.getMessage());
        }
    }
    public int getTransactionId() {
        return transactionId;
    }
    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }
    public String getCustomerName() {
        return customerName;
    }

    public String getTotalAmount() {
        return "$" + totalAmount;
    }
}