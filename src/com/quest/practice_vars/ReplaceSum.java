package com.quest.practice_vars;

import java.util.Arrays;

public class ReplaceSum {
    public static void main(String[] args) {
        int ar[] = {2, 4, 5, 7, 8}; // Input array
        int sum = 0;
        for (int num : ar) {
            sum += num;
        }
        for (int i = 0; i < ar.length; i++) {
            ar[i] = sum - ar[i];
        }
        System.out.println("Output: " + Arrays.toString(ar));
    }
}

