package ProgrammingExercisesCAP8;

import java.util.Scanner;

public class Ejercicio_8_21_CentralCity {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of cities: ");
        int cities = input.nextInt();

        double[][] coordinates = new double[cities][2];
        System.out.println("Enter the coordinates of the cities: ");
        for (int i = 0; i < coordinates.length; i++) {
            coordinates[i][0] = input.nextDouble();
            coordinates[i][1] = input.nextDouble();
        }


        checkDistance(coordinates);

    }

    public static void checkDistance(double[][] m) {
        double minDist = 0;
        int minIndex = 0;

        for (int i = 0; i < m.length; i++) {

            double sum = 0;
            double x1 = m[i][0];
            double y1 = m[i][1];

            for (int j = 0; j < m.length; j++) {
                if (i == j) {
                    continue;
                }
                double x2 = m[j][0];
                double y2 = m[j][1];

                sum += computeDistance(x1, y1, x2, y2);

            }

            if (i == 0) {
                minDist = sum;
            }

            if (sum < minDist) {
                minDist = sum;
                minIndex = i;
            }

        }

        System.out.printf("The central city is at (%2.1f , %2.1f)\n", m[minIndex][0], m[minIndex][1]);
        System.out.printf("The total distance to all other cities is %2.2f ", minDist);


    }

    public static double computeDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt((Math.pow((x2 - x1), 2)) + (Math.pow((y2 - y1), 2)));
    }
}
