package ProgrammingExercisesCAP11;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio_11_12_SumArrayList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Double> list = new ArrayList<>();

        System.out.println("Enter 5 double numbers");
        for (int i = 1; i <= 5; i++) {
            System.out.print("No. " + i + ": ");
            list.add(input.nextDouble());
        }

        double ans = sum(list);
        System.out.println("Their sum is " + ans);

    }

    public static double sum(ArrayList<Double> list) {
        double sum = 0;

        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }

        return sum;
    }
}
