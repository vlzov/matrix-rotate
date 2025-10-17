package ru.netology.matrix;

import java.util.Random;

public class Matrix {
    public static final int SIZE = 8;

    public static void printMatrix(int[][] matrix){
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.format("%4d", matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] createMatrix() {
        int[][] matrix = new int[SIZE][SIZE];

        Random random = new Random();
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                matrix[i][j] = random.nextInt(256);
            }
        }

        return matrix;
    }

    public static int[][] rotateMatrix(int[][] matrix) {
        int[][] rotatedMatrix = new int[SIZE][SIZE];

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                rotatedMatrix[i][j] = matrix[SIZE - 1 - j][i];
            }
        }

        return rotatedMatrix;
    }
}
