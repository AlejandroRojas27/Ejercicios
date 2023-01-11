package ProgrammingExercisesCAP6;

import java.util.Scanner;

public class Ejercicio_6_35_GeometryAreaOfAPentagon {
    public static void main(String[] args) {
        Scanner sipi = new Scanner(System.in);
        System.out.print("Enter the side: ");
        double side = sipi.nextDouble();
        System.out.println("The area of the pentagon is " + area(side));
    }

    public static double area(double side){
        double area = (5 * Math.pow(side,2)) / (4 * (Math.tan(Math.PI / 5)));
        return area;
    }
}
