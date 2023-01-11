package ProgrammingExercisesCAP8;

public class Ejercicio_8_3_SortStudentsOnGrades {
    public static void main(String[] args) {
        //Students`answers to the questions
        char[][] answers = {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}
        };

        //Key to the questions
        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

        //Grade all answers
        int[] max = new int[answers.length];
        for (int i = 0; i < answers.length; i++) {
            //Grade one student
            int correctCount = 0;

            for (int j = 0; j < answers[i].length; j++) {
                if (answers[i][j] == keys[j]) {
                    correctCount++;
                }
            }
            max[i] = correctCount;
        }

        int[] numberOfStudent = new int[answers.length];

        int[] maxSorted = new int[max.length];
        System.arraycopy(max, 0, maxSorted, 0, maxSorted.length);
        java.util.Arrays.sort(maxSorted);

        for (int i = 0; i < max.length; i++) {
            for (int j = 0; j < max.length; j++) {
                if (maxSorted[i] == max[j]) {
                    numberOfStudent[i] = j;
                    max[j] = 0;
                    break;
                }
            }
        }

        for (int i = 0; i < numberOfStudent.length; i++) {
            System.out.println("Student number " + numberOfStudent[i] + " had " + maxSorted[i]);
        }

    }
}
