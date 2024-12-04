package com.quest.test1;

import java.nio.file.*;
import java.io.IOException;

public class FindString {
    public static void main(String[] args) {
        String filePath = "File1.txt";
        String searchString = "hello";

        try {
            boolean found = Files.lines(Paths.get(filePath))
                    .anyMatch(line -> line.contains(searchString));

            if (found) {
                System.out.println("Found: " + searchString);
            } else {
                System.out.println("String not found");
            }
        } catch (IOException e) {
            System.out.println("Error reading the file.");
        }
    }
}
