package com.quest.test;

import java.util.*;

public class SetContainsAll {
    public static void main(String[] args) {

        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);

        Set<Integer> set2 = new HashSet<>();
        set2.add(2);
        set2.add(3);
        set2.add(4);

        if (set1.containsAll(set2)) {
            System.out.println("set1 contains all elements of set2.");
        } else {
            System.out.println("set1 does not contain all elements of set2.");
        }
    }
}
