package com.quest.practice_vars;

import java.util.Scanner;

public class StudentGrading {
    public static void main(String[] args) {
        final int MAX_SCORE = 100;
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter student name: ");
        String name = sc.next();


        System.out.print("Enter Math score: ");
        int mathScore = sc.nextInt();

        System.out.print("Enter Science score: ");
        int scienceScore = sc.nextInt();

        System.out.print("Enter English score: ");
        int englishScore = sc.nextInt();


        int totalScore = mathScore + scienceScore + englishScore;
        double averageScore = totalScore / 3.0;


        char grade;
        if (averageScore >= 90) {
            grade = 'A';
        } else if (averageScore >= 80) {
            grade = 'B';
        } else if (averageScore >= 70) {
            grade = 'C';
        } else if (averageScore >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // Output the result
        System.out.println("\nStudent Name: " + name);
        System.out.println("Total Score: " + totalScore);
        System.out.println("Average Score: " + averageScore);
        System.out.println("Grade: " + grade);


        switch (grade) {
            case 'A':
                System.out.println("Excellent performance!");
                break;
            case 'B':
                System.out.println("Good job, but you can aim higher!");
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
