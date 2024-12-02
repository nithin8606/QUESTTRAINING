package com.quest.test;

import java.util.HashMap;
import java.util.Map;

public class WordCount {
    public static void main(String[] args) {

        String input = "Java is fun and java is powerful";
        input = input.toLowerCase();
        String[] words = input.split(" ");

        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        System.out.println("Word count map: " + wordCount); // Debug


        }
    }

