package ProgrammingExercisesCAP7;

import java.util.Scanner;

public class Ejercicio_7_9_FindTheSmallestElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] array = new double[10];
        System.out.println("Enter values: ");

        for (int i = 0; i < array.length; i++){
            array[i] = input.nextDouble();
        }

        System.out.println("The minimum number is " + min(array));
    }

    public static double min(double[] array){
        double min = array[0];
        for (int i = 0; i < array.length; i++){
            if (min > array[i])
                min = array[i];
        }

        return min;
    }
}
