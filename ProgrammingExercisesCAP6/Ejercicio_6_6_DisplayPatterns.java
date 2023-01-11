package ProgrammingExercisesCAP6;

import java.util.Scanner;

public class Ejercicio_6_6_DisplayPatterns {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Pattern with levels: ");
        int num = input.nextInt();

        displayPattern(num);
    }

    public static void displayPattern(int n){
        int x = 0;
        int y = 0;
        int z = 0;
        for (x = 1;x<=n;x++){
            //Espacios
            for (y=n-1;y>=x;y--){
                System.out.print(" ");
            }
            for (z=x;z>0;z--){
                System.out.print(z);
            }
            System.out.println(" ");
        }
    }
}
