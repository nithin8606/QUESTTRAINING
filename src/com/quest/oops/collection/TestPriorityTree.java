package com.quest.oops.collection;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class TestPriorityTree {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        TreeSet<Integer> ts = new TreeSet<>();

        pq.add(52);
        pq.add(24);
        pq.add(34);
        pq.add(46);
        pq.add(46);
//        pq.add(null);
//        pq.add(null);

        ts.add(52);
        ts.add(24);
        ts.add(34);
        ts.add(46);
        ts.add(46);
//        ts.add(null);
//        ts.add(null);

        pq.forEach(System.out::println);
        ts.forEach(System.out::println);
    }
}
//Implements a queue where elements are ordered by priority (heap-based).
//Implements a set where elements are sorted and unique (tree-based).
//Allows duplicates.
//Does not allow duplicates.
//Does not allow null elements.
//Does not allow null elements.
//Backed by a binary heap
//Backed by a Red-Black Tree.