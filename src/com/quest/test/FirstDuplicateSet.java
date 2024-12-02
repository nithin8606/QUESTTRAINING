package com.quest.test;

import java.util.*;

public class FirstDuplicateSet {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(2);

        Set<Integer> seen = new HashSet<>();
        for (Integer num : list) {
            if (!seen.add(num)) {
                System.out.println("First duplicate: " + num);
                return;
            }
        }
        System.out.println("No duplicates found.");
    }
}
