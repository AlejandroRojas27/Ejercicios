package ProgrammingExercisesCAP11;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio_11_14_CombineTwoLists {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> list1 = new ArrayList<>(); //3 5 45 4 3
        System.out.print("Enter five integers for list1: ");
        for (int i = 1; i <= 5; i++) {
            list1.add(input.nextInt());
        }


        ArrayList<Integer> list2 = new ArrayList<>(); //33 51 5 4 13

        System.out.print("Enter five integers for list2: ");
        for (int i = 1; i <= 5; i++) {
            list2.add(input.nextInt());
        }

        System.out.print("The combined list is ");
        ArrayList<Integer> ans = union(list1, list2);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }

    }

    public static ArrayList<Integer> union( ArrayList<Integer> list1, ArrayList<Integer> list2){

        for (int i = 0; i < list2.size(); i++) {
            list1.add(list2.get(i));
        }

        return list1;
    }
}
