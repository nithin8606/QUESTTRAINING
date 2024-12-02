package com.quest.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MergeDuplicate {
    public static void main(String[] args) {

        List<String> list1 = new ArrayList<>();
        list1.add("apple");
        list1.add("banana");
        list1.add("cherry");

        List<String> list2 = new ArrayList<>();
        list2.add("banana");
        list2.add("date");
        list2.add("cherry");

        List<String> mergedList = list1.stream()
                .distinct()
                .collect(Collectors.toList());

        mergedList.addAll(list2.stream()
                .filter(s -> !mergedList.contains(s))
                .collect(Collectors.toList()));

        System.out.println("Merged List without duplicates: " + mergedList);
    }
}

