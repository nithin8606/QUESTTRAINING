package com.quest.oops.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.TreeSet;
import java.util.stream.Stream;

public class TestHash {
    public static void main(String[] args) {
        HashSet<Integer> hashSet1 = new HashSet<>();
        for (int i = 1; i <= 100; i++) {
            hashSet1.add(i);
        }
        System.out.println();

        System.out.println("HashSet1 Elements: " + hashSet1);

        LinkedHashSet<Integer> linkedHashSet1 = new LinkedHashSet<>(hashSet1);
        System.out.println("LinkedHashSet1 Elements: " + linkedHashSet1);

        TreeSet<Integer> treeSet1 = new TreeSet<>(hashSet1);
        System.out.println("TreeSet1 Elements: " + treeSet1);


        HashSet<Integer> hashSet2 = new HashSet<>();
        Random random = new Random();
        while (hashSet2.size() < 10) {
            hashSet2.add(random.nextInt(100) + 1);
        }
        System.out.println("\nHashSet2 Elements: " + hashSet2);

        LinkedHashSet<Integer> linkedHashSet2 = new LinkedHashSet<>(hashSet2);
        System.out.println("LinkedHashSet2 Elements: " + linkedHashSet2);

        TreeSet<Integer> treeSet2 = new TreeSet<>(hashSet2);
        System.out.println("TreeSet2 Elements: " + treeSet2);

        HashSet<Integer> hashSet3 = new HashSet<>();
        hashSet3.add(null);
        hashSet3.add(20);
        hashSet3.add(50);
        hashSet3.add(40);
        System.out.println("\nHashSet3 Elements: " + hashSet3);

        LinkedHashSet<Integer> linkedHashSet3 = new LinkedHashSet<>(hashSet3);
        System.out.println("LinkedHashSet3 Elements: " + linkedHashSet3);

        TreeSet<Integer> treeSet3 = new TreeSet<>();
        treeSet3.add(20);
        treeSet3.add(50);
        treeSet3.add(40);
        System.out.println("TreeSet3 Elements: " + treeSet3);
    }
}
//duplicate value
//        insertion
//multiple null values in li
//position by get
//sorting order is preserved
//performance
//maniulating data
