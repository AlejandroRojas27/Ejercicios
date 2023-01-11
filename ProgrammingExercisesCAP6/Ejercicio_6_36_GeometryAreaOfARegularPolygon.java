package ProgrammingExercisesCAP6;

import java.util.Scanner;

public class Ejercicio_6_36_GeometryAreaOfARegularPolygon {
    public static void main(String[] args) {
        Scanner memes = new Scanner(System.in);
        System.out.print("Enter the number of sides: ");
        int n  = memes.nextInt();
        System.out.print("Enter the side: ");
        double side = memes.nextDouble();

        System.out.println("The area of the polygon is " + area(n, side));
    }

    public static double area(int n, double side){
        double area = (n * Math.pow(side,2)) / (4 * (Math.tan(Math.PI / n)));
        return area;
    }
}
