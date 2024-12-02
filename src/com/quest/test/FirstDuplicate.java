package com.quest.test;

import java.util.HashSet;
import java.util.Set;

public class FirstDuplicate {
    public static void main(String[] args) {

        int[] numbers = {4, 5, 6, 7, 5, 9, 6};

        Set<Integer> seen = new HashSet<>();
        for (int num : numbers) {
            if (seen.contains(num)) {
                System.out.println("First duplicate: " + num);
                return;
            }
            seen.add(num);
        }
        System.out.println("No duplicates found.");
    }
}
