package ProgrammingExercisesCAP8;

import java.util.Scanner;

public class Ejercicio_8_5_AlgebraAddTwoMatrices {
    public static void main(String[] args) {
        //Matrices
        Scanner input = new Scanner(System.in);

        System.out.print("Enter matrix1: ");

        double[][] matrix1 = new double[3][3];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                matrix1[i][j] = input.nextDouble();
            }
        }

        System.out.print("Enter matrix2: ");

        double[][] matrix2 = new double[3][3];
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                matrix2[i][j] = input.nextDouble();
            }
        }


        System.out.print("Enter the operator: ");
        char operator = input.next().charAt(0);


        double[][] matrix3 = addMatrix(matrix1, matrix2);


        System.out.println("The matrices are added as follows ");

        //addMatrix(matrix1, matrix2);

        //Print matrices
        printMatricesAlgebra(matrix1, matrix2, matrix3, operator);

    }

    public static double[][] addMatrix(double[][] a, double[][] b) {
        double[][] answer = new double[a.length][a[0].length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                //System.out.println("a: " + a[i][j] + " | b: " + b[i][j]);
                answer[i][j] = a[i][j] + b[i][j];
            }
        }

        return answer;
    }

    public static void printMatricesAlgebra(double[][] matrix1, double[][] matrix2, double[][] matrix3, char operator) {
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < (matrix1.length * 3); j++) {
                if (i != (matrix1.length / 2)) {
                    //To print matrix1, row1 and row3
                    if (j <= (matrix1.length - 1)) {
                        System.out.printf("%5.1f", matrix1[i][j]);
                        if (j == (matrix1.length - 1)) {
                            System.out.print("      ");
                        }
                    }
                    //To print matrix2, row1 and row3
                    if (j >= matrix1.length && j < matrix1.length * 2) {
                        System.out.printf("%5.1f", matrix2[i][j - (matrix1.length)]);
                        if (j == (matrix1.length * 2 - 1)) {
                            System.out.print("      ");
                        }
                    }
                    //To print addmatrix, row1 and row3
                    if (j >= matrix1.length * 2) {
                        System.out.printf("%5.1f", matrix3[i][j - (matrix1.length) * 2]);//CAMBIAR MATRIZ
                        if (j == (matrix1.length * 3 - 1)) {
                            System.out.println(" ");
                        }
                    }
                } else if (i == (matrix1.length / 2)) {
                    //To print matrix1, row2
                    if (j <= (matrix1.length - 1)) {
                        System.out.printf("%5.1f", matrix1[i][j]);
                        if (j == (matrix1.length - 1)) {
                            System.out.print("  " + operator + "   ");
                        }
                    }
                    //To print matrix2, row2
                    if (j >= matrix1.length && j < matrix1.length * 2) {
                        System.out.printf("%5.1f", matrix2[i][j - (matrix1.length)]);
                        if (j == (matrix1.length * 2 - 1)) {
                            System.out.print("  =   ");
                        }
                    }
                    //To print addmatrix, row2
                    if (j >= matrix1.length * 2) {
                        System.out.printf("%5.1f", matrix3[i][j - (matrix1.length) * 2]);//CAMBIAR MATRIZ
                        if (j == (matrix1.length * 3 - 1)) {
                            System.out.println(" ");
                        }
                    }
                }
            }

        }
    }
}
