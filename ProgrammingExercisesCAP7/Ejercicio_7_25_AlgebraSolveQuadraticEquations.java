package ProgrammingExercisesCAP7;

import java.util.Scanner;

public class Ejercicio_7_25_AlgebraSolveQuadraticEquations {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double[] eqn = new double[3];
        System.out.println("Enter the values for ax2 + bx + c = 0");
        for (int i = 0; i < eqn.length;i++){
            if(i == 0){
                System.out.print("a: ");
            }
            else if (i == 1) {
                System.out.print("b: ");
            }
            else if (i == 2) {
                System.out.print("c: ");
            }
            eqn[i] = input.nextInt();
        }

        double[] roots = new double[2];

        if(solveQuadratic(eqn, roots) == 2){
            System.out.println("The equation has two real roots: " + roots[0] + " ," + roots[1]);
        }
        else if (solveQuadratic(eqn, roots) == 1){
            System.out.println("The equation has one real roots: " + roots[0]);
        }
        else if (solveQuadratic(eqn, roots) == 0){
            System.out.println("The equation has no real roots");
        }
    }

    public static int solveQuadratic(double[] eqn, double[] roots){
        int numberOfRealRoots =0;
        double discriminante = eqn[1] * eqn[1] - 4 * eqn[0] * eqn[2];

        roots[0] = ((-eqn[1] + Math.pow(discriminante, 0.5)) / (2 * eqn[0]));
        roots[1] = ((-eqn[1] - Math.pow(discriminante, 0.5)) / (2 * eqn[0]));

        if ((discriminante) > 0)
            numberOfRealRoots = 2;
        else if ((discriminante) == 0)
            numberOfRealRoots = 1;
        else
            numberOfRealRoots = 0;

        return numberOfRealRoots;
    }
}
