package com.quest.oops.abstraction;

public class OfflineStudent extends Students {
    @Override
    public void attendclass() {
        System.out.println("Offline student is attending class in a physical classroom.");
    }
    @Override
    public void submitassignment() {
        System.out.println("Offline student submits assignment in person.");
    }
}
