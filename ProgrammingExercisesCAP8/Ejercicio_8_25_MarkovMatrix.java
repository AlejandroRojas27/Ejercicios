package ProgrammingExercisesCAP8;

import java.util.Scanner;

public class Ejercicio_8_25_MarkovMatrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[][] matrix = new double[3][3];

        System.out.println("Enter a 3−by−3 matrix row by row: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }

        if (isMarkovMatrix(matrix)) {
            System.out.println("It is a Markov matrix");
        } else if (!isMarkovMatrix(matrix)) {
            System.out.println("It is not a Markov matrix");
        }

    }

    public static boolean isMarkovMatrix(double[][] m) {
        boolean equalTo1 = true;
        boolean positive = true;

        for (int i = 0; i < m.length; i++) {
            if (Ejercicio_8_1_SumElementsColumnByColumn.sumColumn(m, i) != 1) {
                equalTo1 = false;
                break;
            }

        }

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] < 0) {
                    positive = false;
                    break;
                }
            }
        }

        return equalTo1 && positive;
    }
}
