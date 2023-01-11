package ProgrammingExercisesCAP7;

import java.util.Scanner;

public class Ejercicio_7_8_AverageAnArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[3];
        System.out.println("Enter values: ");
        for (int i = 0; i < array.length;i++){
            array[i] = input.nextInt();
        }
        average(array);
        System.out.println("Average is: " + average(array));

        double[] arrayD = new double[3];
        System.out.println("Enter values: ");
        for (int i = 0; i < array.length;i++){
            arrayD[i] = input.nextDouble();
        }
        average(arrayD);
        System.out.println("Average is: " + average(arrayD));

    }

    public static double average(int[] array){
        double average = 0;
        double sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        average = sum / array.length;


        return average;
    }

    public static double average(double[] array){
        double average = 0;
        double sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        average = sum / array.length;


        return average;
    }
}
