package com.quest.test;

import java.util.ArrayList;
import java.util.List;

public class ReverseList {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println("Original List: " + list);

        List<Integer> reversedList = reverseList(list);

        System.out.println("Reversed List: " + reversedList);
    }

    public static List<Integer> reverseList(List<Integer> list) {
        List<Integer> reversed = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            reversed.add(list.get(i));
        }
        return reversed;
    }
}

