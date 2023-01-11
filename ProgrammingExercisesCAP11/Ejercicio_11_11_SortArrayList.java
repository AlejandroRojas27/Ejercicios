package ProgrammingExercisesCAP11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio_11_11_SortArrayList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Enter 5 integers: ");
        for (int i = 1; i <= 5; i++) {
            System.out.print("No " + i + ": ");
            list.add(input.nextInt());
        }


        System.out.println(list);

        sort(list);
    }

    public static void sort(ArrayList<Integer> list) {

        int size = list.size();
        for (int i = 0; i < size; i++) {
            int min = Collections.min(list);
            System.out.println(min);
            list.remove((Integer) min);
        }

    }
}
