package com.quest.oops.abstraction;

public class RegularStudent extends Students {
    @Override
    public void attendclass() {
        System.out.println("Regular student is attending class in person.");
    }
    @Override
    public void submitassignment() {
        System.out.println("Regular student submits the assignment in class.");
    }
}
