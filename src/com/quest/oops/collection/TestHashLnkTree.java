package com.quest.oops.collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class TestHashLnkTree {
    public static void main(String[] args) {

        HashMap<Double, Boolean> hm = new HashMap<>();
        LinkedHashMap<Double, Boolean> lm = new LinkedHashMap<>();
        TreeMap<Double, Boolean> tm = new TreeMap<>();

        hm.put(1.1, true);
        hm.put(2.2, false);
        hm.put(3.3, true);
        hm.put(4.4, false);

        lm.put(1.1, true);
        lm.put(2.2, false);
        lm.put(3.3, true);
        lm.put(4.4, false);

        tm.put(1.1, true);
        tm.put(2.2, false);
        tm.put(3.3, true);
        tm.put(4.4, false);

        hm.forEach((k, v) -> System.out.println(k + ": " + v));
        lm.forEach((k, v) -> System.out.println(k + ": " + v));
        tm.forEach((k, v) -> System.out.println(k + ": " + v));

        System.out.println("HashMap: " + hm);
        System.out.println("LinkedHashMap: " + lm);
        System.out.println("TreeMap: " + tm);

        System.out.println(hm.replace(1.1,true,false));
        System.out.println(lm.replace(1.1,true,false));
        System.out.println(tm.replace(1.1,true,false));
        System.out.println(hm.replace(2.2,true,false));
        System.out.println(lm.replace(2.2,true,false));
        System.out.println(tm.replace(3.3,true,false));

        System.out.println("HashMap: " + hm);
        System.out.println("LinkedHashMap: " + lm);
        System.out.println("TreeMap: " + tm);
    }
}
