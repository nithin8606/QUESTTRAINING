package com.quest.practice_vars;

public class CountOfLetters {
    public static void main(String[] args) {
        String s = "Nithinkrishna";
        s=s.toUpperCase();
        System.out.println("Full name: " + s);
        System.out.println("\nCharacter count:");
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (s.indexOf(currentChar) != i) {
                continue;
            }
            int count = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == currentChar) {
                    count++;
                }
            }
            System.out.println(currentChar + " - " + count);
        }
    }
}
