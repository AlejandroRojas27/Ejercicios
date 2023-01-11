package ProgrammingExercisesCAP11;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio_11_4_MaximumElementInArrayList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        int sentinel;

        do {
            System.out.println("Enter a number (Prompt en with 0): ");
            sentinel = input.nextInt();
            if (sentinel == 0) {
                break;
            }

            list.add(sentinel);

        } while (sentinel > 0);


        System.out.println("Max number in the list is: " + max(list));

        System.out.println(list);


    }

    public static Integer max(ArrayList<Integer> list) {
        if (list.isEmpty()) {
            return null;
        } else {
            int max = 0;
            for (Integer integer : list) {
                if (integer > max) {
                    max = integer;
                }
            }


            return max;
        }
    }
}
