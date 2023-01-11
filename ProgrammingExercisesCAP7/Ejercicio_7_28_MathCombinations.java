package ProgrammingExercisesCAP7;

import java.util.Scanner;

public class Ejercicio_7_28_MathCombinations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 10 integers");
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length;i++){
            numbers[i] = input.nextInt();
        }

        for (int i = 0;i<numbers.length;i++){

            for (int j = 0;j< numbers.length;j++){
                if(numbers[i] != numbers[j]) {
                    System.out.println("(" + numbers[i] + ", " + numbers[j] + ")");
                }
            }
        }



    }

}
