package com.quest.thread;

public class MatrixMultiplication {

    public static void main(String[] args) {
        int[][] A = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int[][] B = {
                {1, 4},
                {2, 5},
                {3, 6}
        };

        int[][] C = new int[2][2];

        // Thread for first row
        Thread row1 = new Thread(() -> {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 3; k++) {
                    C[0][j] += A[0][k] * B[k][j];
                }
            }
        });

        // Thread for  second row
        Thread row2 = new Thread(() -> {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 3; k++) {
                    C[1][j] += A[1][k] * B[k][j];
                }
            }
        });

        row1.start();
        row2.start();
        
        System.out.println("Resulting Matrix C:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}
