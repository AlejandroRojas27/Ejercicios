package ProgrammingExercisesCAP8;

import java.util.Scanner;

public class Ejercicio_8_32_GeometryAreaOfATriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter x1, y1, x2, y2, x3, y3: ");
        double[][] points = new double[3][2];
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points[i].length; j++) {
                points[i][j] = input.nextDouble();
            }
        }

        if (Ejercicio_8_15_GeometrySameLine.sameLine(points)) {
            System.out.println("The three points are on the same line");
        } else {
            System.out.printf("\nThe area of the triangle is %2.2f", getTriangleArea(points));
        }


    }

    public static double getTriangleArea(double[][] points) {

        double side1 = Ejercicio_8_21_CentralCity.computeDistance(points[0][0], points[0][1], points[1][0], points[1][1]);
        double side2 = Ejercicio_8_21_CentralCity.computeDistance(points[2][0], points[2][1], points[1][0], points[1][1]);
        double side3 = Ejercicio_8_21_CentralCity.computeDistance(points[0][0], points[0][1], points[2][0], points[2][1]);

        double s = (side1 + side2 + side3) / 2;

        return Math.sqrt((s - side1) * (s - side2) * (s - side3) * s);
    }
}
