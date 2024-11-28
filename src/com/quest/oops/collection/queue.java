package com.quest.oops.collection;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Stack;

public class queue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(1);
        pq.add(8);
        pq.add(7);
        pq.add(5);
        System.out.println(pq);
//        insertion order is preserved
//        Iterator<Integer> it = pq.iterator();
//        while (it.hasNext()) {
//            System.out.println(it.next());
//        }
//        PriorityQueue<String> pq2 = new PriorityQueue<>();
////        pq2.add(null);
//        pq2.add("AC");
//        System.out.println(pq2);
//        System.out.println(pq.remove(1));
        System.out.println(pq.peek());
        System.out.println(pq.poll());
        System.out.println(pq.spliterator());
        System.out.println(pq.offer(9));
        System.out.println(pq);

//        fifo queue
//                lifo stack


    Stack<Integer> stack = new Stack<>();
    stack.push(1);
    stack.push(8);
    stack.push(7);
    stack.push(5);
    System.out.println(stack);
    System.out.println(stack.peek());
    System.out.println(stack.pop());
    System.out.println(stack.spliterator());


    }

}
