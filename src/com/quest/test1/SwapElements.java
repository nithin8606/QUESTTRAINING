package com.quest.test1;

public class SwapElements {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        int temp = arr[1];
        arr[1] = arr[3];
        arr[3] = temp;

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

