package com.quest.oops.collection;

import java.util.HashMap;
import java.util.TreeMap;

public class TestHashTree {
    public static void main(String[] args) {
        HashMap<Integer,String> hm = new HashMap<>();
        TreeMap<Integer,String> tm = new TreeMap<>();
        TreeMap<Integer,String> tm2 = new TreeMap<>();
        HashMap<Integer,String> hm2 = new HashMap<>();
        hm.put(1,"A");
        hm.put(2,"E");
        hm.put(3,"D");
        hm.put(4,"C");
        tm.put(1,"A");
        tm.put(2,"E");
        tm.put(3,"D");
        tm.put(4,"C");

      hm.forEach((k,v)-> System.out.println(k+" "+v));
      tm.forEach((k,v)-> System.out.println(k+" "+v));


      hm2.put(1,"A");
      hm2.put(5,"E");
      hm2.put(3,"D");
      hm2.put(6,null);
//      hm2.put(null,null);
      tm2.put(1,"a");
      tm2.put(3,"c");
      tm2.put(2,"b");
      tm2.put(7,null);
//      tm2.put(null,null);
      hm2.forEach((k,v)-> System.out.println(k+" "+v));
      tm2.forEach((k,v)-> System.out.println(k+" "+v));

        }
    }

