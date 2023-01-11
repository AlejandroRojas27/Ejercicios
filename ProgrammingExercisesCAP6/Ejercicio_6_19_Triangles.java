package ProgrammingExercisesCAP6;

import java.util.Scanner;

public class Ejercicio_6_19_Triangles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Lados de un trangulo:");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        System.out.println("The triangle is valid: " + isValid(side1, side2, side3));
        if(!isValid(side1, side2, side3)){
            System.out.println("The triangle is invalid");
            System.exit(1);
        }

        System.out.println("The area is: " + area(side1, side2, side3) );

    }

    public static boolean isValid(double side1, double side2, double side3){
        double sum1 = side1 + side2;
        double sum2 = side1 + side3;
        double sum3 = side2 + side3;
        if (sum1 > side3 && sum2 > side2 && sum3 > side1)
            return true;
        return false;
    }

    public static double area(double side1, double side2, double side3){
        double s = (side1 + side2 + side3) / 2.0;
        double a = Math.pow((s * (s-side1) * (s-side2) * (s-side3)), 0.5);
        return a;

    }

}
