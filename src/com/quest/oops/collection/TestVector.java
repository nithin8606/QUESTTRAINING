package com.quest.oops.collection;

import java.util.Vector;

public class TestVector {
    public static void main(String[] args) {
        Vector <Integer> v = new Vector <Integer>();
        v.add(1);
        v.add(2);
        v.add(3);
        v.add(4);
        v.add(5);
        System.out.println(v.size());
        System.out.println(v.get(0));
        System.out.println(v.get(1));
        System.out.println(v.lastElement());
        System.out.println(v.contains(2));
        System.out.println(v.isEmpty());
        System.out.println(v.removeElement(1));

    }
}

