package ProgrammingExercisesCAP7;

import java.util.Scanner;

public class Ejercicio_7_11_StatisticsComputeDeviation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 10 numbers: ");
        double[] numbers = new double[10];
        for (int i = 0 ;i < numbers.length; i++){
            numbers[i] = input.nextDouble();
        }


        double meanAnswer = mean(numbers);
        System.out.printf("The mean is  %1.2f \n" , meanAnswer);

        double standardDeviation = deviation(numbers);
        System.out.printf("The standard derivation is  %1.5f" , standardDeviation);


    }

    public static double mean(double[] x){
        double mean = 0;
        double sum = 0;

        for (int i = 0;i<x.length;i++){
            sum+=x[i];
        }

        mean = sum / x.length;

        return mean;
    }

    public static double deviation(double[] x){
        double deviation = 0;
        /** Mean */
        double mean = 0;
        double sum = 0;
        for (int i = 0;i<x.length;i++){
            sum+=x[i];
        }

        mean = sum / x.length;

        /**Deviation */
        double sumD = 0;
        for (int i = 0;i<x.length;i++){
            sumD+=Math.pow((x[i] - mean),2);
        }

        deviation = Math.sqrt(sumD / (x.length -1));

        return deviation;
    }
}
