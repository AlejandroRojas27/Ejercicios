package ProgrammingExercisesCAP9;

import java.util.Scanner;

public class Ejercicio_9_12_GeometryIntersectingPoint {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("First line segment are: ");
        System.out.println("x1: ");
        double x1 = input.nextInt();
        System.out.println("y1: ");
        double y1 = input.nextInt();;
        System.out.println("x2: ");
        double x2 = input.nextInt();;
        System.out.println("y2: ");
        double y2 = input.nextInt();;

        System.out.println("Second line segment are: ");
        System.out.println("x3: ");
        double x3 = input.nextInt();;
        System.out.println("y3: ");
        double y3 = input.nextInt();;
        System.out.println("x4: ");
        double x4 = input.nextInt();;
        System.out.println("y4: ");
        double y4 = input.nextInt();;

        double a = (y1 - y2);
        double b = (x1 - x2);
        double c = (y3 - y4);
        double d = (x3 - x4);
        double e = (((y1 - y2) * x1) - ((x1 - x2) * y1));
        double f = (((y3 - y4) * x3) - ((x3 - x4) * y3));

        LinearEquation linearEquation = new LinearEquation(a,b,c,d,e,f);

        if(linearEquation.haveSolution()){
            System.out.printf("The intersecting point is at (%1.5f, %1.5f)", linearEquation.getX(), linearEquation.getY());
        } else if (!linearEquation.haveSolution()) {
            System.out.println("The two lines are parallel");
        }


    }
}


