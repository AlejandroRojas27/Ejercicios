package ProgrammingExercisesCAP8;

import java.util.Scanner;

public class Ejercicio_8_34_GeometryRightmostLowestPoint {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[][] points = new double[6][2];
        System.out.printf("Enter %1d points: \n", points.length);

        for (int i = 0; i < points.length; i++) {

            for (int j = 0; j < points[i].length; j++) {

                points[i][j] = input.nextDouble();
            }
        }

        System.out.printf("The rightmost lowest point is (%2.1f, %2.1f)", getRightmostLowestPoint(points)[0], getRightmostLowestPoint(points)[1]);

    }

    public static double[] getRightmostLowestPoint(double[][] points) {
        double min = points[0][1];
        int minIndex = 0;
        double max = 0;

        for (int i = 0; i < points.length; i++) {

            //Lowest point
            if (points[i][1] < min) {
                min = points[i][1];
                minIndex = i;

            }

            //Rightmost point
            max = points[minIndex][0];
            for (int j = 0; j < points.length; j++) {
                if (points[j][0] > max && points[j][1] == min) {
                    max = points[j][0];
                }

            }
        }

        return new double[]{max, min};
    }
}
