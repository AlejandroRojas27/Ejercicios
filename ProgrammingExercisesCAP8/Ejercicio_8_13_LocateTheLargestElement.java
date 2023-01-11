package ProgrammingExercisesCAP8;

import java.util.Scanner;

public class Ejercicio_8_13_LocateTheLargestElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of rows and columns of the array: ");
        int rows = input.nextInt();
        int columns = input.nextInt();

        double[][] matrix = new double[rows][columns];

        System.out.println("Enter the array: ");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }

        /*
        double[][] matrix = {{23.5, 35, 2, 10},
                             {4.5, 3, 45, 3.5},
                             {35, 44, 5.5, 9.6}};

         */


        System.out.println("The location of the largest element is at: " + java.util.Arrays.toString(locateLargest(matrix)));
    }

    public static int[] locateLargest(double[][] a){

        int[] x = new int[2];

        double max = 0;

        for (int i = 0; i < a.length; i++){

            for (int j = 0; j < a[i].length; j++) {

                if(a[i][j] > max){
                    x[0] = i;
                    x[1] = j;
                    max = a[i][j];
                }

            }
        }

        return x;
    }
}
