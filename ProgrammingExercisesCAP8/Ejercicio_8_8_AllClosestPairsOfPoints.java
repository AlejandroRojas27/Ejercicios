package ProgrammingExercisesCAP8;

import java.util.Scanner;

public class Ejercicio_8_8_AllClosestPairsOfPoints {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of points: ");
        int numberOfPoints = 8;//input.nextInt();

        //Create an array to store points
        double[][] points = new double[numberOfPoints][2];//{{0, 0}, {1,1}, {-1, -1}, {2, 2}, {-2, -2}, {-3, -3}, {-4, -4}, {5, 5}};//


        System.out.print("Enter " + numberOfPoints + " points: ");
        for (int i = 0; i < points.length; i++) {
            points[i][0] = input.nextDouble(); // Point in X
            points[i][1] = input.nextDouble(); // Point in Y
        }


        System.out.println(" ");

        // p1 and p2 are the indices in the points' array
        int p1 = 0, p2 = 1; //Initial two points
        double shortestDistance = distance(points[p1][0], points[p1][1],
                points[p2][0], points[p2][1]); //Initialize shortestDistance


        //Computer distance for every two points
        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                double distance = distance(points[i][0], points[i][1],
                        points[j][0], points[j][1]); //Find distance

                if (shortestDistance > distance) {
                    p1 = i; //Update p1
                    p2 = j; //Update p2
                    shortestDistance = distance; // Update shortestDistance
                }
            }

        }

        //Display results
        for (int i = 0; i < points.length; i++) {
            for (int j = i; j < points.length; j++) {
                double distance = distance(points[i][0], points[i][1],
                        points[j][0], points[j][1]); //Find distance

                if (distance == shortestDistance) {
                    System.out.println("The closest two points are (" + points[i][0] + ", " + points[i][1] +
                            ") and (" + points[j][0] + ", " + points[j][1] + ")");
                }
            }

        }
        System.out.println("Their distance is " + shortestDistance);

    }

    /**
     * Compute the distance between two points (x1, y1) and (x2, y2)
     */
    public static double distance(
            double x1, double y1, double x2, double y2) {
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }
}
