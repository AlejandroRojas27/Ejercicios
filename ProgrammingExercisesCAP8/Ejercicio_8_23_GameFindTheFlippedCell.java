package ProgrammingExercisesCAP8;

import java.util.Scanner;

public class Ejercicio_8_23_GameFindTheFlippedCell {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] matrix = new int[6][6];

        System.out.println("Enter numbers 0 and 1: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input.nextInt();
            }
        }

        /*
        int[][] matrix = {
                {1, 1, 0, 0, 1, 1},
                {1, 1, 1, 1, 1, 0},
                {0, 1, 0, 1, 1, 1},
                {1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1},
                {0, 0, 1, 0, 1, 0}
        };

         */

        int rowIndex = 0;
        int columnIndex = 0;


        //Print the matrix
        Ejercicio_8_18_ShuffleRows.printTwoDimensionArrayInt(matrix);

        //Check rows
        for (int i = 0; i < matrix.length; i++) {
            int sum = Ejercicio_8_22_EvenNumberOf1s.checkRow(matrix, i);
            if (!Ejercicio_8_22_EvenNumberOf1s.isEven(sum)) {
                rowIndex = i;
                sum = 0;
                //Check columns
                for (int j = 0; j < matrix[i].length; j++) {
                    sum = Ejercicio_8_22_EvenNumberOf1s.checkColumn(matrix, j);
                    if (!Ejercicio_8_22_EvenNumberOf1s.isEven(sum)) {
                        columnIndex = j;
                        break;
                    }


                }
                break;
            }
        }

        //Answer
        System.out.printf("\nThe flipped cell is at ( %1d, %1d )\n", rowIndex, columnIndex);

    }
}
