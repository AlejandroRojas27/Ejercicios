package ProgrammingExercisesCAP7;

import java.util.Scanner;

public class Ejercicio_7_3_CountOccurrenceOfNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] integers = new int[99];
        System.out.println("Enter the integers between 1 and 100:");
        for (int i = 0; i < integers.length;i++){
            integers[i] = input.nextInt();
            if(integers[i] == 0)
                break;
        }

        java.util.Arrays.sort(integers);

        int[] counts = countIntegers(integers);

        displayCount(counts);
    }

    public static int[] countIntegers(int[] integers){
        int[] count = new int[99];
        for (int i = 0; i < integers.length;i++){
            count[integers[i]]++;
        }

        return count;
    }

    public static void displayCount(int[] counts){
        for (int i = 0;i < counts.length;i++){
            if(counts[i] > 1 && i != 0){
                System.out.println(i + " occurs " + counts[i] + " times");
            } else if (counts[i] == 1) {
                System.out.println(i + " occurs " + counts[i] + " time");
            }
        }
    }


}
