package ProgrammingExercisesCAP8;

import java.util.Scanner;

public class Ejercicio_8_1_SumElementsColumnByColumn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[][] matrix = new double[3][4];

        System.out.println("Enter a 3-by-4 matrix row by row: ");
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = input.nextDouble();
            }
        }

        for (int i = 0; i < matrix[0].length; i++) {
            System.out.println("Sum of the elements at column " + i + " is " + sumColumn(matrix, i));
        }

    }

    public static double sumColumn(double[][] m, int columnIndex){
        double sum = 0;
        for (int row = 0; row < m.length; row++) {
            for (int column = 0; column < m[0].length; column++) {
                if(column == columnIndex){
                    sum += m[row][column];
                }
            }
        }

        return sum;
    }
}
