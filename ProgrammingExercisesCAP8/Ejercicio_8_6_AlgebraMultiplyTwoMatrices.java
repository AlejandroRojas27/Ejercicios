package ProgrammingExercisesCAP8;

import java.util.Scanner;

public class Ejercicio_8_6_AlgebraMultiplyTwoMatrices {
    public static void main(String[] args) {
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


        //Multiply method
        double[][] matrix3 = multiplyMatrix(matrix1, matrix2);

        char operator = '*';

        //Print
        System.out.println("The multiplication of the matrices is");
        Ejercicio_8_5_AlgebraAddTwoMatrices.printMatricesAlgebra(matrix1, matrix2, matrix3, operator);

    }

    public static double[][] multiplyMatrix(double[][] a, double[][] b) {
        double[][] answer = new double[a.length][a[0].length];

        for (int x = 0; x < answer.length; x++) {

            for (int col = 0; col < answer.length; col++) {

                double sum = 0;

                for (int i = 0; i < answer[col].length; i++) {

                    sum += (a[x][i] * b[i][col]);
                }
                answer[x][col] = sum;
            }
        }
        return answer;
    }
}
