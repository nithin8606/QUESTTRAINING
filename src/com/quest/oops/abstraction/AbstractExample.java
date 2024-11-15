package com.quest.oops.abstraction;

public class AbstractExample {

    public static void main(String[] args) {

        Students online = new OnlineStudent();
        Students offline = new OfflineStudent();
        Students regular = new RegularStudent();
        System.out.println("Online Student:");
        online.attendclass();
        online.submitassignment();
        online.study();
        System.out.println("\nOffline Student:");
        offline.attendclass();
        offline.submitassignment();
        offline.study();
        System.out.println("\nRegular Student:");
        regular.attendclass();
        regular.submitassignment();
        regular.study();
    }
}
