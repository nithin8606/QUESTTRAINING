package com.quest.oops.collection;

import java.util.Stack;

public class TestStack {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Popped element: " + stack.pop());
        System.out.println("Top element after pop: " + stack.peek());
        System.out.println("Search element 1: " + stack.search(1));

        stack.add(4);
        System.out.println("add element 4: " + stack);
        System.out.println(stack.get(2));


//        System.out.println("Is stack empty? " + stack.empty());

        while (!stack.empty()) {
            System.out.println("Popped: " + stack.pop());
        }

        System.out.println("Is stack empty after popping all elements? " + stack.empty());
    }
}
