package ProgrammingExercisesCAP7;

import java.util.Scanner;

public class Ejercicio_7_27_IdenticalArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter list1 size and contents: ");
        int size1 = input.nextInt();
        int[] list1 = new int[size1];
        for (int i = 0; i < list1.length;i++){
            list1[i] = input.nextInt();
        }

        System.out.println("Enter list2 size and contents: ");
        int size2 = input.nextInt();
        int[] list2 = new int[size2];
        for (int i = 0; i < list2.length;i++){
            list2[i] = input.nextInt();
        }

        if (equals(list1, list2)){
            System.out.println("Two list are identical");
        } else if (!equals(list1, list2)) {
            System.out.println("Two list are not identical");
        }
    }

    public static boolean equals(int[] list1, int[] list2 ){
        boolean equal = false;
        int sum1 = 0;
        int plus1 = 0;

        int sum2 = 0;
        int plus2 = 0;

        if(list1.length == list2.length){
            for (int i = 0; i < list1.length;i++){
                sum1+=list1[i];
                sum2+=list2[i];

                plus1*=list1[i];
                plus2*=list2[i];
            }

            if (sum1 == sum2 && plus1 == plus2){
                equal = true;
            }
        }

        return equal;
    }
}
