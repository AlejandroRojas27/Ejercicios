package ProgrammingExercisesCAP7;

import java.util.Scanner;

public class Ejercicio_7_26_StrictlyIdenticalArrays {
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
            System.out.println("Two list are strictly identical");
        } else if (!equals(list1, list2)) {
            System.out.println("Two list are not strictly identical");
        }
    }

    public static boolean equals(int[] list1, int[] list2 ){
        boolean equal = false;
        int count =0;

        if(list1.length == list2.length) {
            for (int i = 1; i < list1.length; i++){
                if(list1[i] != list2[i])
                    count++;
            }

            if(count == 0)
                equal = true;
        }

        return equal;
        //return java.util.Arrays.equals(list1, list2);
    }
}
