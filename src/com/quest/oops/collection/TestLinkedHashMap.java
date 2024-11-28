package com.quest.oops.collection;

import java.util.LinkedHashMap;
import java.util.Map;

public class TestLinkedHashMap {
    public static void main(String[] args) {
        Map<String, Integer> l = new LinkedHashMap<>();

        l.put("Apple", 3);
        l.put("Banana", 2);
        l.put("Orange", 5);
        l.put("Grapes", 1);
        for (Integer i : l.values()) {
            System.out.println(i);
        }
        for(String s : l.keySet()) {
            System.out.println(s);
        }


        System.out.println(l);

        System.out.println(l.get("Apple"));
        System.out.println(l.get("Banana"));

        l.remove("Orange");
        System.out.println(l);

        for (Map.Entry<String, Integer> e : l.entrySet()) {
            System.out.println(e.getKey() + ": " + e.getValue());
        }
        l.forEach((k, v) -> System.out.println(k + ": " + v));

        System.out.println(l.entrySet());
        System.out.println(l.keySet());
        System.out.println(l.values());
        System.out.println(l.isEmpty());
        System.out.println(l.size());
        System.out.println(l.replace("Apple",6));
        System.out.println(l);
    }
}
