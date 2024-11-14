package com.quest.practice_vars;

public class StudentScores {
    public static void main(String[] args) {

        String[] names = {"Alice", "Bob", "Charlie", "David", "Eve", "Frank", "Grace"};
        int[] ages = {20, 21, 22, 23, 24, 25, 26};
        int[][] scores = {
                {85, 90, 78, 92, -1},
                {88, 92, 80, -1, 85},
                {75, 80, 70, 60, 72},
                {90, 85, 88, 95, 92},
                {65, 70, 60, 68, 67},
                {80, 85, -1, 90, 95},
                {90, 88, 92, 85, 80}
        };

        // Step 2: Calculate average scores
        calculateAverageScores(names, ages, scores);

        // Step 3: Find the highest scorer
        findHighestScorer(names, ages, scores);

        // Step 4: Ranking students by average score
        rankStudents(names, ages, scores);

        // Step 5: Detect missing data
        detectMissingData(names, scores);
    }
    public static void calculateAverageScores(String[] names, int[] ages, int[][] scores) {
        System.out.println("Average Scores:");
        for (int i = 0; i < names.length; i++) {
            double average = (double) calculateTotal(scores[i]) / scores[i].length;
            System.out.println(names[i] + "'s average score: " + average);
        }
    }
    public static void findHighestScorer(String[] names, int[] ages, int[][] scores) {
        String highestScorer = "";
        double highestScore = Double.MIN_VALUE;
        for (int i = 0; i < names.length; i++) {
            double average = (double) calculateTotal(scores[i]) / scores[i].length;
            if (average > highestScore) {
                highestScore = average;
                highestScorer = names[i];
            }
        }
        System.out.println("Highest Scorer: " + highestScorer + " with average score: " + highestScore);
    }
    public static void rankStudents(String[] names, int[] ages, int[][] scores) {
        double[] averages = new double[names.length];
        for (int i = 0; i < names.length; i++) {
            averages[i] = (double) calculateTotal(scores[i]) / scores[i].length;
        }
        for (int i = 0; i < names.length; i++) {
            for (int j = i + 1; j < names.length; j++) {
                if (averages[i] < averages[j]) {
                    double tempAvg = averages[i];
                    averages[i] = averages[j];
                    averages[j] = tempAvg;
                    String tempName = names[i];
                    names[i] = names[j];
                    names[j] = tempName;
                }}
        }
        System.out.println("\nRanking students by average score:");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + " - Average Score: " + averages[i]);
        }}
    public static void detectMissingData(String[] names, int[][] scores) {
        System.out.println("\nDetecting Missing Data:");
        for (int i = 0; i < names.length; i++) {
            boolean missingdata = false;
            for (int j = 0; j < scores[i].length; j++) {
                if (scores[i][j] == -1) {
                    missingdata = true;
                    System.out.println(names[i] + " has missing score for subject " + (j + 1));
                }}
            if (!missingdata) {
                System.out.println(names[i] + " has no missing data.");
            }}
    }
    public static int calculateTotal(int[] scores) {
        int total = 0;
        for (int score : scores) {
            total += score;
        }
        return total;
    }
}
