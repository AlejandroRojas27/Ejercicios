package ProgrammingExercisesCAP8;

import java.util.Scanner;

public class Ejercicio_8_15_GeometrySameLine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[][] points = new double[5][2]; //{{1, 1}, {2, 2}, {3, 3}, {4, 4}, {5, 5}};//{{3.4, 2}, {6.5, 9.5}, {2.3, 2.3}, {5.5, 5}, {-5, 4}};

        System.out.println("Enter five points: ");
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points[i].length; j++) {
                points[i][j] = input.nextDouble();
            }
        }

        if (sameLine(points)) {
            System.out.println("The five points are on the same line");
        } else if (!sameLine(points))
            System.out.println("The five points are not on the same line");

    }

    public static boolean sameLine(double[][] points) {
        boolean test = true;

        double[] max = maxPoint(points);
        double x1 = max[0];
        double y1 = max[0];
        double[] min = minPoint(points, max);
        double x0 = min[0];
        double y0 = min[1];

        double equation = 0;

        for (int i = 0; i < points.length; i++) {
            if (points[i][0] != max[0] && points[i][1] != max[1]
                    && points[i][0] != min[0] && points[i][1] != min[1]) {
                double x2 = points[i][0];
                double y2 = points[i][1];
                equation = (((x1 - x0) * (y2 - y0)) - ((x2 - x0) * (y1 - y0)));

                if (equation != 0) {
                    test = false;
                }
            }
        }


        return test;
    }

    public static double[] maxPoint(double[][] points) {
        double[] max = new double[2];

        for (int i = 0; i < points.length; i++) {
            if (points[i][0] > max[0] && points[i][1] > max[1]) {
                max[0] = points[i][0];
                max[1] = points[i][1];
            }
        }

        return max;
    }

    public static double[] minPoint(double[][] points, double[] max) {
        double[] min = {max[0], max[1]};

        for (int i = 0; i < points.length; i++) {
            if (points[i][0] < min[0] && points[i][1] < min[1]) {
                min[0] = points[i][0];
                min[1] = points[i][1];
            }
        }

        return min;
    }
}
