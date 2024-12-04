package com.quest.test1;

public class StringImmutable {
    public static void main(String[] args) {
        String str = "Hello";
        String newStr = str.concat(" World");

        System.out.println("Original String: " + str);
        System.out.println("New String: " + newStr);

        System.out.println(str == newStr);
    }
}

