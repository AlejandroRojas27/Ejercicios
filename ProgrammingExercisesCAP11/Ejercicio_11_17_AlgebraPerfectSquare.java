package ProgrammingExercisesCAP11;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio_11_17_AlgebraPerfectSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer m: ");
        int m = input.nextInt();
        ArrayList<Integer> factors = findFactors(m);

        ArrayList<Integer> n = n(factors);

        int answer = 1;
        for (Integer num : n) {
            answer *= num;
        }

        System.out.println("The smallest number n for m * n to be a perfect square is " + answer);


        System.out.println("m * n is " + (answer * m));


    }

    public static ArrayList<Integer> findFactors(int num) {
        ArrayList<Integer> list = new ArrayList<>();
        int factor = 2;

        while (num > 1) {
            if (num % factor == 0) {
                num /= factor;
                list.add(factor);
            } else if (num % factor != 0) {
                factor++;
            }
        }

        return list;
    }

    public static ArrayList<Integer> n(ArrayList<Integer> factors) {
        ArrayList<Integer> n = new ArrayList<>();

        for (int i = 0; i < factors.size(); i++) {

            if (appearAnOddNumberOfTimes(factors.get(i), factors)) {

                if (!n.contains(factors.get(i))) {
                    n.add(factors.get(i));
                }

            }

        }

        return n;
    }

    public static boolean appearAnOddNumberOfTimes(int num, ArrayList<Integer> factors) {

        int count = 0;
        for (Integer factor : factors) {
            if (factor == num) {
                count++;
            }
        }

        return count % 2 != 0;

    }
}
