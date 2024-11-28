package com.quest.oops.collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestLinkSet {
    public static void main(String[] args) {
        LinkedHashSet<String> a = new LinkedHashSet<>();
        a.add("hello");
        a.add("hai");
        a.add("fine");
        a.add("nice day");
        a.add("good");
        System.out.println(a.remove(1));
        System.out.println(a.retainAll(a));
        System.out.println(a.isEmpty());
        System.out.println(a.size());
        System.out.println(a.contains(1));
        System.out.println(a.add("time"));
        System.out.println(a);
        System.out.println(a.isEmpty());
        Iterator<String> iterator = a.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }



//        for (String s : list) {
//            System.out.println(s);
//        }
//        HashSet<String> set = new HashSet<>();
//        set.add("good");
//        set.add("nice day");
//        set.add("fine");
//        set.add("hello");
//        set.add("hai");
//        for (String s : set) {
//            System.out.println(s);
//        }
    }
}
