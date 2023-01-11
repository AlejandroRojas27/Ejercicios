package ProgrammingExercisesCAP8;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio_8_14_ExploreMatrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size for the matrix: ");
        int size = input.nextInt();

        //Create and initialize matrix
        int[][] matrix = new int[size][size];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 2);
            }

        }

        //Print matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(" ");
        }


        testRows(matrix);

        testColumns(matrix);

        testDiagonals(matrix);

    }

    public static void testRows(int[][] m) {
        int print = 0;
        for (int i = 0; i < m.length; i++) {
            int count0 = 0;
            int count1 = 0;

            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] == 0) {
                    count0++;
                } else if (m[i][j] == 1) {
                    count1++;
                }
            }

            if (count0 == m.length) {
                System.out.println("All 0's on row " + (i + 1));
                print++;
            }
            if (count1 == m.length) {
                System.out.println("All 1's on row " + (i + 1));
                print++;
            }
            if (i == m.length - 1 && print == 0) {
                System.out.println("No same numbers on a row");
            }

        }

    }

    public static void testColumns(int[][] m) {
        int print = 0;
        for (int i = 0; i < m.length; i++) {
            int count0 = 0;
            int count1 = 0;
            for (int j = 0; j < m.length; j++) {
                if (m[j][i] == 0) {
                    count0++;
                } else if (m[j][i] == 1) {
                    count1++;
                }
            }
            if (count0 == m.length) {
                System.out.println("All 0's on column " + (i + 1));
                print++;
            } else if (count1 == m.length) {
                System.out.println("All 1's on column " + (i + 1));
                print++;
            }
            if (i == m.length - 1 && print == 0) {
                System.out.println("No same numbers on a column");
            }

        }
    }

    public static void testDiagonals(int[][] m) {
        //Major diagonal
        int count0 = 0;
        int count1 = 0;

        for (int i = 0; i < m.length; i++) {
            for (int j = i; j <= i; j++) {
                if (m[i][j] == 0) {
                    count0++;
                }
                if (m[i][j] == 1) {
                    count1++;
                }
            }
            if (count0 == m.length) {
                System.out.println("All 0's on the major diagonal");
                break;
            }
            if (count1 == m.length) {
                System.out.println("All 1's on the major diagonal");
                break;
            }
            if (i == m.length - 1) {
                System.out.println("No same numbers on the major diagonal");
            }

        }


        //Sub-diagonal
        count0 = 0;
        count1 = 0;

        for (int i = 0, k = m.length - 1; i < m.length; i++, k--) {
            for (int j = i; j <= i; j++) {
                if (m[i][k] == 0) {
                    count0++;
                }
                if (m[i][k] == 1) {
                    count1++;
                }
            }
            if (count0 == m.length) {
                System.out.println("All 0's on the sub−diagonal");
                break;
            }
            if (count1 == m.length) {
                System.out.println("All 1's on the sub−diagonal");
                break;
            }
            if (i == m.length - 1) {
                System.out.println("No same numbers on the sub−diagonal");
            }
        }


    }
}
