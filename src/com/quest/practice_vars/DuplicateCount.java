package com.quest.practice_vars;

public class DuplicateCount {
    public static void main(String[] args) {
        int[] array = {100, 789, 66, 77, 66, 77, 88, 88, 55, 44, 0, 0, 22, 55, 11, 11};
        int i = 0;
        System.out.println("Duplicate elements and their counts:");
        while (i < array.length) {
            int j = i + 1;
            int count = 1;
            boolean duplicateFound = false;
            while (j < array.length) {
                if (array[i] == array[j]) {
                    duplicateFound = true;
                    count++;
                    array[j] = -1;
                }
                j++;
            }
            if (duplicateFound && array[i] != -1) {
                System.out.println(array[i] + " appears " + count + " times");
            }
            i++;}
    }
}
