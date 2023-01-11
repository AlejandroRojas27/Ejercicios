package ProgrammingExercisesCAP8;

import java.util.Scanner;

public class Ejercicio_8_33_GeometryPolygonSubareas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");

        double[][] points = new double[4][2];
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points[i].length; j++) {
                points[i][j] = input.nextDouble();
            }
        }

        double[][] toCompute = new double[points.length][points[0].length];
        for (int i = 0; i < points.length; i++) {

            for (int j = 0; j < points[i].length; j++) {
                if (i == 1) {
                    toCompute[1][j] = points[2][j];
                } else if (i == 2) {
                    toCompute[2][j] = points[1][j];
                } else {
                    toCompute[i][j] = points[i][j];
                }
            }
        }
        double[] intersection = Ejercicio_8_31_GeometryIntersectingPoint.getIntersectingPoint(toCompute);


        double[][] a = new double[3][2];

        System.out.print("The areas are ");
        for (int i = 0; i < points.length; i++) {

            if (i == points.length - 1) {
                a[0][0] = points[0][0];
                a[0][1] = points[0][1];

                a[1][0] = points[i][0];
                a[1][1] = points[i][1];

            } else {

                a[0][0] = points[i][0];
                a[0][1] = points[i][1];

                a[1][0] = points[i + 1][0];
                a[1][1] = points[i + 1][1];

            }

            a[2][0] = intersection[0];
            a[2][1] = intersection[1];

            System.out.printf("%2.2f ", Ejercicio_8_32_GeometryAreaOfATriangle.getTriangleArea(a));

        }


    }
}
