package com.quest.oops.collection;

import java.util.TreeMap;

public class TestTreeMap {
    public static void main(String[] args) {
        TreeMap <String, String> map = new TreeMap<>();
        map.put("A", "B");
        map.put("B", "C");
        map.put("C", "D");
        map.put("D", "E");
        map.put("E", "F");
        map.put("F", "G");
        map.forEach((k, v) -> System.out.println(k + ": " + v));
        System.out.println(map.size());
        System.out.println(map.containsKey("A"));
        System.out.println(map.containsValue("B"));
        System.out.println(map.replace("A","B", "b"));


        System.out.println(map.replace("B","c"));
        System.out.println(map.replace("C","d"));
        System.out.println(map.replace("D","e"));
        System.out.println(map);
        System.out.println(map.subMap("A", "B"));
        System.out.println(map.subMap("B", "C"));
        System.out.println(map.putIfAbsent("A","C"));
    }
}

