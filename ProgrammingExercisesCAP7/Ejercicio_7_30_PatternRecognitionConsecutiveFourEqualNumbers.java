package ProgrammingExercisesCAP7;

import java.util.Scanner;

public class Ejercicio_7_30_PatternRecognitionConsecutiveFourEqualNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of values: ");
        int number = input.nextInt();

        int[] values = new int[number];
        System.out.print("Enter the values: ");
        for (int i = 0; i < values.length;i++){
            values[i] = input.nextInt();
        }

        if(number >=4) {

            if (isConsecutiveFour(values)) {
                System.out.println("The list has consecutive fours");
            } else if (!isConsecutiveFour(values)) {
                System.out.println("The list has no consecutive fours");
            }
        }
        else
            System.out.println("The list has no consecutive fours");

    }

    public static boolean isConsecutiveFour(int[] values){
        boolean hasConsecutiveFours = false;
        int count = 0;

        for (int i =1; i < values.length;i++){
            if(values[i] == values[i-1]) {
                count++;
                if(count>=3){
                    hasConsecutiveFours = true;
                }

            } else if (values[i] != values[i-1]) {
                count = 0;
            }

        }
        return hasConsecutiveFours;
    }

}
