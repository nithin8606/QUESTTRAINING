package com.quest.quest.assessment.test;

import java.util.*;

public class GroupByFrequency {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements in the list:");
        int size = scanner.nextInt();

        List<Integer> list = new ArrayList<>();
        System.out.println("Enter the elements of the list:");

        for (int i = 0; i < size; i++) {
            list.add(scanner.nextInt());
        }

        Map<Integer, List<Integer>> result = groupByFrequency(list);

        for (Map.Entry<Integer, List<Integer>> entry : result.entrySet()) {
            System.out.println("Frequency " + entry.getKey() + ": " + entry.getValue());
        }

        scanner.close();
    }

    public static Map<Integer, List<Integer>> groupByFrequency(List<Integer> list) {
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int num : list) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        Map<Integer, List<Integer>> groupedMap = new HashMap<>();
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {

            int number = entry.getKey();
            int frequency = entry.getValue();
            groupedMap.computeIfAbsent(frequency, k -> new ArrayList<>()).add(number);
        }

        return groupedMap;
    }
}
