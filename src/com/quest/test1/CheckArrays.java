package com.quest.test1;

import java.util.Arrays;

public class CheckArrays {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {5, 4, 3, 2, 1};

        Arrays.sort(array1);
        Arrays.sort(array2);

        if (Arrays.equals(array1, array2)) {
            System.out.println("The arrays have the same elements.");
        } else {
            System.out.println("The arrays do not have the same elements.");
        }
    }
}

