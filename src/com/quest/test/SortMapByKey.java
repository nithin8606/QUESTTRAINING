package com.quest.test;

import java.util.*;

public class SortMapByKey {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Banana", 2);
        map.put("Apple", 5);
        map.put("Mango", 3);
        map.put("Grapes", 1);

        Map<String, Integer> sortedMap = new TreeMap<>(map);
        System.out.println("Sorted Map by Key: " + sortedMap);
    }
}

