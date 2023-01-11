package ProgrammingExercisesCAP7;

import java.util.Scanner;

public class Ejercicio_7_17_SortStudents {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        String[] studentsName = new String[numberOfStudents];
        int[] scores = new int[numberOfStudents];


        System.out.println("Enter the names and scores: ");
        for (int i = 0; i < numberOfStudents;i++){
            System.out.println("Student name: ");
            studentsName[i] = input.next();

            System.out.println("Score: ");
            scores[i] = input.nextInt();
        }

        /**Sort the scores in decreasing */

        int[] scoresToSort = new int[numberOfStudents];
        System.arraycopy(scores,0,scoresToSort,0,numberOfStudents);
        String[] studentsNameToSort = new String[numberOfStudents];

        for (int i = 0; i < scoresToSort.length-1;i++){
            int currentMax = scoresToSort[i];
            int currentMaxIndex = i;

            for (int j = i+1; j < scoresToSort.length; j++){
                if (currentMax < scoresToSort[j]){
                    currentMax = scoresToSort[j];
                    currentMaxIndex = j;
                }
            }

            if(currentMaxIndex != i){
                scoresToSort[currentMaxIndex] = scoresToSort[i];
                scoresToSort[i] = currentMax;
            }
        }

        /**Sote the names in decreasing order of their scores */
        for (int i = 0; i < scores.length;i++){

            for (int j = 0; j < scores.length;j++){
                if(scores[i] == scoresToSort[j]){
                    studentsNameToSort[j] = studentsName[i];
                }
            }

        }

        System.out.println(java.util.Arrays.toString(studentsNameToSort));

    }
}
