package com.quest.oops.exceptionhandling;

public class Book {
    private String title;
    private String author;
    private double price;
    private int stock;

    public static final double DISCOUNT_PERCENTAGE = 10.0;

    public Book(String title, String author, double price, int stock) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.stock = stock;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public void purchase(int quantity) throws OutOfStockException {
        if (stock < quantity) {
            throw new OutOfStockException("Not enough stock for book: " + title);
        }
        stock -= quantity;
        System.out.println("Purchased " + quantity + " copy/copies of " + title + ". Remaining stock: " + stock);
    }

    public void displayInfo() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: $" + price + ", Stock: " + stock);
    }

    public String getAuthor() {
        return author;
    }
}

