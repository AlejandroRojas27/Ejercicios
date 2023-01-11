package ProgrammingExercisesCAP8;

import java.util.Scanner;

public class Ejercicio_8_30_AlgebraSolveLinearEquations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter values");

        double[][] a = new double[2][2];
        double[] b = new double[2];

                System.out.print("a00: ");
        a[0][0] = input.nextDouble();

        System.out.print("a01: ");
        a[0][1] = input.nextDouble();

        System.out.print("a10: ");
        a[1][0] = input.nextDouble();

        System.out.print("a11: ");
        a[1][1] = input.nextDouble();

        System.out.print("b0: ");
        b[0] = input.nextDouble();

        System.out.print("b1: ");
        b[1] = input.nextDouble();

        /*
        double[][] a = {
                {5,2},
                {-3,3}};

         */

        //double[] b = {0, 0};

        double[] answer = linearEquation(a, b);

        if(answer[0] == 0 && answer[1] == 0 ){
            System.out.println("The equation has no solution.");
        }
        else {
          System.out.println("Solution: " + java.util.Arrays.toString(answer));
        }


    }

    public static double[] linearEquation(double[][] a, double[]b){
        double[] answer = new double[2];

        double dividend = (a[0][0] * a[1][1]) - (a[0][1] * a[1][0]);

        answer[0] = (((b[0]*a[1][1]) - (b[1]*a[0][1])) / dividend);
        answer[1] = (((b[1]*a[0][0]) - (b[0]*a[1][0])) / dividend);

        if(dividend == 0)
            answer = null;


        return answer;
    }
}
