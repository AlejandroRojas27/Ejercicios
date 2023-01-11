package ProgrammingExercisesCAP11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio_11_9_LargestRowsAndColumns {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the array size n: ");
        int dim = input.nextInt();

        int[][] array = new int[dim][dim];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length ; j++) {
                array[i][j] = (int) (Math.random() * 2);
            }
        }


        System.out.println("The random array is ");

        printArray(array);

        System.out.println("The largest row index: " + largestRowIndex(array));
        System.out.println("The largest column index: " + largestColumnIndex(array));


    }

    public static void printArray(int[][] array) {

        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.print(anInt);
            }
            System.out.println(" ");
        }

    }

    public static ArrayList<Integer> largestRowIndex(int[][] array) {
        ArrayList<Integer> rowIndex = new ArrayList<>();
        ArrayList<Integer> sumRow = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
            sumRow.add(sum);
        }

        int maxRowValue = Collections.max(sumRow);

        for (int i = 0; i < array.length; i++) {
            if (sumRow.get(i) == maxRowValue) {
                rowIndex.add(i);
            }
        }


        return rowIndex;
    }

    public static ArrayList<Integer> largestColumnIndex(int[][] array) {
        ArrayList<Integer> columnIndex = new ArrayList<>();
        ArrayList<Integer> sumColumn = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = 0; j < array[i].length; j++) {
                sum += array[j][i];
            }
            sumColumn.add(sum);
        }


        int maxRowValue = Collections.max(sumColumn);

        for (int i = 0; i < array.length; i++) {
            if (sumColumn.get(i) == maxRowValue) {
                columnIndex.add(i);
            }
        }


        return columnIndex;

    }
}
