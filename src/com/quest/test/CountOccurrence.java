package com.quest.test;

import java.util.*;

public class CountOccurrence {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10, 15, 20, 10, 25, 15, 20, 10);

        Map<Integer, Integer> frequencyMap = new HashMap<>();

        list.forEach(num -> frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1));

        frequencyMap.forEach((key, value) -> System.out.println(key + " -> " + value));
    }
}
