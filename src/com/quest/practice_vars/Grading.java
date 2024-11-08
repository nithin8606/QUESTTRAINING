package com.quest.practice_vars;

import java.util.Scanner;

public class Grading {
    public static void main(String[] args) {
        final int MAX_SCORE = 100;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students (1-100): ");
        int numberOfStudents = sc.nextInt();
        while (numberOfStudents < 1 || numberOfStudents > 100) {
            System.out.print("Invalid number. Enter a value between 1 and 100: ");
            numberOfStudents = sc.nextInt();
        }
        for (int i = 1; i <= numberOfStudents; i++) {
            System.out.println("\n" + i + "\n");
            System.out.print("Enter your name: ");
            String name = sc.next();
            System.out.print("Enter your math score: ");
            int mathScore = sc.nextInt();
            if (mathScore < 1 || mathScore > MAX_SCORE) {
                System.out.println("Invalid score. Please enter a score between 1 and 100.");
            }
            System.out.print("Enter your science score: ");
            int scienceScore = sc.nextInt();
            if (scienceScore < 1 || scienceScore > MAX_SCORE) {
                System.out.println("Invalid score. Please enter a score between 1 and 100.");
            }
            System.out.print("Enter your english score: ");
            int englishScore = sc.nextInt();
            if (englishScore < 1 || englishScore > MAX_SCORE) {
                System.out.println("Invalid score. Please enter a score between 1 and 100.");
            }
            int totalScore = mathScore + scienceScore + englishScore;
            double average = totalScore / 3.0;
            char grade;
            if (average >= 90) {
                grade = 'A';
            } else if (average >= 80) {
                grade = 'B';
            } else if (average >= 70) {
                grade = 'C';
            } else if (average >= 60) {
                grade = 'D';
            } else {
                grade = 'F';
            }
            System.out.println("\nStudent Name: " + name);
            System.out.println("Total score: " + totalScore);
            System.out.println("Average score: " + average);
            System.out.println("Grade: " + grade);
            switch (grade) {
                case 'A':
                    System.out.println("Excellent!");
                    break;
                case 'B':
                    System.out.println("Good job!");
                    break;
                case 'C':
                    System.out.println("You need to put in more effort!");
                    break;
                case 'D':
                    System.out.println("Your performance is below expectations. Consider seeking help.");
                    break;
                case 'F':
                    System.out.println("Failure. You need significant improvement.");
                    break;
            }
            if (mathScore < 60 || scienceScore < 60 || englishScore < 60) {
                System.out.println("Warning: Needs improvement in individual subjects.");
            }
        }
    }
}
