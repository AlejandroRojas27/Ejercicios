package ProgrammingExercisesCAP8;

import java.util.Scanner;

public class Ejercicio_8_36_LatinSquare {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number n: ");
        int n = input.nextInt();

        char[][] matrix = new char[n][n];
        long sum = 0;
        long mult = 1;
        char chTo = (char) ('A' + n - 1);

        for (int i = 'A', j = 0; j < matrix.length; i++, j++) {
            sum += i;
            mult *= i;
        }


        System.out.printf("Enter %1d rows of letters separated by spaces:\n", n);
        for (int i = 0; i < matrix.length; i++) {
            int sumInput = 0;
            int multInput = 1;

            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input.next().charAt(0);
                sumInput += matrix[i][j];
                multInput *= matrix[i][j];
            }

            if (sum != sumInput && mult != multInput) {
                System.out.printf("Wrong input: the letters must be from A To %c\n", chTo);
                break;
            }

        }


        int[][] charsToIntegers = new int[n][n];


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                charsToIntegers[i][j] = matrix[i][j];
            }
        }


        if (isLatinSquare(charsToIntegers)) {
            System.out.println("The input array is a Latin square");
        } else {
            System.out.println("The input array is not a Latin square");
        }


    }

    public static boolean isLatinSquare(int[][] m) {

        long sum = 0;
        long mult = 1;
        for (int i = 'A', j = 0; j < m.length; i++, j++) {
            sum += i;
            mult *= i;
        }


        //Check Row
        boolean row = true;

        for (int i = 0; i < m.length; i++) {
            long sumRow = 0;
            long multRow = 1;

            for (int j = 0; j < m[i].length; j++) {
                sumRow += m[i][j];
                multRow *= m[i][j];
            }

            if (sum != sumRow && mult != multRow) {
                row = false;
                break;
            }

        }

        //Check Column
        boolean column = true;

        for (int i = 0; i < m.length; i++) {
            int sumColumn = 0;
            int multColumn = 1;

            for (int j = 0; j < m[i].length; j++) {
                sumColumn += m[j][i];
                multColumn *= m[j][i];
            }

            if (sum != sumColumn && mult != multColumn) {
                column = false;
                break;
            }

        }


        if (row && column)
            return true;
        else
            return false;
    }
}
