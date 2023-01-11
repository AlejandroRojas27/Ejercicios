package ProgrammingExercisesCAP6;

import java.util.Scanner;

public class Ejercicio_6_4_DisplayAnIntegerReversed {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        reverse(number);
    }

    public static void reverse(int number){
        int x = Ejercicio_6_3_Palindrome_integer.reverse(number);
        System.out.println("Number in reverse is: " + x);
    }

}
