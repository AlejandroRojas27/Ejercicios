package ProgrammingExercisesCAP8;

import java.util.Scanner;

public class Ejercicio_8_19_PatternRecognitionFourConsecutiveEqualNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter rows: ");
        int rows = input.nextInt();
        System.out.println("Enter columns: ");
        int columns = input.nextInt();

        int[][] matrix = new int[rows][columns];
        System.out.println("Enter values for the matrix: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input.nextInt();
            }
        }

        if (isConsecutiveFour(matrix)) {
            System.out.print("Has four consecutive numbers of the same value");
        } else if (!isConsecutiveFour(matrix)) {
            System.out.print("Has no four consecutive numbers of the same value");
        }


    }

    public static boolean isConsecutiveFour(int[][] values) {

        //columns
        boolean testColumns = false;
        for (int i = 0; i < values.length; i++) {

            for (int x = 0; x < values[i].length; x++) {

                int count = 0;
                int check = values[i][x];

                for (int j = i; j < values.length; j++) {

                    if (values[j][x] == check) {
                        count++;
                        if (count >= 4) {
                            testColumns = true;
                            break;
                        }
                    } else if (values[j][x] != check) {
                        count = 0;
                    }

                }

            }

            if (i >= (values.length - 4)) {
                break;
            }

        }


        //rows
        boolean testRow = false;

        for (int i = 0; i < values.length; i++) {

            for (int x = 0; x < values[i].length; x++) {

                int count = 0;
                int check = values[i][x];

                for (int j = x; j < values.length; j++) {

                    if (values[i][j] == check) {
                        count++;
                        if (count >= 4) {
                            testRow = true;
                            break;
                        }
                    } else if (values[i][j] != check) {
                        count = 0;
                    }

                }

                if (x >= (values.length - 4)) {
                    break;
                }

            }

        }

        //diagonal left to right
        boolean testDiagonalLeftToRight = false;

        for (int i = 0; i < values.length; i++) {


            for (int j = 0; j < values[i].length; j++) {
                int count = 0;

                int check = values[i][j];

                for (int k = i, l = j; l < values.length && k < values.length; k++, l++) {


                    if (check == values[k][l]) {
                        count++;
                        if (count >= 4) {
                            testDiagonalLeftToRight = true;
                            break;
                        }
                    } else if (check != values[k][l]) {
                        count = 0;

                    }
                }


            }

        }

        //diagonal right to left
        boolean testDiagonalRightToLeft = false;

        for (int i = 0; i < (values.length - 4 + 1); i++) {


            for (int j = 0; j < values[i].length; j++) {
                int count = 0;

                int check = values[i][j];

                for (int k = i, l = j; l >= 0 && k < values.length; k++, l--) {

                    if (check == values[k][l]) {
                        count++;
                        if (count >= 4) {
                            testDiagonalRightToLeft = true;
                            break;
                        }
                    } else if (check != values[k][l]) {
                        count = 0;
                    }

                }

            }

        }

        if (testColumns || testRow || testDiagonalLeftToRight || testDiagonalRightToLeft) {
            return true;
        } else
            return false;

    }
}
