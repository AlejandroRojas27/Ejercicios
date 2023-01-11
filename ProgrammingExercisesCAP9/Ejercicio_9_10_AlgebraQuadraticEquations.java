package ProgrammingExercisesCAP9;

import java.util.Scanner;

public class Ejercicio_9_10_AlgebraQuadraticEquations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();


        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);

        if (quadraticEquation.getDiscriminant() > 0) {
            System.out.println("Root 1: " + quadraticEquation.getRoo1());
            System.out.println("Root 2: " + quadraticEquation.getRoo2());
        } else if (quadraticEquation.getDiscriminant() == 0) {
            System.out.println("Root : " + quadraticEquation.getRoo1());

        } else if (quadraticEquation.getDiscriminant() < 0) {
            System.out.println("The equation has no roots.");
        }
    }
}

class QuadraticEquation {

    /**
     * Private data fields a, b, and c that represent three coefficients.
     */
    private double a;

    private double b;

    private double c;

    /**
     * A constructor with the arguments for a, b, and c.
     */
    public QuadraticEquation(double newA, double newB, double newC) {
        a = newA;
        b = newB;
        c = newC;
    }

    /**
     * Three getter methods for a, b, and c.
     */
    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    /**
     * A method named getDiscriminant() that returns the discriminant, which is b2 - 4ac
     */
    public double getDiscriminant() {
        return (b * b) - (4 * a * c);
    }

    /**
     * The methods named getRoot1() and getRoot2() for returning two roots of the equation.
     */
    public double getRoo1() {
        return ((-b + Math.sqrt((b * b) - (4 * a * c))) / (2 * a));
    }

    public double getRoo2() {
        return ((-b - Math.sqrt((b * b) - (4 * a * c))) / (2 * a));
    }

}
