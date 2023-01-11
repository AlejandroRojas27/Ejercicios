package ProgrammingExercisesCAP8;

import java.util.Scanner;

public class Ejercicio_8_31_GeometryIntersectingPoint {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        double[][] points = new double[4][2];
        System.out.println("Enter points");
        for (int i = 0; i < points.length; i++) {
            System.out.printf("(x%1d, y%1d)\n", (i+1), (i+1));
            for (int j = 0; j < points[i].length; j++) {
                points[i][j] = input.nextDouble();
            }
        }




        double[] answer = getIntersectingPoint(points);

        if (answer == null) {
            System.out.println("The two lines are parallel");
        } else {
            System.out.printf("\nThe intersecting point is at ( %2.5f, %2.5f )", answer[0], answer[1]);
        }

    }

    public static double[] getIntersectingPoint(double[][] points) {

        double x1 = points[0][0];
        double y1 = points[0][1];

        double x2 = points[1][0];
        double y2 = points[1][1];

        double x3 = points[2][0];
        double y3 = points[2][1];

        double x4 = points[3][0];
        double y4 = points[3][1];

        double[][] a = new double[2][2];
        a[0][0] = (y1 - y2);
        a[0][1] = (x1 - x2) * -1;

        a[1][0] = (y3 - y4);
        a[1][1] = (x3 - x4) * -1;


        double[] b = new double[2];
        b[0] = ((y1 - y2) * x1) - ((x1 - x2) * y1);
        b[1] = ((y3 - y4) * x3) - ((x3 - x4) * y3);


        return Ejercicio_8_30_AlgebraSolveLinearEquations.linearEquation(a,b);
    }
}
