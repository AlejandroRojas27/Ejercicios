package ProgrammingExercisesCAP8;

import java.util.Scanner;

public class Ejercicio_8_29_IdenticalArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter list1: ");
        int[][] list1 = new int[3][3];
        for (int i = 0; i < list1.length; i++) {
            for (int j = 0; j < list1[i].length; j++) {
                list1[i][j] = input.nextInt();
            }
        }


        System.out.print("Enter list2: ");
        int[][] list2 = new int[3][3];
        for (int i = 0; i < list2.length; i++) {
            for (int j = 0; j < list2[i].length; j++) {
                list2[i][j] = input.nextInt();
            }
        }




        if (!equals(list1, list2)) {
            System.out.println("The two arrays are not identical");
        } else
            System.out.println("The two arrays are identical");
    }

    public static boolean equals(int[][] m1, int[][] m2) {
        int sum1 = 0;
        int mult1 = 1;

        int sum2 = 0;
        int mult2 = 1;

        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                sum1 += m1[i][j];
                mult1 *= m1[i][j];

                sum2 += m2[i][j];
                mult2 *= m2[i][j];
            }
        }

        return sum1 == sum2 && mult1 == mult2;
    }
}
