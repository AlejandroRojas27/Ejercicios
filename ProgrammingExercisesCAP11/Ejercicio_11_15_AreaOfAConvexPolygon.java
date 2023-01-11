package ProgrammingExercisesCAP11;


import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio_11_15_AreaOfAConvexPolygon {
    public static void main(String[] args) {
        ArrayList<Point2D> points = new ArrayList<>();
        Scanner input = new Scanner(System.in);


        /*
        Point2D p1 = new Point2D.Double(-12,0);
        Point2D p2 = new Point2D.Double(-8.5,10);
        Point2D p3 = new Point2D.Double(0,11.4);
        Point2D p4 = new Point2D.Double(5.5,7.8);
        Point2D p5 = new Point2D.Double(6,-5.5);
        Point2D p6 = new Point2D.Double(0,-7);
        Point2D p7 = new Point2D.Double(-3.5,-5.5);
        points.add(p1);
        points.add(p2);
        points.add(p3);
        points.add(p4);
        points.add(p5);
        points.add(p6);
        points.add(p7);

         */




        int num = 7;
        System.out.print("Enter the coordinates of the points: ");
        for (int i = 0; i < num; i++) {
            double x = input.nextDouble();
            double y = input.nextDouble();
            points.add(new Point2D.Double(x,y));

        }



        points.add(points.get(0));

        double sum1 = 0;
        double sum2 = 0;

        for (int i = 1; i < points.size(); i++) {
            Point2D point2D1 = points.get(i-1);
            Point2D point2D2 = points.get(i);
            sum1 += point2D1.getX() * point2D2.getY();
            sum2 += point2D1.getY() * point2D2.getX();
        }

        double area = Math.abs((sum1 - sum2) / 2);

        System.out.println("The total area is " + area);

    }
}
