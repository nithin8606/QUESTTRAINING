package com.quest.test;

import java.util.*;

public class ListToSet {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("apple");
        list.add("orange");
        list.add("banana");
        list.add("grape");

        Set<String> set = new HashSet<>();
        set.addAll(list);

        System.out.println("Set after removing duplicates: " + set);
    }
}
