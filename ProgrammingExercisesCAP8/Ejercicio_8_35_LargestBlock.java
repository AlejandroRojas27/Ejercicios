package ProgrammingExercisesCAP8;

import java.util.Scanner;

public class Ejercicio_8_35_LargestBlock {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of rows in the matrix:");
        int rows = input.nextInt();
        int[][] matrix = new int[rows][5];

        System.out.println("Enter the matrix row by row: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input.nextInt();
            }
        }

        System.out.printf("\nThe maximum square sub-matrix is at (%1d, %1d) with size %1d", findLargestBlock(matrix)[0], findLargestBlock(matrix)[1], findLargestBlock(matrix)[2]);

    }

    public static int[] findLargestBlock(int[][] m) {

        int count = 0;
        int maxCount = 0;
        int row = 0;
        int occurrences = 0;
        boolean bl = false;
        int[] answer = new int[3];

        for (int i = 0, a = m.length; i < m.length; i++, a--) {
            count = 0;

            for (int j = 0; j < m[i].length; j++) {

                if (m[i][j] == 1) {
                    count++;

                    if (maxCount < count && count <= a) {
                        maxCount = count;
                        row = i;
                    }

                } else {
                    count = 0;
                }

            }

        }


        for (int x = m.length, y = maxCount; x > 0; x--, y--) {

            occurrences = 0;

            for (int i = 0; i <= y; i++) {

                if (m[row][i] == 0) {
                    occurrences = 0;
                }

                if (m[row][i] == 1) {

                    for (int j = row; j < x; j++) {

                        if (m[j][i] == 0) {
                            occurrences = 0;
                            break;
                        }
                        if (m[j][i] == 1) {
                            occurrences++;
                        }


                        if (occurrences == (y * y) && occurrences > 1) {
                            answer[0] = row;
                            answer[1] = (i - y + 1);
                            answer[2] = y;

                            bl = true;
                            break;
                        }

                    }

                }


            }

            if (bl) {
                break;
            }
        }

        return answer;
    }
}
