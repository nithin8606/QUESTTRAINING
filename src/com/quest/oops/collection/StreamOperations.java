package com.quest.oops.collection;
import java.util.*;


public class StreamOperations {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(24, 25, 26, 30, 31, 32, 37, 38, 39, 40, 41);


        Optional<Integer> min = list.stream().min(Integer::compareTo);
        System.out.println("Min: " + min.get());

        Optional<Integer> max = list.stream().max(Integer::compareTo);
        max.ifPresent(value -> System.out.println("Max: " + value));

        System.out.println("Count: " + list.stream().count());

        System.out.println("Distinct count: " + list.stream().distinct().count());

        int sum = list.stream().reduce(0, Integer::sum);
        System.out.println("Sum: " + sum);

        List<Integer> list2 = list.stream().filter(i -> i % 2 == 0).toList();
        System.out.println("List2 (Even numbers): " + list2);

        List<Integer> list3 = list.stream().map(i -> i * 2).toList();
        System.out.println("List3 (Doubled values): " + list3);

        int x = list.stream().map(i -> 2).reduce(1, (a, b) -> a * b);
        System.out.println("X (Product of 2s): " + x);
    }
}