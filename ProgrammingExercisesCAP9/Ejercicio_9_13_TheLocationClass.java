package ProgrammingExercisesCAP9;

import java.util.Scanner;

public class Ejercicio_9_13_TheLocationClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Location location = new Location();
        System.out.println("Enter the number of rows and columns in the array: ");
        int row = input.nextInt();
        location.setRowMatrix(row);

        int column = input.nextInt();
        location.setColumnMatrix(column);

        double[][] matrix = new double[row][column];
        System.out.println("Enter the array:");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }

        location.setMatrix(matrix);
        System.out.printf("The location of the largest element is %1.2f at (%d, %d)", location.getMaxvalue(),
                location.getRow(), location.getColumn());
    }

}

class Location {
    /**
     * Public data fields row, column and max value
     */
    public int row;

    public int column;

    public double maxvalue;

    private int rowMatrix;

    private int columnMatrix;

    private double[][] matrix = new double[rowMatrix][columnMatrix];


    public static Location answer = new Location();

    public static Location locateLargest(double[][] a) {

        double max = 0;
        int row = 0;
        int column = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > max) {
                    max = a[i][j];
                    row = i;
                    column = j;
                }
            }
        }

        answer.setMaxValue(max);
        answer.setRow(row);
        answer.setColumn(column);

        return answer;
    }

    public int getRow() {
        return answer.row;
    }

    public int getColumn() {
        return answer.column;
    }

    public double getMaxvalue() {
        return answer.maxvalue;
    }

    void setRow(int newRow) {
        row = newRow;
    }

    void setColumn(int newColumn) {
        column = newColumn;
    }

    void setMaxValue(double newMaxValue) {
        maxvalue = newMaxValue;
    }

    void setRowMatrix(int newRowMatrix) {
        rowMatrix = newRowMatrix;
    }

    void setColumnMatrix(int newColumnMatrix) {
        column = newColumnMatrix;
    }

    void setMatrix(double[][] newMatrix) {
        matrix = newMatrix;
        locateLargest(matrix);
    }

}
