package com.quest.practice_vars;

public class Searcharray {
    public static int search(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        int searchvalue = 50;
        int index = search(array, searchvalue);
        if (index != -1) {
            System.out.println("Value found at index: " + index);
        } else {
            System.out.println("Value not found in the array.");
        }
    }
}

