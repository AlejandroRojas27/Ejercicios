package ProgrammingExercisesCAP8;

import java.util.Scanner;

public class Ejercicio_8_24_CheckSudokuSolution {
    public static void main(String[] args) {
        //Read a Sudoku solution
        int[][] grid = readASolution();

        System.out.println(isValid(grid) ? "Valid solution" : "Invalid solution");
    }

    /**
     * Read a Sudoku solution from the console
     */
    public static int[][] readASolution() {
        //Create a Scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Sudoku puzzle solution: ");
        int[][] grid = {
                {9, 6, 3, 1, 7, 4, 2, 5, 8},
                {1, 7, 8, 3, 2, 5, 6, 4, 9},
                {2, 5, 4, 6, 8, 9, 7, 3, 1},
                {8, 2, 1, 4, 3, 7, 5, 9, 6},
                {4, 9, 6, 8, 5, 2, 3, 1, 7},
                {7, 3, 5, 9, 6, 1, 8, 2, 4},
                {5, 8, 9, 7, 1, 3, 4, 6, 2},
                {3, 1, 7, 2, 4, 6, 9, 8, 5},
                {6, 4, 2, 5, 9, 8, 1, 7, 3}
        };// new int[9][9];



        return grid;
    }

    /**
     * Check whether a solution is valid
     */
    public static boolean isValid(int[][] grid) {
        for (int i = 0; i < 9; i++)
            for (int j = 0; j < 9; j++)
                if (grid[i][j] < 1 || grid[i][j] > 9
                        || !isValid(i, j, grid))
                    return false;
        return true;
    }

    /**
     * Check whether grid[i][j] is valid in the grid
     */
    public static boolean isValid(int i, int j, int[][] grid) {
        boolean test = true;

        int sum1To9 = 0;
        int mult1To9 = 1;
        for (int k = 1; k <= 9; k++) {
            sum1To9 += k;
            mult1To9 *= k;
        }


        //Check row
        int sumRow = 0;
        int multRow = 1;
        for (int row = 0; row < grid.length; row++) {
            sumRow += grid[i][row];
            multRow *= grid[i][row];
        }
        if (sumRow != sum1To9 && multRow != mult1To9) {
            test = false;
        }

        //Check column
        int sumColumn = 0;
        int multColumn = 1;
        for (int column = 0; column < grid[0].length; column++) {
            sumColumn += grid[j][column];
            multColumn *= grid[j][column];
        }
        if (sumColumn != sum1To9 && multColumn != mult1To9) {
            test = false;
        }

        //Check whether grid[i][j] is unique in the 3-by-3 box
        int sumBox = 0;
        int multBox =1;
        for (int row = (i / 3) * 3; row < (i / 3) * 3 + 3; row++) {
            for (int col = (j / 3) * 3; col < (j / 3) * 3 + 3; col++) {
                sumBox += grid[row][col];
                multBox *= grid[row][col];
            }
        }
        if (sumBox != sum1To9 && multBox != mult1To9) {
            test = false;
        }



        return test; //The current value at grid[i][j] is valid
    }
}
