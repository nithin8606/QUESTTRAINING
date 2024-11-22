package com.quest.oops.memoryallocation;

public class StringExample {
    public static void main(String[] args) {
        // String examples
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");

        // Using '==' to compare references
        System.out.println("Using '==' for reference comparison:");
        System.out.println("str1 == str2: " + (str1 == str2));  // true, as both refer to the same memory location
        System.out.println("str1 == str3: " + (str1 == str3));  // false, as str3 is a new object

        // Using .equals() to compare values
        System.out.println("Using .equals() for value comparison:");
        System.out.println("str1.equals(str2): " + str1.equals(str2));  // true, as both contain "Hello"
        System.out.println("str1.equals(str3): " + str1.equals(str3));  // true, as both contain "Hello"
    }
}
