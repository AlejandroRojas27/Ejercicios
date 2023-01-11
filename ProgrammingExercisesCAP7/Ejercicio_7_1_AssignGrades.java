package ProgrammingExercisesCAP7;

import java.util.Scanner;

public class Ejercicio_7_1_AssignGrades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Number of students: ");
        int students = input.nextInt();

        System.out.println("Scores: ");
        int[] scores = new int[students];
        for (int i = 0;i<scores.length;i++){
            scores[i] = input.nextInt();
        }

        int best = scores[0];
        for (int i = 0;i<scores.length;i++){
            if (best < scores[i])
                best = scores[i];
        }

        for (int i = 0;i<scores.length;i++){
            char grade = ' ';
            if (scores[i] >= (best-10))
                grade = 'A';
            else if (scores[i] >= (best-20))
                grade = 'B';
            else if (scores[i] >= (best-30))
                grade = 'C';
            else if (scores[i] >= (best-40))
                grade = 'D';
            else
                grade = 'F';

            System.out.println("Student " + i + " score is " + scores[i] + " and grade is " + grade);
        }


    }
}
