package com.quest.oops.test;

public class CountOfMissing {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 7, 9}; // Example input array
        int missingCount = 0;

        // Loop through numbers from 1 to 10
        for (int i = 1; i <= 10; i++) {
            boolean found = false;

            // i (ranging from 1 to 10) exists in the given array arr
            for (int num : arr) {
                if (num == i) {
                    found = true;
                    break;
                }
            }

            // The loop will check each number in the array: 1, 2, 3, 5, 7, 9.
            //It will find 1, so found is set to true, and the inner loop exits early (break).
            //Since found is true, the number 1 is not considered missing.
            if (!found) {
                System.out.println(i);
                missingCount++;
            }
        }

        // Print the total count of missing numbers
        System.out.println("Total missing numbers: " + missingCount);
    }
}
