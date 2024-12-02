package com.quest.test;

import java.util.Arrays;
import java.util.List;

public class SecondLargestList {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10, 15, 20, 25, 30);

        int secondLargest = list.stream()
                .distinct()
                .sorted((a, b) -> b - a)
                .skip(1)
                .findFirst()
                .orElseThrow(() -> new RuntimeException(""));

        System.out.println("Second largest element: " + secondLargest);
    }
}

