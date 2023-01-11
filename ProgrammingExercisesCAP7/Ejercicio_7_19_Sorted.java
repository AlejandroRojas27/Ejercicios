package ProgrammingExercisesCAP7;

import java.util.Scanner;

public class Ejercicio_7_19_Sorted {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the size of the list: ");
        int size = input.nextInt();
        int[] list = new int[size]; //{10, 1, 5, 16, 61, 9, 11, 1};
        System.out.println("Enter the contents of the list: ");
        for (int i = 0; i< list.length;i++){
            list[i] = input.nextInt();
        }

        System.out.println("The list has " + size + " integers " + java.util.Arrays.toString(list));
        if(isSorted(list)){
            System.out.println("The list is already sorted");
        }
        else
            System.out.println("The list is not sorted");

    }

    public static boolean isSorted(int[] list){
        boolean sorted = true;

        int[] x = new int[list.length];
        System.arraycopy(list,0,x,0,list.length);

        java.util.Arrays.sort(list);

        for (int i = 0;i < list.length;i++){
            if(x[i] == list[i]){
                sorted = true;
            }
            else
                sorted = false;
        }

        return sorted;
    }
}
