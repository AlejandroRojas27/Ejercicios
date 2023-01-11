package ProgrammingExercisesCAP7;

import java.util.Scanner;

public class Ejercicio_7_10_FindTheIndexOfTheSmallestElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] data = new double[10];

        System.out.println("Enter the values: ");

        for (int i = 0; i < data.length; i++){
            data[i] = input.nextDouble();
        }

        for (int i = 0; i < data.length; i++){
            if(data[i] < 1){
                System.out.println(data[i] + " Less than 1");
                break;
            }
        }

        System.out.println("The index of the smallest value is: " + indexOfTheSmallestElement(data));
    }

    public static int indexOfTheSmallestElement(double[] array){
        int index = 0;
        double min = array[0];
        for (int i = 0; i < array.length; i++){
            if(min > array[i]){
                min = array[i];
                index = i;
            }
        }

        return index;
    }
}
