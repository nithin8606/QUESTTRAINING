package com.quest.quest.assessment.test;

import java.util.*;

public class PartitionOfList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the list:");
        int size = scanner.nextInt();

        List<Integer> input = new ArrayList<>();
        System.out.println("Enter " + size + " integers:");

        for (int i = 0; i < size; i++) {
            input.add(scanner.nextInt());
        }

        System.out.println("Enter the partition size:");
        int n = scanner.nextInt();

        partitionOfList(input, n);

        scanner.close();
    }

    public static void partitionOfList(List<Integer> input, int n) {
        List<Integer> partition = new ArrayList<>();

        input.forEach(item -> {
            partition.add(item);
            if (partition.size() == n) {
                System.out.println(partition);
                partition.clear();
            }
        });

        if (!partition.isEmpty()) {
            System.out.println(partition);
        }
    }
}
