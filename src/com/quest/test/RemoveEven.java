package com.quest.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveEven {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(15);
        list.add(20);
        list.add(25);
        list.add(30);
        list.add(35);
        List<Integer> updatedList = list.stream()
                .filter(num -> num % 2 != 0)
                .collect(Collectors.toList());

        System.out.println("Updated List: " + updatedList);
    }
}

