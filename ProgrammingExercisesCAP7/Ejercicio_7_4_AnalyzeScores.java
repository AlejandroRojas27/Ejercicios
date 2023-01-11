package ProgrammingExercisesCAP7;

import java.util.Scanner;

public class Ejercicio_7_4_AnalyzeScores {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] scores = new int[100];
        System.out.println("Enter the scores");

        for (int i = 0; i < scores.length;i++){
            scores[i] = input.nextInt();
            if (scores[i] < 0)
                break;
        }


        //Averange
        int average = 0;
        int count = 0;
        int sum = 0;
        for (int i = 0; i < scores.length;i++){
            if (scores[i] >= 0 && scores[i] != 0) {
                sum+=scores[i];
                count++;
            }
            average = sum / count;
        }

        //How many scores are above or equal to the average
        int countAboveOrEqual = 0;
        for (int i = 0; i < scores.length;i++){
            if(scores[i] >= average) {
                countAboveOrEqual++;
            }
        }
        System.out.println("How many scores are above or equal to the average: " + countAboveOrEqual);

        //How many scores are below the average
        int countBelowAverage = 0;
        for (int i = 0; i < scores.length;i++){
            if(scores[i] < average && scores[i] > 0) {
                countBelowAverage++;
            }
        }
        System.out.println("How many scores are below the average: " + countBelowAverage);

    }
}
