package ProgrammingExercisesCAP8;

import java.util.Scanner;

public class Ejercicio_8_26_RowSorting {
    public static void main(String[] args) {

        System.out.println("Enter a 3−by−3 matrix row by row: ");
        double[][] matrix = initializeMatrixDouble();

        //Print original
        System.out.println("Print original");
        printTwoDimensionArrayDouble(matrix);
        System.out.println(" ");


        //Print sorted
        System.out.println("The row−sorted array is ");
        printTwoDimensionArrayDouble(sortRow(matrix));


    }

    public static double[][] initializeMatrixDouble(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter row.length and column.length ");
        int row = input.nextInt();
        System.out.print(" by ");
        int col = input.nextInt();

        System.out.println("Enter values: ");

        double[][] matrix = new double[row][col];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }

        return matrix;
    }

    public static double[][] sortRow(double[][] m) {
        double[][] sorted = new double[m.length][m.length];

        for (int i = 0; i < m.length; i++) {
            double[] toSort = new double[m.length];
            for (int j = 0; j < m[i].length; j++) {
                toSort[j] = m[i][j];
            }

            java.util.Arrays.sort(toSort);

            //System.out.println(java.util.Arrays.toString(toSort));

            for (int j = 0; j < m[i].length; j++) {
                sorted[i][j] = toSort[j];
            }

        }


        return sorted;
    }

    public static void printTwoDimensionArrayDouble(double[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println(" ");
        }

    }

}
