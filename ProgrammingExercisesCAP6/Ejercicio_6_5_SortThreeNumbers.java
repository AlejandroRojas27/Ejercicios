package ProgrammingExercisesCAP6;

import java.util.Scanner;

public class Ejercicio_6_5_SortThreeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Promt three numbers to sort: ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();

        displaySortedNumbers(num1, num2, num3);
    }

    public static void displaySortedNumbers(double num1, double num2, double num3){
        double n1 = 0;
        double n2 = 0;
        double n3 = 0;

        if (num1 > num2 && num1 > num3){
            n1 = num1;
        }
        else if (num2 > num1 && num2 > num3){
            n1 = num2;
        }
        else if (num3 > num1 && num3 > num2){
            n1 = num3;
        }

        if (num1 < num2 && num1 < num3){
            n3 = num1;
        }
        else if (num2 < num1 && num2 < num3){
            n3 = num2;
        }
        else if (num3 < num1 && num3 < num2){
            n3 = num3;
        }

        if ((num1 > num2 && num1 < num3) ||(num1 < num2 && num1 > num3)){
            n2 = num1;
        }
        else if ((num2 > num1 && num2 < num3) ||(num2 < num1 && num2 > num3)){
            n2 = num2;
        }
        else if ((num3 > num1 && num3 < num2) ||(num3 < num1 && num3 > num2)){
            n2 = num3;
        }



        System.out.println("Numbers in increasing order: " + n1 + ", " + n2 + ", "+ n3);
        //System.out.println("n1: " + n1 + " n3: " + n3);

    }
}
