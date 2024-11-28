package com.quest.oops.collection;

import java.util.HashMap;
import java.util.Map;

public class TestMap {


    public static void main(String[] args) {
        HashMap <Integer,String> h = new  HashMap <> ();
        h.put(1,"Banana");
        h.put(2,"Bob");
        h.put(3,"Carol");
        h.put(4,"Davis");
        h.put(5,"Daniel");
        h.put(6,"Daniel");
        for (String s : h.values()) {
            System.out.println(s);
        }
            for(Integer i : h.keySet()) {
                System.out.println(i);
            }
        for(Map.Entry <Integer,String> e : h.entrySet()) {
            System.out.println(e.getKey()+" "+e.getValue());
        }
        System.out.println(h.get(2));
        System.out.println(h.remove(2));
        System.out.println(h.size());
        System.out.println(h.isEmpty());


    }
}
