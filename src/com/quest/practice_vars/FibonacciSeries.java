package com.quest.practice_vars;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of terms for the Fibonacci series: ");
        number = sc.nextInt();

        int firstTerm = 0, secondTerm = 1;

        System.out.println("The Fibonacci series is: ");
        for (int i = 1; i <= number; i++) {
            System.out.print(firstTerm + " ");


            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }

        sc.close();
    }
}
