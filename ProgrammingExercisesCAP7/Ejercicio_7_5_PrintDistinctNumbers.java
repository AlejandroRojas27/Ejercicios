package ProgrammingExercisesCAP7;

import java.util.Scanner;

public class Ejercicio_7_5_PrintDistinctNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter 10 number: ");

        int[] numbers = new int[10]; //{1, 2, 3, 2, 1, 6, 3, 4, 5, 2};


        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }


        /** To count the numbers */
        int[] x = countDistinct(numbers);

        /** To organize the distinct numbers */
        int[] distinctNumbers = organizeNumbers(x);

        /** To print the questions */
        printNumbers(distinctNumbers);

    }

    public static int[] countDistinct(int[] numbers){
        int[] countDistinct = new int[10];
        int[] x = new int[10];
        for (int i = 0; i< numbers.length; i++){
            for (int j = 0; j< numbers.length; j++){
                if (numbers[i] == numbers[j]){
                    countDistinct[i]++;
                }

                if(countDistinct[i] == 1 && countDistinct[j] == 0){
                    x[i] = numbers[i];
                }
            }
        }

        return x;
    }

    public static int[] organizeNumbers(int[] x){
        int count = 0;

        /** Foreach loop  - asigna un index inicial y muestra el valor del array dado, el index es consecutivo*/

        for (int a : x){
            if (a > 0)
                count++;
        }
        //loop para contar los valores que no sean 0, se puede usar en lugar del foreach, igual es valido
        /*

        for (int i = 0;i < x.length;i++){
            if(x[i]>0)
                count++;
        }

         */

        int[] distinctNumbers = new int[count];
        for (int i = 0, j =0;i < x.length;i++){
            if(x[i] > 0) {
                distinctNumbers[j] = x[i];
                j++;
            }
        }

        //Sort numbers
        java.util.Arrays.sort(distinctNumbers);

        return distinctNumbers;

    }

    public static void printNumbers(int[] distinctNumbers){
        System.out.println("The number of distinct numbers is " + distinctNumbers.length);

        System.out.print("The distinct numbers are: ");
        for (int i = 0; i < distinctNumbers.length; i++){
            System.out.print(distinctNumbers[i] + " ");
        }

    }

}
