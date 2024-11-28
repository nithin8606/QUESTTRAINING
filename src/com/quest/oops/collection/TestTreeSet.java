package com.quest.oops.collection;

import java.util.TreeSet;

public class TestTreeSet {
    public static void main(String[] args) {

        TreeSet<Integer> ts = new TreeSet<>();

        ts.add(5);
        ts.add(7);
        ts.add(8);
        for (Integer num : ts) {
//            System.out.println(num);
            System.out.println(ts.first());
            System.out.println(ts.last());
            System.out.println(ts.descendingSet());
            System.out.println(ts.size());
            System.out.println(ts.clone());
//            System.out.println(ts.headSet(num));
//            System.out.println(ts.tailSet(num));
//            System.out.println(ts.toArray());
//            System.out.println(ts.stream().toList());
//            System.out.println(ts.parallelStream().toList());
            System.out.println(ts.headSet(num));
            System.out.println(ts.tailSet(num));
        }
    }
}
