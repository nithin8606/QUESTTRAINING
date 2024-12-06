package com.quest.thread;

public class EvenOdd {

    public static void main(String[] args) {
        Odd t1 = new Odd();
        Even t2 = new Even();

        t1.start();
        t2.start();
    }
}

class Odd extends Thread {
    public void run() {
        for (int i = 1; i <= 15; i += 2) {
            System.out.println(i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

class Even extends Thread {
    public void run() {
        for (int i = 2; i <= 15; i += 2) {
            System.out.println(i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
