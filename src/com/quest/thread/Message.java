package com.quest.thread;

public class Message {

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(new MessageRunnable("Hello"));
        Thread t2 = new Thread(new MessageRunnable("World"));
        Thread t3 = new Thread(new MessageRunnable("!"));

        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();

    }
}

class MessageRunnable implements Runnable {
    private String message;

    public MessageRunnable(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(500);
            System.out.println(message);
        } catch (InterruptedException e) {
            throw new RuntimeException("Thread interrupted while printing message: " + message, e);
        }
    }
}
