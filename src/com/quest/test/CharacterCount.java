package com.quest.test;

import java.util.*;

public class CharacterCount {
    public static void main(String[] args) {
        String input = "Hello World";
        input = input.toLowerCase();

        Map<Character, Integer> charCount = new HashMap<>();
        for (char c : input.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        System.out.println(charCount);
    }
}

