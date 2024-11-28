package com.quest.oops.collection;

import java.util.HashSet;

public class TestSet {
    public static void main(String[] args) {
        HashSet <Integer> h = new HashSet <> ();
        h.add(1);
        h.add(2);
        h.add(7);
        h.add(6);
        h.add(5);
        h.size();
        System.out.println(h.remove(1));
        System.out.println(h.retainAll(h));
        System.out.println(h.isEmpty());
        System.out.println(h.size());
        System.out.println(h.contains(1));
        System.out.println(h.add(3));
        System.out.println(h);


//        h.add(null);
//        for (int i : h) {
//            System.out.println(i);
//        }
//        ArrayList<Integer> a = new ArrayList<> ();
//        a.add(1);
//        a.add(2);
//        a.add(7);
//        a.add(6);
//        a.add(5);
//        a.add(null);
//        for (int i : a) {
//            System.out.println(i);
//        }
    }
}
