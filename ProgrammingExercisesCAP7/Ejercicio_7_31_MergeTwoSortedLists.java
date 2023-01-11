package ProgrammingExercisesCAP7;

import java.util.Scanner;

public class Ejercicio_7_31_MergeTwoSortedLists {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter list1 size and contents: " );
        int size1 = input.nextInt();
        int[] list1 = new int[size1];//{1, 5, 16, 61, 111};
        for (int i = 0; i < list1.length;i++){
            list1[i] = input.nextInt();
        }

        System.out.print("Enter list1 size and contents: " );
        int size2 = input.nextInt();
        int[] list2 = new int[size2];//{1, 5, 16, 61, 111};
        for (int i = 0; i < list2.length;i++){
            list2[i] = input.nextInt();
        }


        java.util.Arrays.sort(list1);
        java.util.Arrays.sort(list2);

        System.out.println("list1 is ");
        for (int i = 0;i < list1.length; i++){
            System.out.print(list1[i] + " ");
        }
        System.out.println(" ");

        System.out.println("list2 is ");
        for (int i = 0;i < list2.length; i++){
            System.out.print(list2[i] + " ");
        }
        System.out.println(" ");


        System.out.print("The merge list is ");
        for (int i = 0; i < merge(list1, list2).length;i++){
            System.out.print(merge(list1, list2)[i] + " ");
        }


    }

    public static int[] merge(int[] list1, int[] list2){
        int[] merge = new int[list1.length + list2.length];

        for (int i=0;i< merge.length;i++){
            if(i < list1.length){
                merge[i] = list1[i];
            }
            else if (i >= list1.length){
                merge[i] = list2[(i - list1.length)];
            }
        }

        java.util.Arrays.sort(merge);

        return merge;
    }
}
