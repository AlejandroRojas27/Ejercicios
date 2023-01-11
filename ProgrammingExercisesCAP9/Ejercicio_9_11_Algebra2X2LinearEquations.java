package ProgrammingExercisesCAP9;

import java.util.Scanner;

public class Ejercicio_9_11_Algebra2X2LinearEquations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("a: ");
        double a = input.nextDouble();
        System.out.println("b: ");
        double b = input.nextDouble();
        System.out.println("c: ");
        double c = input.nextDouble();
        System.out.println("d: ");
        double d = input.nextDouble();
        System.out.println("e: ");
        double e = input.nextDouble();
        System.out.println("f: ");
        double f = input.nextDouble();

        LinearEquation linearEquation = new LinearEquation(a,b,c,d,e,f);

        if(linearEquation.haveSolution()){
            System.out.println("x is " + linearEquation.getX() + " and y is " + linearEquation.getY());
        } else if (!linearEquation.haveSolution()) {
            System.out.println("The equation has no solution");
        }

    }
}

class LinearEquation {

    /**
     * Private data fields a, b, c, d, e, and f.
     */
    private final double a;
    private final double b;
    private final double c;
    private final double d;
    private final double e;
    private final double f;

    /**
     * A constructor with the arguments for a, b, c, d, e, and f.
     */
    public LinearEquation(double newA, double newB, double newC, double newD, double newE, double newF) {
        a = newA;
        b = newB;
        c = newC;
        d = newD;
        e = newE;
        f = newF;
    }

    /**
     * Six getter methods for a, b, c, d, e, and f.
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

    public double getD() {
        return d;
    }

    public double getE() {
        return e;
    }

    public double getF() {
        return f;
    }

    /**Methods getX() and getY() that return the solution for the equation. */
    public double getX(){
        return (((e * d) - (b * f)) / ((a * d) - (b * c)));
    }

    public double getY(){
        return (((a * f) - (e * c)) / ((a * d) - (b * c)));
    }

    /**The equation have solution */
    public boolean haveSolution(){
        return ((a * d) - (b * c)) != 0;
    }
}
