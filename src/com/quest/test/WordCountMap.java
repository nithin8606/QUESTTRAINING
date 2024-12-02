package com.quest.test;

import java.util.*;

public class WordCountMap {
    public static void main(String[] args) {
        String sentence = "Java is fun and java is powerful";
        Map<String, Integer> wordCount = new HashMap<>();

        String[] words = sentence.toLowerCase().split(" ");
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        System.out.println(wordCount);
    }
}
