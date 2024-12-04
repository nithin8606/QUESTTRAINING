package com.quest.test1;

public class LongestString {
    public static void main(String[] args) {
        String[] arr = {"flower", "flow", "fly"};

        String longestSubstring = "";

        for (String str : arr) {
            if (str.length() > longestSubstring.length()) {
                longestSubstring = str;
            }
        }
        System.out.println("Longest substring is: " + longestSubstring);
    }
}

