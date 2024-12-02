package com.quest.test;

import java.util.*;

public class RemoveDivisibleByThree {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(15);
        set.add(6);
        set.add(9);
        set.add(12);
        set.add(90);

        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() % 3 == 0) {
                iterator.remove();
            }
        }

        System.out.println(set);
    }
}
