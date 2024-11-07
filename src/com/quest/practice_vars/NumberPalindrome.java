package com.quest.practice_vars;

import java.util.Scanner;

public class NumberPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close(); // Close scanner after use

        int originalNum = num;
        int reversedNum = 0;

        while (num != 0) {
            int lastDigit = num % 10;
            reversedNum = reversedNum * 10 + lastDigit;
            num = num / 10;
        }

        if (reversedNum == originalNum) {
            System.out.println(originalNum + " is a palindrome");
        } else {
            System.out.println(originalNum + " is not a palindrome");
        }
    }
}
