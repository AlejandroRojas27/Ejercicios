package ProgrammingExercisesCAP11;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio_11_16_AdditionQuiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1 = (int)(Math.random() * 10);
        int number2 = (int)(Math.random() * 10);
        ArrayList<Integer> answerList = new ArrayList<>();


        System.out.print("What is " + number1 + " + " + number2 + "? ");
        for (int i = 0; i < 1; ) {
            int answer = input.nextInt();
            if (answerList.contains(answer)) {
                System.out.println("You already entered " + answer);
            }

            answerList.add(answer);

            if (number1 + number2 == answer) {
                i++;
                System.out.println("You got it!");
            } else {
                System.out.print("WWrong answer. Try again. What is " + number1 + " + " + number2 + "? ");
            }
        }


    }
}
