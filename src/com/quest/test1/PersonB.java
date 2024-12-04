package com.quest.test1;

public class PersonB extends Thread {
    private final Object phone1;
    private final Object phone2;

    public PersonB(Object phone1, Object phone2) {
        this.phone1 = phone1;
        this.phone2 = phone2;
    }

    @Override
    public void run() {
        synchronized (phone2) {
            System.out.println("Person B: Holding Phone 2...");

            try { Thread.sleep(100); } catch (InterruptedException e) {}

            System.out.println("Person B: Waiting for Phone 1...");
            synchronized (phone1) {
                System.out.println("Person B: Using Phone 1!");
            }
        }
    }
}

