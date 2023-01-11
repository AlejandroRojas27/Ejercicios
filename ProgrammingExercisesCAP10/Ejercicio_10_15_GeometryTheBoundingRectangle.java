package ProgrammingExercisesCAP10;

import java.util.Scanner;

public class Ejercicio_10_15_GeometryTheBoundingRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[][] points = new double[5][2];

        System.out.println("Enter five points:");
        for (int i = 0; i < points.length; i++) {

            for (int j = 0; j < points[i].length; j++) {

                points[i][j] = input.nextDouble();
            }
        }


        MyRectangle2D r = getRectangle(points);

        System.out.printf("The bounding rectangle's center : (%.2f, %.2f), width %.1f, height %.2f",
                r.getX(), r.getY(), r.getWidth(), r.getHeight());


    }


    public static MyRectangle2D getRectangle(double[][] points) {
        MyRectangle2D r1 = new MyRectangle2D();

        r1.setWidth(dimensions(points)[0]);
        r1.setHeight(dimensions(points)[1]);


        MyPoint center = findCenter(dimensions(points), findTopRight(points));

        r1.setX(center.getX());
        r1.setY(center.getY());


        return r1;
    }

    public static double[] dimensions(double[][] points) {

        double maxX = 0;
        double maxY = 0;
        for (int i = 0; i < points.length; i++) {
            if (points[i][0] > maxX) {
                maxX = points[i][0];
            }

            if (points[i][1] > maxY) {
                maxY = points[i][1];
            }


        }

        double minX = points[0][0];
        double minY = points[0][1];
        for (int i = 0; i < points.length; i++) {
            if (points[i][0] < minX) {
                minX = points[i][0];
            }

            if (points[i][1] < minY) {
                minY = points[i][1];
            }
        }


        double width = maxX - minX;
        double height = maxY - minY;

        return new double[]{width, height};
    }

    public static MyPoint findCenter(double[] dimensions, MyPoint topRight) {
        double width = dimensions[0];
        double height = dimensions[1];

        double centerX = topRight.getX() - (width / 2);
        double centerY = topRight.getY() - (height / 2);

        return new MyPoint(centerX, centerY);
    }

    public static MyPoint findTopRight(double[][] points) {

        double maxY = points[0][1];
        int maxIndexY = 0;
        double maxX = 0;

        for (int i = 0; i < points.length; i++) {

            if (points[i][1] > maxY) {
                maxY = points[i][1];
                maxIndexY = i;
            }

            maxX = points[maxIndexY][0];
            for (int j = 0; j < points.length; j++) {
                if (points[j][0] < maxX && points[j][1] == maxY) {
                    maxX = points[j][0];
                }
            }
        }

        return new MyPoint(maxX, maxY);
    }


}
