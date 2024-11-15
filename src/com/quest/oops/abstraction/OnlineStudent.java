package com.quest.oops.abstraction;

public class OnlineStudent extends Students {
    @Override
    public void attendclass() {
        System.out.println("Online student is attending class virtually.");
    }
    @Override
    public void submitassignment() {
        System.out.println("Online student submits assignment online.");
    }
}
