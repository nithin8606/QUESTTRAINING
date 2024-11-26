package com.quest.oops.exceptionhandling;

public class InventoryService {


    public void displayBooksPricedAbove(Book[] books, double price) {
        System.out.println("\nBooks priced above $" + price + ":");


        int bookCount=1;
        for (int i = 0; i < bookCount; i++) {

            if (books[i].getPrice() > price) {
                System.out.println("Title: " + books[i].getTitle() + ", Price: $" + books[i].getPrice());
            }
        }
    }
}
