package com.quest.oops.exceptionhandling;

import com.quest.oops.test.Book;

public class SpecialEditionBook extends Book {
    private String specialFeature;

    public SpecialEditionBook(String title, String author, double price, int stock, String specialFeature) {
        super(title, author, price, stock);
        this.specialFeature = specialFeature;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Special Feature: " + specialFeature);
    }
}

