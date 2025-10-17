package ru.netology.main;

import ru.netology.matrix.*;

public class Main {
    public static void main(String[] args) {
        
        int[][] colours = Matrix.createMatrix();
        int[][] rotatedColours = Matrix.rotateMatrix(colours);

        System.out.println("Первоначальная матрица: ");
        Matrix.printMatrix(colours);

        System.out.println();
        
        System.out.println("Перевёрнутая на 90 градусов матрица: ");
        Matrix.printMatrix(rotatedColours);

    }
}
