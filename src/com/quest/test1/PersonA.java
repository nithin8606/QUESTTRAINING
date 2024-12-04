package com.quest.test1;

// PersonA.java
public class PersonA extends Thread {
    private final Object phone1;
    private final Object phone2;

    public PersonA(Object phone1, Object phone2) {
        this.phone1 = phone1;
        this.phone2 = phone2;
    }

    @Override
    public void run() {
        synchronized (phone1) {
            System.out.println("Person A: Holding Phone 1...");

            try { Thread.sleep(100); } catch (InterruptedException e) {}

            System.out.println("Person A: Waiting for Phone 2...");
            synchronized (phone2) {
                System.out.println("Person A: Using Phone 2!");
            }
        }
    }
}

