package ProgrammingExercisesCAP7;

import java.util.Scanner;

public class Ejercicio_7_15_EliminateDuplicates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 10 nubers: ");

        int[] numbers = new int[10];//{1, 2, 3, 2, 1, 6, 3, 4, 5, 2};

        for (int i = 0; i < numbers.length; i++){
            numbers[i] = input.nextInt();
        }
        eliminateDuplicates(numbers);

        System.out.println("The distinct numbers are: ");
        for (int i = 0; i < eliminateDuplicates(numbers).length; i++){
            System.out.print(eliminateDuplicates(numbers)[i] + " ");
        }

    }

    public static int[] eliminateDuplicates(int[] list){
        int[] countDistinct = new int[10];
        int[] x = new int[10];
        for (int i = 0; i < list.length;i++){
            for (int j = 0; j < list.length;j++){
                if(list[i] == list[j]) {
                    countDistinct[i]++;
                }

                if(countDistinct[i] == 1 && countDistinct[j] == 0){
                    x[i] = list[i];
                }
            }
        }

        int count = 0;
        for (int i = 0; i < x.length;i++){
            if(x[i] > 0)
                count++;
        }

        int[] uniqueDigits = new int[count];

        for (int i = 0,j=0; i < x.length;i++){
            if(x[i] > 0) {
                uniqueDigits[j] = x[i];
                j++;
            }
        }

        return uniqueDigits;
    }
}
