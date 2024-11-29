package com.quest.oops.collection;

import java.util.PriorityQueue;

public class TestQueue {
    public static void main(String[] args) {

        PriorityQueue<Integer> intQueue = new PriorityQueue<>();
        intQueue.add(15);
        intQueue.add(5);
        intQueue.add(30);
        System.out.println("\n" +intQueue);
        System.out.println("\n" + intQueue.peek());
        intQueue.poll();
        System.out.println("\n" +intQueue);

        PriorityQueue<Double> doubleQueue = new PriorityQueue<>();
        doubleQueue.add(10.5);
        doubleQueue.add(3.14);
        doubleQueue.add(7.89);
        System.out.println("\n" +doubleQueue);
        System.out.println("\n" + doubleQueue.peek());
        doubleQueue.poll();
        System.out.println("\n" +doubleQueue);

        PriorityQueue<Character> charQueue = new PriorityQueue<>();
        charQueue.add('Z');
        charQueue.add('A');
        charQueue.add('M');
        System.out.println("\n" +charQueue);
        System.out.println("\n" + charQueue.peek());
        charQueue.poll();
        System.out.println("\n" +charQueue);

        PriorityQueue<Boolean> booleanQueue = new PriorityQueue<>();
        booleanQueue.add(false);
        booleanQueue.add(true);
        booleanQueue.add(false);
        System.out.println("\n" +booleanQueue);
        System.out.println("\n" + booleanQueue.peek());
        booleanQueue.poll();
        System.out.println("\n" +booleanQueue);

        PriorityQueue<Long> longQueue = new PriorityQueue<>();
        longQueue.add(100000L);
        longQueue.add(5000L);
        longQueue.add(20000L);
        System.out.println("\n" +longQueue);
        System.out.println("\n" + longQueue.peek());
        longQueue.poll();
        System.out.println("\n" +longQueue);

        PriorityQueue<Float> floatQueue = new PriorityQueue<>();
        floatQueue.add(3.5f);
        floatQueue.add(1.2f);
        floatQueue.add(2.8f);
        System.out.println("\n" +floatQueue);
        System.out.println("\n" + floatQueue.peek());
        floatQueue.poll();
        System.out.println("\n" +floatQueue);

        PriorityQueue<Byte> byteQueue = new PriorityQueue<>();
        byteQueue.add((byte) 10);
        byteQueue.add((byte) 5);
        byteQueue.add((byte) 20);
        System.out.println("\n" +byteQueue);
        System.out.println("\n" + byteQueue.peek());
        byteQueue.poll();
        System.out.println("\n" +byteQueue);

        PriorityQueue<Short> shortQueue = new PriorityQueue<>();
        shortQueue.add((short) 300);
        shortQueue.add((short) 150);
        shortQueue.add((short) 400);
        System.out.println("\n" +shortQueue);
        System.out.println("\n" + shortQueue.peek());
        shortQueue.poll();
        System.out.println("\n" +shortQueue);

        }
    }


