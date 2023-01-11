package ProgrammingExercisesCAP11;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio_11_13_RemoveDuplicates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter 10 integers: ");
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(input.nextInt());
        }


        /*
        list.add(34);
        list.add(5);
        list.add(3);
        list.add(5);
        list.add(6);
        list.add(4);
        list.add(33);
        list.add(2);
        list.add(2);
        list.add(4);

         */

        System.out.print("The distinct integers are ");
        removeDuplicate(list);
    }

    public static void removeDuplicate(ArrayList<Integer> list) {
        ArrayList<Integer> unique = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if(!unique.contains(list.get(i))){
                unique.add(list.get(i));
            }
        }

        for (int i = 0; i < unique.size(); i++) {
            System.out.print(unique.get(i) + " ");
        }

        //System.out.println(unique);
    }
}
