package ProgrammingExercisesCAP6;

import java.util.Scanner;

public class Ejercicio_6_17_DisplayMatrixOf0sAnd1s {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Displays an n-by-n matrix");
        System.out.printf("Enter n: ");
        int levels = input.nextInt();
        printMatrix(levels);
    }
    public static int printMatrix(int n){

        for (int x = 1; x<=n;x++){
            //System.out.print(x);
            for (int y = 1;y<=n;y++){
                int a = (int)(Math.random()*2);
                System.out.printf("%2d",a);
            }
            System.out.println(" ");
        }
        return 0;
    }
}
